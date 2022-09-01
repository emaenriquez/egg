
package main;

import entidad.Perro;
import java.util.ArrayList;
import servicios.Metodo;

public class main {

    public static void main(String[] args) {
        Metodo m = new Metodo();
        
        ArrayList<Perro> perritos = m.crearPerro();
        m.mostrarPerros(perritos);
        m.eliminarPerrosUsusario(perritos);
        
        //m.mostrarPerros(perros);
    }
    
}
