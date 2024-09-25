package JDBCBasic.DTO;

public class CarreraDTO {
    private int id;
    private String nombreCarrera;
    private Long cantEstudiantes;
    private Long cantGraduados;

    public CarreraDTO(){}

    public CarreraDTO(int id, String nombreCarrera, Long cantEstudiantes, Long cantGraduados) {
        this.id = id;
        this.nombreCarrera = nombreCarrera;
        this.cantEstudiantes = cantEstudiantes;
        this.cantGraduados = cantGraduados;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public Long getCantEstudiantes() {
        return cantEstudiantes;
    }

    public void setCantEstudiantes(Long cantEstudiantes) {
        this.cantEstudiantes = cantEstudiantes;
    }

    public Long getCantGraduados() {
        return cantGraduados;
    }

    public void setCantGraduados(Long cantGraduados) {
        this.cantGraduados = cantGraduados;
    }
}
