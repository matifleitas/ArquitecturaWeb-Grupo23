package JDBCBasic.DTO;

import java.sql.Timestamp;

public class CarreraReporteDTO {
    private int idCarrera;
    private String nombreCarrera;
    private int dni;
    private Timestamp fechaInicio;
    private int fechaGraduacion;
    private int anios;
    private Long graducion;
    private Long registrados;

    public CarreraReporteDTO() {}

    public CarreraReporteDTO(int anios, String nombreCarrera, Long graducion, Long registrados) {
        this.anios = anios;
        this.nombreCarrera = nombreCarrera;
        this.graducion = graducion;
        this.registrados = registrados;
    }

    public CarreraReporteDTO(String nombreCarrera, int dni, int fechaGraduacion, Timestamp fechaInicio, int anios, Long graducion, Long registrados) {
        this.nombreCarrera = nombreCarrera;
        this.dni = dni;
        this.fechaGraduacion = fechaGraduacion;
        this.fechaInicio = fechaInicio;
        this.anios = anios;
        this.graducion = graducion;
        this.registrados = registrados;
    }

    public int getIdCarrera() {
        return idCarrera;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public int getDni() {
        return dni;
    }

    public Timestamp getFechaInicio() {
        return fechaInicio;
    }

    public int getAnios() {
        return anios;
    }

    public int getFechaGraduacion() {
        return fechaGraduacion;
    }

    public Long getRegistrados() {
        return registrados;
    }

    @Override
    public String toString() {
        return "CarreraReporteDTO{" +
                "registrados=" + registrados +
                ", graducion=" + graducion +
                ", anios=" + anios +
                ", nombreCarrera='" + nombreCarrera + '\'' +
                '}';
    }

    public Long getGraducion() {
        return graducion;
    }
}
