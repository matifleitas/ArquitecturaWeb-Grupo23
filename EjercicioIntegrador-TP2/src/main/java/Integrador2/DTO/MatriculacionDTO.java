package Integrador2.DTO;

public class MatriculacionDTO {

    private int idCarrera;
    private String nombreCarrera;
    private String nombreEstudiante;
    private String ciudad;
    private Long cantInscriptos;

    public MatriculacionDTO(){}

    public MatriculacionDTO(int idCarrera, String nombreCarrera, String nombreEstudiante, String ciudad) {
        this.idCarrera = idCarrera;
        this.nombreCarrera = nombreCarrera;
        this.nombreEstudiante = nombreEstudiante;
        this.ciudad = ciudad;
    }

    public MatriculacionDTO(int idCarrera, String nombreCarrera, Long cantInscriptos) {
        this.idCarrera = idCarrera;
        this.nombreCarrera = nombreCarrera;
        this.cantInscriptos = cantInscriptos;
    }

    @Override
    public String toString() {
        return "MatriculacionDTO{" +
                "idCarrera=" + idCarrera +
                ", nombreCarrera='" + nombreCarrera + '\'' +
                ", nombreEstudiante='" + nombreEstudiante + '\'' +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }

    public Long getCantInscriptos() {return cantInscriptos;}

    public int getIdCarrera() {
        return idCarrera;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public String getCiudad() {
        return ciudad;
    }
}
