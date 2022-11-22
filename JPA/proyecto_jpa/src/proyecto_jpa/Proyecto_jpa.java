
package proyecto_jpa;

// import java.util.ArrayList;
import java.util.Date;
import proyecto_jpa.logica.Alumno;
import proyecto_jpa.logica.Carrera;
import proyecto_jpa.logica.ControladoraLogica;

public class Proyecto_jpa {

    public static void main(String[] args) {
        
       
        ControladoraLogica control = new ControladoraLogica();
        
        
        Carrera carre = new Carrera(9, "programacion");
        
        control.crearCarrera(carre);
        
        Alumno al = new Alumno(24,"emande","deq",new Date(),carre);
        control.crearAlumno(al);
        
        System.out.println("------------------------");
        System.out.println("datos alumno");
        Alumno alu = control.traerAlumno(24);
        System.out.println("Alumno: " + alu.getNombre() + " " + alu.getApellido());
        System.out.println("cursa la carrera de: " + alu.getCarrera().getNombreCarrera());
        
        
        //Alumno alu = new Alumno(30, "emanuel", "enriquez", new Date());
        
        //control.crearAlumno(alu);
        
        //control.eliminarAlumno(1);
        //alu.setApellido("enriuqeceq");
        
        //control.editarAlumno(alu);
        
        //Alumno alu = control.traerAlumno(1);
        //System.out.println("busqueda individual");
        //System.out.println("el alumno es " + alu.toString());
        //System.out.println("busqueda de todos");
        //ArrayList<Alumno> listaAlumnos = control.traerListaAlumnos();
        /*for (Alumno listaAlumno : listaAlumnos) {
            System.out.println("los alumnos son" + listaAlumno.toString());
        }*/
        
        
        
        
        
    }
}
