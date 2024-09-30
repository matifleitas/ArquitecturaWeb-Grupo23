package JDBCBasic.RepositoryImplement;
import JDBCBasic.DTO.EstudianteDTO;
import JDBCBasic.Entities.Estudiante;
import JDBCBasic.Repository.EstudianteRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
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
    public List<EstudianteDTO> getAllEstudiantesPorCiudad(String ciudad) {
        String jpql = "SELECT new JDBCBasic.DTO.EstudianteDTO(e.DNI, e.nombre, e.apellido, e.genero, e.edad, e.numLegajo, e.ciudad) FROM Estudiante e WHERE e.ciudad = :ciudad";
        Query query = this.em.createQuery(jpql);
        query.setParameter("ciudad", ciudad);

        List<EstudianteDTO> resultado = query.getResultList();

        resultado.forEach(e->System.out.println(e));


        return resultado;
    }

    @Override
    public EstudianteDTO getEstudiantePorLegajo(Long numLegajo) {
        String jpql = "SELECT new JDBCBasic.DTO.EstudianteDTO(e.DNI, e.nombre, e.apellido, e.genero, e.edad, e.numLegajo, e.ciudad) FROM Estudiante e WHERE e.numLegajo= : numLegajo";
        Query query = this.em.createQuery(jpql);
        query.setParameter("numLegajo", numLegajo);
        EstudianteDTO resultado = (EstudianteDTO) query.getSingleResult();
        System.out.println(resultado);
        return resultado;

    }

    @Override
    public List<EstudianteDTO> getAllEstudiantesPorGenero(String genero) {
        String jpql = "SELECT new JDBCBasic.DTO.EstudianteDTO(e.DNI, e.nombre, e.apellido, e.genero, e.edad, e.numLegajo, e.ciudad) FROM Estudiante e WHERE e.genero = :genero";
        Query query = this.em.createQuery(jpql);
        query.setParameter("genero", genero);
        List<EstudianteDTO> resultado = query.getResultList();

        System.out.println(resultado);

        return resultado;
    }

    @Override
    public List<EstudianteDTO> getAllEstudiantesOrdenadoPorEdad() {
        TypedQuery<EstudianteDTO> estudiantes = this.em.createQuery("SELECT new JDBCBasic.DTO.EstudianteDTO(e.nombre, e.apellido, e.edad) FROM Estudiante e ORDER BY e.edad DESC", EstudianteDTO.class);
        List<EstudianteDTO> resultado = estudiantes.getResultList();

        resultado.forEach(e->System.out.println(e));
        return resultado;
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

