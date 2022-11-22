package proyecto_jpa.persitencia;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyecto_jpa.logica.Alumno;
import proyecto_jpa.logica.Carrera;
import proyecto_jpa.persitencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
    
    AlumnoJpaController aluJpa = new AlumnoJpaController();
    CarreraJpaController carrreraJpa = new CarreraJpaController();

    public void crearAlumno(Alumno alu) {
        aluJpa.create(alu);
    }

    public void eleminarAlumno(int id) {
        try {
            aluJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarAlumno(Alumno alu) {
        try {
            aluJpa.edit(alu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Alumno traerAlumno(int id) {
        return aluJpa.findAlumno(id);   
    }

    public ArrayList<Alumno> traerListaAlumnos() {
        
        List<Alumno> listaCompleta = aluJpa.findAlumnoEntities();
        ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>(listaCompleta);
        return listaAlumnos;
        
    }
    // metodos de la entidad de Carrera
    public void crearCarrera(Carrera carrera) {
        carrreraJpa.create(carrera);
    }

    public void eliminarCarrera(int id) {
        try {
            carrreraJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarCarrera(Carrera carrera) {
        try {
            carrreraJpa.edit(carrera);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Carrera traerCarrera(int id) {
        return carrreraJpa.findCarrera(id);
    }

    public ArrayList<Carrera> traerListaCarrera() {
        List<Carrera> listaCompletaCarreras = carrreraJpa.findCarreraEntities();
        ArrayList<Carrera> listaCarrera = new ArrayList(listaCompletaCarreras);
        return listaCarrera;
    }
}
