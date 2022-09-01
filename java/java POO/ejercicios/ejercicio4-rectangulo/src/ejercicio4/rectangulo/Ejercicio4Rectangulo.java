/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.rectangulo;

import Metodos.Metodos;
import clase.Rectangulo;

/**
 *
 * @author emanuel
 */
public class Ejercicio4Rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos m = new Metodos();
        
        Rectangulo r = m.crearRectangulo();
        
        System.out.println("el perimetro es " + m.perimetro(r, r));
        System.out.println("la superficie es " + m.superficie(r, r));
        
        m.dibujarRectangulo(r);
    }
    
}
