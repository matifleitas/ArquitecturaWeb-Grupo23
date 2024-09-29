package JDBCBasic.Entities;


import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idEstudiante;

    @Column (nullable = false)
    private String nombre;

    @Column (nullable = false)
    private String apellido;

    @Column (name = "anios")
    private int edad;

    @Column (nullable = false)
    private String genero;

    @Column (nullable = false)
    private int DNI;

    @Column (nullable = false)
    private Long numLegajo;

    @Column
    private String ciudad;

    @Column(nullable = true)
    private int antiguedadEnCarrera;

    @Column (nullable = false)

    @OneToMany(mappedBy = "estudiante")
    private List<EstudianteCarrera> carreras;/*Un estudiante tiene 1 o + carreras cursadas*/
                /*Tipo EstudianteCarrera, ya que es la tabla realacion*/
    public Estudiante(String nombre, String apellido, int edad, String genero, int DNI, Long numLegajo, String ciudad, int antiguedadEnCarrera) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.DNI = DNI;
        this.numLegajo = numLegajo;
        this.ciudad = ciudad;
        this.antiguedadEnCarrera = antiguedadEnCarrera;
        this.carreras = new ArrayList<>();
    }

    public Estudiante() {}

    public int getAntiguedadEnCarrera() {
        return antiguedadEnCarrera;
    }

    public void setAntiguedadEnCarrera(int antiguedadEnCarrera) {
        this.antiguedadEnCarrera = antiguedadEnCarrera;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public Long getNumLegajo() {
        return numLegajo;
    }

    public Integer getIdEstudiante() {
        return idEstudiante;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "antiguedadEnCarrera=" + antiguedadEnCarrera +
                ", ciudad='" + ciudad + '\'' +
                ", numLegajo='" + numLegajo + '\'' +
                ", DNI=" + DNI +
                ", genero='" + genero + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }
}
