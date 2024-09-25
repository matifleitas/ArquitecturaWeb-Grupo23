package JDBCBasic.Repository;

import JDBCBasic.DTO.MatriculacionDTO;
import JDBCBasic.Entities.Estudiante;

import java.util.List;

public interface CarreraRepository {
    void matricularEstudiante(Estudiante est);
    List<MatriculacionDTO> getEstudiantesPorCiudad(String ciudad, String nombreCarrera);
}
