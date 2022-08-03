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
public class funciones {
    
    public static void main(String[] args) {
       
      int funcionSumar = sumar(10,10);
      
      System.out.println(funcionSumar);
       
      saludo("emanuel");
      
      Scanner leer = new Scanner(System.in);
      String nombre = leer.nextLine();
      saludo(nombre);
      
      saludo(leer.nextLine());
      
      
    }
    
    public static int sumar(int a, int b){
    
        int res = a + b; 
        
        return res;
    }
    
    public static void saludo(String nombre){
        System.out.println("hola " + nombre + " como estas");
    
    }
     
}
