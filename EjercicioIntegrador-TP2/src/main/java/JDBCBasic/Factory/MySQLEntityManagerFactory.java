package JDBCBasic.Factory;

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
}
