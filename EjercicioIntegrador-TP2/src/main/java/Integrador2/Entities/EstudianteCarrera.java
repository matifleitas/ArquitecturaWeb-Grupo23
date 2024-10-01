package Integrador2.Entities;

import jakarta.persistence.*;
import java.time.LocalDate;
import static jakarta.persistence.GenerationType.AUTO;

@Entity
public class EstudianteCarrera {
    @Id @GeneratedValue(strategy = AUTO)
    private Integer idEstudianteCarrera;

    /*CarreraId*/
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "carrera_id", referencedColumnName = "idCarrera")
    private Carrera carrera;//Relacion a carrera

    /*EstudianteId*/
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "estudiante_id", referencedColumnName = "idEstudiante")
    private Estudiante estudiante; //Relacion a estudiante

    @Column(nullable = false)
    private LocalDate fechaComienzo;

    @Column(nullable = false)
    private boolean estaGraduado;

    @Column(nullable = true)
    private LocalDate fechaGraduacion;

    public EstudianteCarrera(){
        super();
    }

    public EstudianteCarrera(Carrera carrera, Estudiante estudiante, LocalDate fechaComienzo, boolean estaGraduado, LocalDate fechaGraduacion) {
        this.carrera = carrera;
        this.estudiante = estudiante;
        this.fechaComienzo = fechaComienzo;
        this.estaGraduado = estaGraduado;
        this.fechaGraduacion = fechaGraduacion;
    }

    public Integer getIdEstudianteCarrera(){
        return this.idEstudianteCarrera;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public LocalDate getFechaComienzo() {
        return fechaComienzo;
    }

    public boolean isEstaGraduado() {
        return estaGraduado;
    }

    public LocalDate getFechaGraduacion() {
        return fechaGraduacion;
    }
}