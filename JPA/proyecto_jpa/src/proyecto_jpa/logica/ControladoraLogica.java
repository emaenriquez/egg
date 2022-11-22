
package proyecto_jpa.logica;

import java.util.ArrayList;
import proyecto_jpa.persitencia.ControladoraPersistencia;

public class ControladoraLogica {
    
    ControladoraPersistencia controlPersistencia = new ControladoraPersistencia();
    
    public void crearAlumno(Alumno alu){
        controlPersistencia.crearAlumno(alu);
    }
    
    
    public void eliminarAlumno(int id){
        controlPersistencia.eleminarAlumno(id);
    }
    
    public void editarAlumno(Alumno alu){
        controlPersistencia.editarAlumno(alu);
    }
    
    public Alumno traerAlumno(int id){
        return controlPersistencia.traerAlumno(id);
    }
    
    public ArrayList<Alumno> traerListaAlumnos(){
        return controlPersistencia.traerListaAlumnos();
    }
    
    // Carrera
    public void crearCarrera(Carrera carrera){
        controlPersistencia.crearCarrera(carrera);
    }
    
    
    public void eliminarCarrera(int id){
        controlPersistencia.eliminarCarrera(id);
    }
    
    public void editarCarrera(Carrera carrera){
        controlPersistencia.editarCarrera(carrera);
    }
    
    public Carrera traerCarrera(int id){
        return controlPersistencia.traerCarrera(id);
    }
    
    public ArrayList<Carrera> traerListaCarrera(){
        return controlPersistencia.traerListaCarrera();
    }
    
}
