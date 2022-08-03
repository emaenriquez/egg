/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7.persona;

import Metodos.Metodos;
import clasePersona.Persona;

/**
 *
 * @author emanuel
 */
public class Ejercicio7Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Metodos srv = new Metodos();
        
        Persona p1 = srv.crearPersona(); 
        srv.calcularIMC(p1);
        srv.esMayorDeEdad(p1);
        
        Persona p2 = srv.crearPersona();
        srv.calcularIMC(p2);
        srv.esMayorDeEdad(p2);
        
        Persona p3 = srv.crearPersona();
        srv.calcularIMC(p3);
        srv.esMayorDeEdad(p3);
        
        Persona p4 = srv.crearPersona();
        srv.calcularIMC(p4);
        srv.esMayorDeEdad(p4);
        
        int cont = 0;
        int cont2=0;
        int cont3 = 0;
        //int cont4=0;
        
        switch (srv.calcularIMC(p1)) {
            case -1:
                cont = cont +1;
                System.out.println("contador 2" + cont);
                break;
            case 0:
                cont2 = cont2 + 1;
                System.out.println("contador 2" + cont2);
                break;
            case 1:
                cont3 = cont3 + 1;
                System.out.println("contador 2" + cont3);
                break;
            default:
                break;
        }
    }
}    

