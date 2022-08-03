/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10.arreglos;

import static java.time.Clock.system;
import java.util.Arrays;


/**
 *
 * @author emanuel
 */
public class Ejercicio10Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double[] a = new double[50];
        double[] b = new double[20];
        
        for (int i = 0; i < 50; i++) {
            a[i] = Math.floor(Math.random()*100);
        }
        
        System.out.println("Vector desordenado");
        
        for (int i = 0; i < 50; i++) {
            System.out.println("[" + a[i] + "]");
        }
        
        System.out.println("vector ordenado de menor a mayor ");
        
        
        for (int i = 0; i < 50; i++) {

            Arrays.sort(a);
            
            System.out.println(a[i]);

        }
        
        System.out.println("-----------------");
        
        System.arraycopy(a,0,b,0,10);
        
        
        for (int i = 10; i < 20; i++) {
            b[i] = 0.5;
        }
       
        for (int i = 0; i < 20; i++) {
            System.out.println(b[i]);
        }
        
        
    }
    
}
