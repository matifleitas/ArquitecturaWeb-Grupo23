package JDBCBasic.RepositoryImplement;

import JDBCBasic.DTO.CarreraReporteDTO;
import JDBCBasic.DTO.EstudianteCarreraDTO;
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
        String jpql = "SELECT new JDBCBasic.DTO.CarreraReporteDTO(c.nombre,YEAR(ec.fechaGraduacion),COUNT(ec),SUM(CASE WHEN ec.estaGraduado = true THEN 1 ELSE 0 END)) FROM Carrera c JOIN EstudianteCarrera ec ON ec.carrera.idCarrera = c.idCarrera GROUP BY c.nombre, YEAR(ec.fechaGraduacion)ORDER BY c.nombre ASC, YEAR(ec.fechaGraduacion) ASC";
        Query query = this.em.createQuery(jpql);

        List<CarreraReporteDTO> resultado = query.getResultList();

        resultado.forEach(reporte -> {
            System.out.println("Carrera: " + reporte.getNombreCarrera() +
                    " | Año de graduación: " + reporte.getGraduacion() +
                    " | Cantidad de egredados : " +reporte.getGraduados()+
                    " | Cantidad registrados: " + reporte.getRegistrados());
        });

        return resultado;
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
