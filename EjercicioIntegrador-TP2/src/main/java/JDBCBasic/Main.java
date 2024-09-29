package JDBCBasic;


import JDBCBasic.DTO.EstudianteDTO;
import JDBCBasic.Entities.*;
import JDBCBasic.Factory.FactoryEntityManager;
import JDBCBasic.RepositoryImplement.*;
import java.time.LocalDate;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        FactoryEntityManager mysqlFactory = FactoryEntityManager.getInstance("MYSQL");

        EstudianteRepositoryImplement estudianteRepositoryImplement = mysqlFactory.getEstudianteRepositoryImplement();
        CarreraRepositoryImpl carreraRepositoryImplement = mysqlFactory.getCarreraRepositoryImplement();
        EstudianteCarreraRepositoryImpl estudianteCarreraRepositoryImpl = mysqlFactory.getEstudianteCarreraRepositoryImplement();

        Carrera c1 = new Carrera("TUDAI");

        Estudiante[] estudiantes = {
                new Estudiante("Florencia", "Vivar", 31, "Femenino", 37944511, 10000L, "Tandil", 2),
                new Estudiante("Matías", "Fleitas", 29, "Masculino", 23456789, 10001L, "Buenos Aires", 3),
                new Estudiante("Pía", "Bedini", 26, "Femenino", 34567890, 10002L, "La Plata", 1),
                new Estudiante("Santiago", "Cusato", 28, "Masculino", 45678901, 10003L, "Córdoba", 4),
                new Estudiante("Carola", "Pérez", 27, "Femenino", 56789012, 10004L, "Mendoza", 2)
        };

        carreraRepositoryImplement.insertarCarrera(c1);

        LocalDate fechaComienzo = LocalDate.of(2024, 10, 2); // Crear la fecha
        for (Estudiante estudiante : estudiantes) {

            estudianteRepositoryImplement.insertarEstudiante(estudiante);

            EstudianteCarrera estudianteCarrera = new EstudianteCarrera(c1, estudiante, fechaComienzo, false, null);

            estudianteCarreraRepositoryImpl.insertarEstudianteCarrera(estudianteCarrera);

        }
        carreraRepositoryImplement.getEstudiantesPorCiudad("Cordoba", "TUDAI");
    }
}