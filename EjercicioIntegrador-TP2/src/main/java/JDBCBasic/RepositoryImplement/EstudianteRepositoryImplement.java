package JDBCBasic.RepositoryImplement;
import JDBCBasic.DTO.*;
import JDBCBasic.DTO.EstudianteDTO;
import JDBCBasic.Entities.Estudiante;
import JDBCBasic.Repository.EstudianteRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;


import java.util.List;

import static org.hibernate.internal.util.collections.ArrayHelper.forEach;

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
    public List<EstudianteDTO> getAllEstudiantesPorCiudad(String ciudad) {
        String jpql = "SELECT new DTO.EstudianteDTO(e.dni, e.nombre, e.apellido, e.genero, e.edad, e.numLegajo, e.ciudad) FROM Estudiante e WHERE e.ciudad = :ciudad";
        Query query = this.em.createQuery(jpql);
        query.setParameter("ciudad", ciudad);
        List<EstudianteDTO> results = query.getResultList();

        return results;
    }

    @Override
    public EstudianteDTO getEstudiantePorLegajo(Long numLegajo) {
        String jpql = "SELECT new DTO.EstudianteDTO(e.dni, e.nombre, e.apellido, e.genero, e.edad, e.numLegajo, e.ciudad) FROM Estudiante e WHERE e.numLegajo= : numLegajo";
        Query query = this.em.createQuery(jpql);
        query.setParameter("numLegajo", numLegajo);
        EstudianteDTO resultado = (EstudianteDTO) query.getSingleResult();
        return resultado;

    }

    @Override
    public List<EstudianteDTO> getAllEstudiantesPorGenero(String genero) {
        String jpql = "SELECT new DTO.EstudianteDTO(e.dni, e.nombre, e.apellido, e.genero, e.edad, e.numLegajo, e.ciudad) FROM Estudiante e WHERE e.genero = :genero";
        Query query = this.em.createQuery(jpql);
        query.setParameter("genero", genero);
        List<EstudianteDTO> results = query.getResultList();

        return results;
    }

    public Estudiante guardarEstudiante(Estudiante estudiante) {
        if (estudiante.getIdEstudiante() == null) {
            em.persist(estudiante);
        } else {
            estudiante = em.merge(estudiante);
        }
        return estudiante;

    }
}

