package JDBCBasic.RepositoryImplement;

import JDBCBasic.Entities.Estudiante;
import JDBCBasic.Repository.EstudianteRepository;

import java.util.List;

public class EstudianteRepositoryImplement implements EstudianteRepository {
    /*entityManager para la conexion*/

    @Override
    public void insertarEstudiante(Estudiante e) {

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
