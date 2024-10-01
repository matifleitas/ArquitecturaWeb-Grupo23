package Integrador2.DTO;


public class EstudianteCarreraDTO {
    private String carreraNombre;
    private Long cantEstudiantes;

    public EstudianteCarreraDTO(String carreraNombre, Long cant) {
        this.carreraNombre = carreraNombre;
        this.cantEstudiantes = cant;
    }

    public Long getCantEstudiantes() {
        return cantEstudiantes;
    }

    public String getCarreraNombre() {
        return carreraNombre;
    }

    @Override
    public String toString() {
        return "EstudianteCarreraDTO{" +
                "carreraNombre='" + carreraNombre + '\'' +
                ", cantEstudiantes=" + cantEstudiantes +
                '}';
    }
}
