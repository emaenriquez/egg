/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.circuferencia;

import Clase.Circuferencia;
import metodos.metodos;


/**
 *
 * @author emanuel
 */
public class Ejercicio2Circuferencia {

    public static void main(String[] args) {

        metodos srv = new metodos();
        
        Circuferencia circulo = srv.crearCircuferencia();
        
        System.out.println("area" + srv.area(circulo));
        System.out.println("perimetro " + srv.perimetro(circulo));
        
    }
    
}
