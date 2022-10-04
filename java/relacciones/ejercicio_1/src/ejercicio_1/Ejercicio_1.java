
package ejercicio_1;

import perro.Perro;
import persona.Persona;

public class Ejercicio_1 {

    public static void main(String[] args) {
        
        Perro pero_para_emanuel = new Perro("ternera", "mestizo", 3, "mediano");
        Perro pero_para_rami = new Perro("pochi", "cruza pitbull", 2, "grande");
        
        
        Persona p1 = new Persona();
        p1.setNombre("emanuel");
        p1.setApellido("senku");
        p1.setEdad(19);
        p1.setDocumento(44.213);
        p1.setNueva_mascota(pero_para_rami);

        Persona p2 = new Persona();
        p2.setNombre("rami");
        p2.setApellido("senku");
        p2.setEdad(39);
        p2.setDocumento(44.343);
        p2.setNueva_mascota(pero_para_emanuel);
        
        System.out.println(p1);
        System.out.println(p2);
    }
    
}
