package JDBCBasic;


import JDBCBasic.Entities.*;
import JDBCBasic.Factory.FactoryEntityManager;
import JDBCBasic.RepositoryImplement.*;


public class Main {
    public static void main(String[] args) {

        FactoryEntityManager mysqlFactory = FactoryEntityManager.getInstance("MYSQL");

        EstudianteRepositoryImplement EstudianteRepositoryImplement = mysqlFactory.getEstudianteRepositoryImplement();

        Carrera c1 = new Carrera("TUDAI");

        Estudiante s1 = new Estudiante("Florencia", "Vivar", 31, "Femenino",37944511, 10000L, "Tandil",2 );
        Estudiante s2 = new Estudiante("Matías", "Fleitas", 29, "Masculino", 23456789, 10001L, "Buenos Aires", 3);
        Estudiante s3 = new Estudiante("Pía", "Bedini", 26, "Femenino", 34567890, 10002L, "La Plata", 1);
        Estudiante s4 = new Estudiante("Santiago", "Cusato", 28, "Masculino", 45678901, 10003L, "Córdoba", 4);
        Estudiante s5 = new Estudiante("Carola", "Pérez", 27, "Femenino", 56789012, 10004L, "Mendoza", 2);

//        CarreraRepositoryImpl.insertarCarrera(c1); A CHEQUEAR
        EstudianteRepositoryImplement.insertarEstudiante(s1);
        EstudianteRepositoryImplement.insertarEstudiante(s2);
        EstudianteRepositoryImplement.insertarEstudiante(s3);
        EstudianteRepositoryImplement.insertarEstudiante(s4);
        EstudianteRepositoryImplement.insertarEstudiante(s5);


    }
}