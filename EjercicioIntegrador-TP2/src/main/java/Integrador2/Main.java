package Integrador2;


import Integrador2.Entities.*;
import Integrador2.Factory.FactoryEntityManager;
import Integrador2.RepositoryImplement.*;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

        FactoryEntityManager mysqlFactory = FactoryEntityManager.getInstance("MYSQL");

        EstudianteRepositoryImplement estudianteRepositoryImplement = mysqlFactory.getEstudianteRepositoryImplement();
        CarreraRepositoryImpl carreraRepositoryImplement = mysqlFactory.getCarreraRepositoryImplement();
        EstudianteCarreraRepositoryImpl estudianteCarreraRepositoryImpl = mysqlFactory.getEstudianteCarreraRepositoryImplement();

        Carrera c1 = new Carrera("TUDAI");
        Carrera c2 = new Carrera("ING.SISTEMAS");
        Carrera c3 = new Carrera("TURISMO");
        Carrera c4 =new Carrera("ECONOMICAS");

        Estudiante e1 = new Estudiante("Florencia", "Vivar", 31, "Femenino", 37944511, 10000L, "Tandil", 2);
        Estudiante e2 = new Estudiante("Matías", "Fleitas", 29, "Masculino", 23456789, 10001L, "Buenos Aires", 3);
        Estudiante e3 = new Estudiante("Pía", "Bedini", 26, "Femenino", 34567890, 10002L, "La Plata", 1);
        Estudiante e4 = new Estudiante("Santiago", "Cusato", 28, "Masculino", 45678901, 10003L, "Córdoba", 4);
        Estudiante e5 = new Estudiante("Carola", "Pérez", 27, "Femenino", 56789012, 10004L, "Tandil", 2);

        //A) Dar de alta un estudiante
        estudianteRepositoryImplement.insertarEstudiante(e1);
        estudianteRepositoryImplement.insertarEstudiante(e2);
        estudianteRepositoryImplement.insertarEstudiante(e3);
        estudianteRepositoryImplement.insertarEstudiante(e4);
        estudianteRepositoryImplement.insertarEstudiante(e5);
        //Dar de alta una carrera
        carreraRepositoryImplement.insertarCarrera(c1);
        carreraRepositoryImplement.insertarCarrera(c2);
        carreraRepositoryImplement.insertarCarrera(c3);
        carreraRepositoryImplement.insertarCarrera(c4);

        LocalDate fechaComienzo = LocalDate.of(2024, 10, 2);
        LocalDate fechaComienzo2 = LocalDate.of(2020, 10, 2);
        LocalDate fechaGraduacion = LocalDate.of(2026, 10, 2);
        LocalDate fechaGraduacion2 = LocalDate.of(2023, 10, 2);

        EstudianteCarrera ec = new EstudianteCarrera(c2, e1, fechaComienzo, true, fechaGraduacion2);
        EstudianteCarrera ec1 = new EstudianteCarrera(c1, e2, fechaComienzo2, true, fechaGraduacion);
        EstudianteCarrera ec2 = new EstudianteCarrera(c3, e3, fechaComienzo, true, fechaGraduacion);
        EstudianteCarrera ec3 = new EstudianteCarrera(c2, e4, fechaComienzo2, false, fechaGraduacion2);

        //B)Matricular un estudiante en una carrera
        estudianteCarreraRepositoryImpl.insertarEstudianteCarrera(ec);
        estudianteCarreraRepositoryImpl.insertarEstudianteCarrera(ec1);
        estudianteCarreraRepositoryImpl.insertarEstudianteCarrera(ec2);
        estudianteCarreraRepositoryImpl.insertarEstudianteCarrera(ec3);

        //2.C) Recuperar todos los estudiantes, y especificar algún criterio de ordenamiento simple. (Todos los estudiantes ordenados por edad)
        System.out.println("-----------------2 C-------------------------------");
        estudianteRepositoryImplement.getAllEstudiantesOrdenadoPorEdad();

        //2.D) Recuperar un estudiante, en base a su número de libreta universitaria.
        System.out.println("-----------------2 D-------------------------------");
        estudianteRepositoryImplement.getEstudiantePorLegajo(10001L);

        //2.E) Recuperar todos los estudiantes, en base a su género.
        System.out.println("-----------------2 E-------------------------------");
        estudianteRepositoryImplement.getAllEstudiantesPorGenero("Masculino");

        //2. F) Recuperar las carreras con estudiantes inscriptos, y ordenar por cantidad de inscriptos.
        System.out.println("-----------------2 F-------------------------------");
        estudianteCarreraRepositoryImpl.getCarrerasConInscriptos();

        //2.G) Recuperar los estudiantes de una determinada carrera, filtrado por ciudad de residencia.
        System.out.println("-----------------2 G-------------------------------");
        carreraRepositoryImplement.getEstudiantesPorCiudad("Cordoba", "TUDAI");

        //Extra: Recuperar todos los estudiantes de una ciudad determinada
        estudianteRepositoryImplement.getAllEstudiantesPorCiudad("Tandil");

        System.out.println("----------------3) REPORTES DE CARRERAS -------------------------------");
        estudianteCarreraRepositoryImpl.getReportes();
    }
}