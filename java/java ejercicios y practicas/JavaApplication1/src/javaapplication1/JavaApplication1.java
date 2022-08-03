/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author emanuel
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // crea una variable scanner para leer datos del usuario
        Scanner leer = new Scanner(System.in);
        // se crea una variable de cadena que se utiliza para leer los datos del
        //usuario
        String nombre;
        //muestra un msj por pantalla
        System.out.println("ingrese su nombre");
        //leemos el nombre de la persona en la variable nombre
        nombre = leer.next();
        //mostrar por consola
        System.out.println("hola mundo soy " + nombre + " y estoy programando en java");
    }
    
}
