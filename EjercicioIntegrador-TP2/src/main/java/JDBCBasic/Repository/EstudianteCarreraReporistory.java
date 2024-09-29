package JDBCBasic.Repository;

import JDBCBasic.DTO.CarreraReporteDTO;
import JDBCBasic.DTO.EstudianteCarreraDTO;
import JDBCBasic.DTO.MatriculacionDTO;
import JDBCBasic.Entities.EstudianteCarrera;

import java.util.List;

public interface EstudianteCarreraReporistory {
    void insertarEstudianteCarrera(EstudianteCarrera estudianteCarrera);
    /*f)*/
    List<EstudianteCarreraDTO> GetCarrerasCantInscriptos(EstudianteCarrera e);
    List<CarreraReporteDTO>getReportes();
    List<MatriculacionDTO> getCarrerasConInscriptos();

}
