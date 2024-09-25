package JDBCBasic.Entities;

import javax.persistence.*;

import java.sql.Timestamp;

import static javax.persistence.GenerationType.AUTO;
@Entity
public class EstudianteCarrera {
    @Id @GeneratedValue(strategy = AUTO)
    private int id;

    /*CarreraId*/
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "carreara", referencedColumnName = "idCarrera")
    private Carrera carrera;//Relacion a carrera

    /*EstudianteId*/
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "estudiante", referencedColumnName = "idEstudiante")
    private Estudiante estudiante; //Relacion a estudiante

    @Column(nullable = false)
    private Timestamp fechaComienzo;

    @Column(nullable = false)
    private boolean estaGraduado;

    @Column(nullable = true)
    private Timestamp fechaGraduacion;

    public EstudianteCarrera(){}

    public EstudianteCarrera(Carrera carrera, Estudiante estudiante, Timestamp fechaComienzo, boolean estaGraduado, Timestamp fechaGraduacion) {
        this.carrera = carrera;
        this.estudiante = estudiante;
        this.fechaComienzo = fechaComienzo;
        this.estaGraduado = estaGraduado;
        this.fechaGraduacion = fechaGraduacion;
    }

    public int getId(){
        return this.id;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public Timestamp getFechaComienzo() {
        return fechaComienzo;
    }

    public boolean isEstaGraduado() {
        return estaGraduado;
    }

    public Timestamp getFechaGraduacion() {
        return fechaGraduacion;
    }
}
