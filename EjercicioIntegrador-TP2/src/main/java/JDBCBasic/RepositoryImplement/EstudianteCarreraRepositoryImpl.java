package JDBCBasic.RepositoryImplement;

import JDBCBasic.DTO.CarreraReporteDTO;
import JDBCBasic.DTO.EstudianteCarreraDTO;
import JDBCBasic.DTO.MatriculacionDTO;
import JDBCBasic.Entities.EstudianteCarrera;
import JDBCBasic.Repository.EstudianteCarreraReporistory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;

public class EstudianteCarreraRepositoryImpl implements EstudianteCarreraReporistory {
    /*entityManager para la conexion*/
    private EntityManager em;

    public EstudianteCarreraRepositoryImpl(EntityManager em) {
        super();
        this.em = em;
    }

    @Override
    public void insertarEstudianteCarrera(EstudianteCarrera estudianteCarrera) {
        this.em.getTransaction().begin();
        this.em.persist(estudianteCarrera);
        this.em.getTransaction().commit();
    }


    public List<CarreraReporteDTO> getReportes() {
        return List.of();
    }

    @Override
    public List<EstudianteCarreraDTO> getCarrerasConInscriptos() {
        String jpql= "SELECT new JDBCBasic.DTO.EstudianteCarreraDTO (c.nombre, COUNT(ec.estudiante)) FROM Carrera c JOIN EstudianteCarrera ec ON c.idCarrera = ec.carrera.idCarrera GROUP BY c.idCarrera, c.nombre ORDER BY COUNT(ec.estudiante) DESC";
        Query query=this.em.createQuery(jpql);

        List<EstudianteCarreraDTO> resultado = query.getResultList();

        resultado.forEach(e->System.out.println(e));

        return resultado;
    }

    public EstudianteCarrera guardarEstudianteCarrera(EstudianteCarrera estCarr) {
        if (estCarr.getIdEstudianteCarrera() == null) {
            em.persist(estCarr);
        } else {
            estCarr = em.merge(estCarr);
        }
        return estCarr;
    }


}
