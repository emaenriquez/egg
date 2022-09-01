/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import Clase.Circuferencia;
import java.util.Scanner;

/**
 *
 * @author emanuel
 */
public class metodos {
    
    public Circuferencia crearCircuferencia(){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese radio circuferencia");
        double rad = leer.nextDouble();
        
        return new Circuferencia(rad);
    }
    
    public double perimetro(Circuferencia cir){
        double area,rad,pi = 3.1415;
        
        rad = cir.getRadio();
        
        area = 2*pi*rad;
        
        return area;
    }
    
    public double area(Circuferencia cir){
        double area,rad,pi = 3.1415;
        
        rad = cir.getRadio();
        
        area = 2*pi*rad;
        
        return area;
    }
    
}
