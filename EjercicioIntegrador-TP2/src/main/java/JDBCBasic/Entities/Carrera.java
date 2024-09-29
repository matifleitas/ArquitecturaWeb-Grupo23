package JDBCBasic.Entities;


import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Carrera {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idCarrera;

    @Column(nullable = false)
    private String nombre;

    @OneToMany(mappedBy = "carrera")
    private List<EstudianteCarrera> estudiantes;

    public Carrera(){}

    public Carrera(String nombre){
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }
    public Integer getIdCarrera() {
        return idCarrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<EstudianteCarrera> getEstudiantes() {
        return estudiantes;
    }
}
