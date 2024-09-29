package JDBCBasic.DTO;

import JDBCBasic.Entities.Carrera;
import JDBCBasic.Entities.EstudianteCarrera;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EstudianteCarreraDTO {
    private String carreraNombre;
    private List<EstudianteCarrera> Estudiantes ;

    public EstudianteCarreraDTO(String carreraNombre) {
        this.carreraNombre = carreraNombre;
        Estudiantes= new ArrayList<>();
    }

    public String getCarreraNombre() {
        return carreraNombre;
    }



    public List<EstudianteCarrera> getEstudiantes() {
        return Estudiantes;
    }
}
