package JDBCBasic.Repository;

import JDBCBasic.DTO.MatriculacionDTO;
import JDBCBasic.Entities.Carrera;
import JDBCBasic.Entities.Estudiante;

import java.util.List;

public interface CarreraRepository {
    void insertarCarrera(Carrera carrera);
    void matricularEstudiante(Estudiante est);
    List<MatriculacionDTO> getEstudiantesPorCiudad(String ciudad, String nombreCarrera);
}
