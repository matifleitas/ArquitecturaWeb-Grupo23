package JDBCBasic;


import JDBCBasic.DTO.EstudianteCarreraDTO;
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
        Carrera c2 = new Carrera("ING.SISTEMAS");
        Carrera c3 = new Carrera("TURISMO");


        Estudiante e1 = new Estudiante("Florencia", "Vivar", 31, "Femenino", 37944511, 10000L, "Tandil", 2);
        Estudiante e2 = new Estudiante("Matías", "Fleitas", 29, "Masculino", 23456789, 10001L, "Buenos Aires", 3);
        Estudiante e3 = new Estudiante("Pía", "Bedini", 26, "Femenino", 34567890, 10002L, "La Plata", 1);
        Estudiante e4 = new Estudiante("Santiago", "Cusato", 28, "Masculino", 45678901, 10003L, "Córdoba", 4);
        Estudiante e5 = new Estudiante("Carola", "Pérez", 27, "Femenino", 56789012, 10004L, "Tandil", 2);

        //A)
//        estudianteRepositoryImplement.insertarEstudiante(e1);
//        estudianteRepositoryImplement.insertarEstudiante(e2);
//        estudianteRepositoryImplement.insertarEstudiante(e3);
//        estudianteRepositoryImplement.insertarEstudiante(e4);
//        estudianteRepositoryImplement.insertarEstudiante(e5);
//
//        carreraRepositoryImplement.insertarCarrera(c1);
//        carreraRepositoryImplement.insertarCarrera(c2);
//        carreraRepositoryImplement.insertarCarrera(c3);

        LocalDate fechaComienzo = LocalDate.of(2024, 10, 2); // Crear la fecha
        LocalDate fechaComienzo2 = LocalDate.of(2020, 10, 2); // Crear la fecha
        LocalDate fechaGraduacion = LocalDate.of(2021, 10, 2); // Crear la fecha
        LocalDate fechaGraduacion2 = LocalDate.of(2023, 10, 2); // Crear la fecha

        EstudianteCarrera ec = new EstudianteCarrera(c2, e1, fechaComienzo, true, fechaGraduacion2);
        EstudianteCarrera ec1 = new EstudianteCarrera(c1, e2, fechaComienzo, false, fechaGraduacion);
        EstudianteCarrera ec2 = new EstudianteCarrera(c3, e3, fechaComienzo, true, fechaGraduacion);
        EstudianteCarrera ec3 = new EstudianteCarrera(c2, e4, fechaComienzo, false, fechaGraduacion2);

        //B)
//      estudianteCarreraRepositoryImpl.insertarEstudianteCarrera(ec);
//      estudianteCarreraRepositoryImpl.insertarEstudianteCarrera(ec1);
//      estudianteCarreraRepositoryImpl.insertarEstudianteCarrera(ec2);
//      estudianteCarreraRepositoryImpl.insertarEstudianteCarrera(ec3);

        //C)
        estudianteRepositoryImplement.getAllEstudiantesOrdenadoPorEdad();

        //D)
        estudianteRepositoryImplement.getEstudiantePorLegajo(10001L);

        //E)
        estudianteRepositoryImplement.getAllEstudiantesPorGenero("Masculino");

        //F)
        estudianteCarreraRepositoryImpl.getCarrerasConInscriptos();

        //G)
        carreraRepositoryImplement.getEstudiantesPorCiudad("Cordoba", "TUDAI");

        estudianteRepositoryImplement.getAllEstudiantesPorCiudad("Tandil");

    }
}