/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12.persona;

import clase.Persona;
import metodos.Metodos;

/**
 *
 * @author emanuel
 */
public class Ejercicio12Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos m = new Metodos();
        Persona p1 = m.crearPersona();
        Persona p2 = m.crearPersona();
        
        System.out.println("La edad de " + p1.getNombre() + " es: " + m.calcularEdad(p1) + "anios");
        System.out.println("La edad de " + p2.getNombre() + " es: " + m.calcularEdad(p2) + "anios");
        
           switch(m.menorQue(p1, m.calcularEdad(p2))) {
            case -1:
                System.out.println(p1.getNombre() + " es menor que " + p2.getNombre() + ".");
                break;
            case 0:
                System.out.println(p1.getNombre() + " tiene la misma edad que " + p2.getNombre() + ".");
                break;
            case 1:
                System.out.println(p1.getNombre() + " es mayor que " + p2.getNombre() + ".");
                break;
        }
        
        m.mostrarPersona(p1);
        m.mostrarPersona(p2);
        
    }
    
}
