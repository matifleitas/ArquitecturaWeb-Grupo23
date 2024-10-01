package Integrador2.Repository;

import Integrador2.DTO.MatriculacionDTO;
import Integrador2.Entities.Carrera;
import Integrador2.Entities.Estudiante;
import java.util.List;

public interface CarreraRepository {
    void insertarCarrera(Carrera carrera);
    void matricularEstudiante(Estudiante est);
    List<MatriculacionDTO> getEstudiantesPorCiudad(String ciudad, String nombreCarrera);
}
