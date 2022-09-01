/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro;

import Clase.Libro;
import metodos.MetodoLibro;

/**
 *
 * @author emanuel
 */
public class mostrarLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        MetodoLibro serv = new MetodoLibro();
        
        Libro l = serv.CargarLibro();
        
        serv.MostrarLibro(l);
    }
    
}
