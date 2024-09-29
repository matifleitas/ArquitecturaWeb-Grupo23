package JDBCBasic.Factory;

import JDBCBasic.RepositoryImplement.CarreraRepositoryImpl;
import JDBCBasic.RepositoryImplement.EstudianteCarreraRepositoryImpl;
import JDBCBasic.RepositoryImplement.EstudianteRepositoryImplement;
import jakarta.persistence.EntityManagerFactory;


public class MySQLEntityManagerFactory extends FactoryEntityManager {

    private static MySQLEntityManagerFactory instance;

    private MySQLEntityManagerFactory() {
        super();
    }

    public static MySQLEntityManagerFactory getInstance() {
        if (instance == null) {
            instance = new MySQLEntityManagerFactory();
        }
        return instance;
    }

    @Override
    public EstudianteRepositoryImplement getEstudianteRepositoryImplement() {
        return new EstudianteRepositoryImplement(this.em);
    }

    @Override
    public CarreraRepositoryImpl getCarreraRepositoryImplement() {
        return new CarreraRepositoryImpl(this.em);
    }

    @Override
    public EstudianteCarreraRepositoryImpl getEstudianteCarreraRepositoryImplement(){
        return new EstudianteCarreraRepositoryImpl(this.em);
    }
}
