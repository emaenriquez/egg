/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6.cafetera;

import Clase.Cafetera;
import Metodos.metodosCafetera;

/**
 *
 * @author emanuel
 */
public class Ejercicio6Cafetera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        metodosCafetera srv = new metodosCafetera();
        
        Cafetera cafe = srv.nuevaCafetera();
        
        srv.llenarCafetera(cafe);
        
        srv.servirTaza(cafe);
        srv.vaciarCafetera(cafe);
        srv.cantidadCafe(cafe);
        
    }
    
}
