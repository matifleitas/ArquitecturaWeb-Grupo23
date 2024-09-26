package JDBCBasic.RepositoryImplement;

import JDBCBasic.DTO.MatriculacionDTO;
import JDBCBasic.Entities.Carrera;

import JDBCBasic.Entities.Estudiante;
import JDBCBasic.Repository.CarreraRepository;
import jakarta.persistence.EntityManager;

import java.util.List;

public class CarreraRepositoryImpl implements CarreraRepository {
    /*entityManager para la conexion*/
    private EntityManager em;

    public CarreraRepositoryImpl(EntityManager em) {
        super();
        this.em = em;
    }

    @Override
    public void insertarCarrera(Carrera carrera) {
        this.em.getTransaction().begin();
        this.em.persist(carrera);
        this.em.getTransaction().commit();
    }

    @Override
    public void matricularEstudiante(Estudiante est) {

    }

    @Override
    public List<MatriculacionDTO> getEstudiantesPorCiudad(String ciudad, String nombreCarrera) {
        return List.of();
    }
}
