package JDBCBasic.RepositoryImplement;

import JDBCBasic.DTO.MatriculacionDTO;
import JDBCBasic.Entities.Carrera;

import JDBCBasic.Entities.Estudiante;
import JDBCBasic.Repository.CarreraRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.time.Instant;
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
        this.em.getTransaction().begin();
        this.em.persist(est);
        this.em.getTransaction().commit();

    }

    @Override
    public List<MatriculacionDTO> getEstudiantesPorCiudad(String ciudad, String nombreCarrera) {
        TypedQuery<MatriculacionDTO> estudiantesPorCiudad = (TypedQuery<MatriculacionDTO>) em.createQuery("SELECT new JDBCBasic.DTO.MatriculacionDTO(ec.carrera.idCarrera, ec.carrera.nombre, e.nombre, e.ciudad) FROM Estudiante e JOIN EstudianteCarrera ec ON e.idEstudiante = ec.estudiante.idEstudiante JOIN Carrera c ON ec.carrera.idCarrera = c.idCarrera WHERE c.nombre = :nombreCarrera AND e.ciudad = :ciudad");
        estudiantesPorCiudad.setParameter("nombreCarrera", nombreCarrera);
        estudiantesPorCiudad.setParameter("ciudad", ciudad);
        List<MatriculacionDTO> resultado = estudiantesPorCiudad.getResultList();

        resultado.forEach(e->System.out.println(e));

        return resultado;
    }

    public Carrera guardarCarrera(Carrera c) {
        if (c.getIdCarrera() == null) {
            em.persist(c);
        } else {
            c = em.merge(c);
        }
        return c;
    }
}
