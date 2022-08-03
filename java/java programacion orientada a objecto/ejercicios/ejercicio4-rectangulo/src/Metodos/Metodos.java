/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import clase.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author emanuel
 */
public class Metodos {
    
    public Rectangulo crearRectangulo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la base del rectangulo");
        int base =leer.nextInt();
        System.out.println("ingrese la altura del rectangulo");
        int altura =leer.nextInt();
        
        return new Rectangulo(base, altura);
    }
    
    // método para calcular la superficie del rectángulo
    
    public int superficie(Rectangulo base,Rectangulo altura){
    
        int superficie = base.getBase() * altura.getAltura();
        
        return superficie;
    }
    
    // un método para calcular el perímetro del rectángulo
    public int perimetro(Rectangulo base,Rectangulo altura){
    
        int perimetro = ( base.getBase() + altura.getAltura())*2;
        
        return perimetro;
    }
    // método que dibujará el rectángulo mediante asteriscos usando la base y la altura.
    
     public void dibujarRectangulo(Rectangulo rectang) {
        System.out.println("Réctangulo: ");
        System.out.println();
        
        for(int h = 1; h <= rectang.getAltura(); h++) {
            
            for(int b = 1; b <= rectang.getBase(); b++) {
                
                if(h == 1 || h == rectang.getAltura()) {
                    System.out.print(" * ");
                } else if(b == 1 || b == rectang.getBase()) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
                
            }
            
            System.out.println();
        }
    }
}
