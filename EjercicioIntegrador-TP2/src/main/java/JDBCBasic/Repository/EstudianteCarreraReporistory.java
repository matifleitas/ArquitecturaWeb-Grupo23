package JDBCBasic.Repository;

import JDBCBasic.DTO.CarreraReporteDTO;
import JDBCBasic.DTO.MatriculacionDTO;

import java.util.List;

public interface EstudianteCarreraReporistory {
    /*f)*/
    List<CarreraReporteDTO>getReportes();
    List<MatriculacionDTO> getCarrerasConInscriptos();

}
