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
    public List<EstudianteCarreraDTO>GetCarrerasCantInscriptos(EstudianteCarrera e){
        String jpql= "SELECT new DTO.EstudianteCarreraDTO (e.carreraNombre) FROM EstudianteCarrera e JOIN Carrera c  WHERE e.Estudiantes IS NOT NULL ORDER BY e.Estudiantes";
        Query query=this.em.createQuery(jpql);
        List<EstudianteCarreraDTO> resultado= query.getResultList();
        return resultado;
    }
    public List<CarreraReporteDTO> getReportes() {
        return List.of();
    }

    @Override
    public List<MatriculacionDTO> getCarrerasConInscriptos() {
        return List.of();
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
