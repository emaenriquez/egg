/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import clasePersona.Persona;
import java.util.Scanner;

/**
 *
 * @author emanuel
 */
public class Metodos {
    
    Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona(){
        
        Persona n1 = new Persona();
        
        System.out.println("ingrese su nombre");
        n1.setNombre(leer.nextLine());
        
        System.out.println("ingrese edad");
        n1.setEdad(leer.nextInt());
        
        System.out.println("ingrese su sexo H F O");
        n1.setSexo(leer.next());
        
        switch (n1.getSexo()) {
            case "H":
            case "h":
                System.out.println("su sexo es masculino");
                break;
            case "F":
            case "f":
                System.out.println("su sexo es femenino");
                break;
            case "O":
            case "o":
                System.out.println("su sexo es otro");
                break;
            default:
                System.out.println("su sexo es incorecto");
                break;
        }
        
        System.out.println("ingrese su peso");
        n1.setPeso(leer.nextDouble());
        
        System.out.println("ingrese su altura");
        n1.setAltura(leer.nextDouble());
        
        return n1;
        
    }
    
    public int calcularIMC(Persona n1){
        int valor = 0;
        double peso = (n1.getPeso() / (n1.getAltura()*2));
        
        if(peso < 20){
            System.out.println(" la persona está por debajo de su peso idea" + peso);
            valor = -1;
        } else if(peso > 20 || peso < 25){
            System.out.println("significa que la persona está en su peso ideal " + peso);
            valor = 0;
        } else if (peso > 25){
            System.out.println("la persona tiene sobrepeso" + peso);
            valor = 1;
        }
        
        return valor;
    }

    public void  esMayorDeEdad(Persona n1){
        if(n1.getEdad() >= 18){
            System.out.println("la persona es mayor de edad" + true);
        } else {
            System.out.println("la persona no es mayor de edad");
        }
    }    
    
    
}
