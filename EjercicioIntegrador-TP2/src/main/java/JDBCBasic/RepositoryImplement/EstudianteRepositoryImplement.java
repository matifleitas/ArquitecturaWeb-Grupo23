package JDBCBasic.RepositoryImplement;

import JDBCBasic.Entities.Estudiante;
import JDBCBasic.Repository.EstudianteRepository;
import jakarta.persistence.EntityManager;

import java.util.List;

public class EstudianteRepositoryImplement implements EstudianteRepository {
    /*entityManager para la conexion*/
    private EntityManager em;
    public EstudianteRepositoryImplement(EntityManager em) {
        super();
        this.em = em;
    }

    @Override
    public void insertarEstudiante(Estudiante estudiante) {
            this.em.getTransaction().begin();
            this.em.persist(estudiante);
            this.em.getTransaction().commit();
    }


    @Override
    public void eliminarEstudiante(int idEstudiante) {

    }

    @Override
    public List<Estudiante> getAllEstudiantesPorEdad(int edad) {
        return List.of();
    }

    @Override
    public Estudiante getEstudiantesPorLegajo(Long numLegajo) {
        return null;
    }

    @Override
    public List<Estudiante> getAllEstudiantesPorGenero(String genero) {
        return List.of();
    }
}
