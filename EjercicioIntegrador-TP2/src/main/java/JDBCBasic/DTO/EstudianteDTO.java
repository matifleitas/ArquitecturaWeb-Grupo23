package JDBCBasic.DTO;

public class EstudianteDTO {
    private int dni;

    private String nombre;

    private String apellido;

    private String genero;

    private int edad;

    private String numLegajo;

    private String ciudad;

    public EstudianteDTO(int dni, String nombre, String apellido, String genero, int edad, String numLegajo, String ciudad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.edad = edad;
        this.numLegajo = numLegajo;
        this.ciudad = ciudad;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getGenero() {
        return genero;
    }

    public int getEdad() {
        return edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    @Override
    public String toString() {
        return "EstudianteDTO{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", genero='" + genero + '\'' +
                ", edad=" + edad +
                ", numLegajo='" + numLegajo + '\'' +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }

    public String getNumLegajo() {
        return numLegajo;
    }
}
