/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import Clase.Cafetera;
import java.util.Scanner;

/**
 *
 * @author emanuel
 */
public class metodosCafetera {
    
    Scanner leer = new Scanner(System.in);
   
    public Cafetera nuevaCafetera(){
        System.out.println("ingrese la capacidad maxima de su cafetera");
        int capMax = leer.nextInt();
        return new Cafetera(capMax, 0);
    }
    
    // hace que la cantidad actual sea igual a la capacidad máxima
    public void llenarCafetera(Cafetera c){
        c.setCapacidadMinima(c.getCapacidadMaxima());
        System.out.println("su cafetera es de la capacidad de " + c.getCapacidadMinima() + "ml");
    }
    
    public void servirTaza(Cafetera c){
        
        System.out.println("ingrese la cantidad de ml que tiene su taza");
        int taza = leer.nextInt();
        System.out.println("serviendo cafe en su taza");
        
        if(taza < c.getCapacidadMinima()){
            c.setCapacidadMinima(c.getCapacidadMinima() - taza);
            taza = 0;
        } 
        
        if(taza ==  0){
            System.out.println("la taza no se lleno puede service " + (c.getCapacidadMinima() - taza)  + " ml mas");
            
        } else {
            System.out.println("la taza se lleno y le sobro " + (c.getCapacidadMinima() - taza) + " ml" );
        }
        
    }
    
    public void vaciarCafetera(Cafetera c){
        c.setCapacidadMinima(0);
        //System.out.println("ahora su capacidad actual es de " + c.getCapacidadMinima());
    }
    
    public void cantidadCafe(Cafetera c ){
        System.out.println("ingrese la cantidad de cafe");
        int cantCafe = leer.nextInt();
        
        c.setCapacidadMinima(cantCafe);
        System.out.println("ahora la cantidad de cafe que ingresamos se añade con la cantidad actual " + c.getCapacidadMinima());
    }
}
