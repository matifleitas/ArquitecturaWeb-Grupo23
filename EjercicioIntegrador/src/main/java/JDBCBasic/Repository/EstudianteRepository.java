package JDBCBasic.Repository;

import JDBCBasic.Entities.Estudiante;

import java.util.List;

public interface EstudianteRepository {
    /*a), c), d), e)*/
    void insertarEstudiante(Estudiante e);
    void eliminarEstudiante(int idEstudiante);//no es necesario
    List<Estudiante> getAllEstudiantesPorEdad(int edad);
    Estudiante getEstudiantesPorLegajo(Long numLegajo);
    List<Estudiante> getAllEstudiantesPorGenero(String genero);
}
