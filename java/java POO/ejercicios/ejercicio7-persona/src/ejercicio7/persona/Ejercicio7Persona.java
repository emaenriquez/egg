
package ejercicio7.persona;

import Metodos.Metodos;
import clasePersona.Persona;

public class Ejercicio7Persona {

    public static void main(String[] args) {
        
        /*
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
        srv.esMayorDeEdad(p4);*/
        
        try{
            
            Metodos srv = new Metodos();
        
            Persona p1 = srv.crearPersona(); 
            srv.esMayorDeEdad(p1);
        
        } catch(Exception error){
            System.out.println("" + error.getMessage());
        }
            
    }
}    

