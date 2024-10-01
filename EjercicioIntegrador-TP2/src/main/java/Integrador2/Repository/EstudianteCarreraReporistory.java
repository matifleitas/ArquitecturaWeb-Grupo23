package Integrador2.Repository;

import Integrador2.DTO.CarreraReporteDTO;
import Integrador2.DTO.EstudianteCarreraDTO;
import Integrador2.Entities.EstudianteCarrera;

import java.util.List;

public interface EstudianteCarreraReporistory {
    void insertarEstudianteCarrera(EstudianteCarrera estudianteCarrera);
    /*f)*/
    List<CarreraReporteDTO>getReportes();
    List<EstudianteCarreraDTO> getCarrerasConInscriptos();

}
