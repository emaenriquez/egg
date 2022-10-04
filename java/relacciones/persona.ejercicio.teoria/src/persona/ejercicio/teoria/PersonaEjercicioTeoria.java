
package persona.ejercicio.teoria;

import classdni.Dni;
import classpersona.Persona;

public class PersonaEjercicioTeoria {

    public static void main(String[] args) {
        
        Persona p1 = new Persona();        
        Dni dni = new Dni();
        
        dni.setCaracter("dni");
        dni.setDni("44.503.3232");
        
        p1.setNombre("emanuel");
        p1.setApellido("ernqiur");
        p1.setDocumento(dni);
        
        System.out.println(p1);
        
    }
    
}
