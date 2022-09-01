/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3.operacion;

import clase.Operacion;
import metodos.metodos;

/**
 *
 * @author emanuel
 */
public class Ejercicio3Operacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        metodos m = new metodos();
        
        Operacion num = m.crearOperacion();
        
        System.out.println("suma " + m.sumar(num, num));
        System.out.println("restar " + m.restar(num, num));
        System.out.println("multiplicar " + m.multiplicar(num, num));
        System.out.println("divir " + m.dividir(num, num));
        
    }
    
}
