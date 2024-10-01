package Integrador2.DTO;

import java.time.LocalDate;

public class CarreraReporteDTO {
    private int idCarrera;
    private String nombreCarrera;
    private int dni;
    private LocalDate fechaInicio;
    private LocalDate fechaGraduacion;
    private int anios;
    private Integer graduacion;
    private Long registrados;
    private Long graduados;

    public CarreraReporteDTO() {}

    public CarreraReporteDTO(String nombreCarrera, Integer graduacion, long cantidadInscriptos,Long cantidadGraduados  ) {
        this.nombreCarrera = nombreCarrera;
        this.graduacion = graduacion;
        this.registrados = cantidadInscriptos;
        this.graduados = cantidadGraduados;
    }
    public CarreraReporteDTO(String nombreCarrera, int dni, LocalDate fechaGraduacion, LocalDate fechaInicio, int anios, int graducion, Long registrados) {
        this.nombreCarrera = nombreCarrera;
        this.dni = dni;
        this.fechaGraduacion = fechaGraduacion;
        this.fechaInicio = fechaInicio;
        this.anios = anios;
        this.graduacion = graducion;
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

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public int getAnios() {
        return anios;
    }

    public LocalDate getFechaGraduacion() {
        return fechaGraduacion;
    }

    public Long getRegistrados() {
        return registrados;
    }
    public Integer getGraduacion() {
        return graduacion;
    }

    public Long getGraduados(){
        return graduados;
    }

    @Override
    public String toString() {
        return "CarreraReporteDTO{" +
                "registrados=" + registrados +
                ", graduados=" + graduados +
                ", graducion=" + graduacion +
                ", anios=" + anios +
                ", nombreCarrera='" + nombreCarrera + '\'' +
                '}';
    }


}
