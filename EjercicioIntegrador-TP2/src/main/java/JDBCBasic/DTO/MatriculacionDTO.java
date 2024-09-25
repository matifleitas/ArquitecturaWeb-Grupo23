package JDBCBasic.DTO;

public class MatriculacionDTO {

    private int idCarrera;
    private String nombreCarrera;
    private String nombreEstudiante;
    private String ciudad;

    public MatriculacionDTO(){}

    public MatriculacionDTO(int idCarrera, String nombreCarrera, String nombreEstudiante, String ciudad) {
        this.idCarrera = idCarrera;
        this.nombreCarrera = nombreCarrera;
        this.nombreEstudiante = nombreEstudiante;
        this.ciudad = ciudad;
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
