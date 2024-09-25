package JDBCBasic.Entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Carrera {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCarrera;

    @Column(nullable = false)
    private String nombre;

    @OneToMany(mappedBy = "estudiante")
    private List<EstudianteCarrera> estudiantes;

    public Carrera(){}

    public Carrera(String nombre){
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdCarrera() {
        return idCarrera;
    }

    public List<EstudianteCarrera> getEstudiantes() {
        return estudiantes;
    }
}
