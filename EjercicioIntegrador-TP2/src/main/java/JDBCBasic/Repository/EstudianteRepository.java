package JDBCBasic.Repository;

import JDBCBasic.DTO.EstudianteDTO;
import JDBCBasic.Entities.Estudiante;

import java.util.List;

public interface EstudianteRepository {
    /*a), c), d), e)*/
    void insertarEstudiante(Estudiante e);
    List<EstudianteDTO> getAllEstudiantesPorCiudad(String ciudad);
    EstudianteDTO getEstudiantePorLegajo(Long numLegajo);
    List<EstudianteDTO> getAllEstudiantesPorGenero(String genero);
}
