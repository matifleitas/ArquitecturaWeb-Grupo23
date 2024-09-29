package JDBCBasic.Factory;

import JDBCBasic.RepositoryImplement.CarreraRepositoryImpl;
import JDBCBasic.RepositoryImplement.EstudianteCarreraRepositoryImpl;
import JDBCBasic.RepositoryImplement.EstudianteRepositoryImplement;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

    public abstract class FactoryEntityManager {
        protected EntityManager em;
        private EntityManagerFactory emf;

        public FactoryEntityManager(){
            this.emf = Persistence.createEntityManagerFactory("mysql2");
            this.em = emf.createEntityManager();
        }

        public static FactoryEntityManager getInstance(String base) {

            if("MYSQL".equalsIgnoreCase(base)){
                return MySQLEntityManagerFactory.getInstance();
            }
            return null;

        }

        public abstract EstudianteRepositoryImplement getEstudianteRepositoryImplement();
        public abstract CarreraRepositoryImpl getCarreraRepositoryImplement();
        public abstract EstudianteCarreraRepositoryImpl getEstudianteCarreraRepositoryImplement();
    }
