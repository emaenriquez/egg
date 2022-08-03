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
public class condicionales {
    
    public static void main(String[] args) {
    
    int opinion;
    Scanner leer = new Scanner(System.in);
    System.out.println("Claseique la pelicula del 1 a ");
    opinion = leer.nextInt();
     
    if(opinion >= 1 && opinion <= 5){

        switch(opinion){
            case 1:
            case 2:
                System.out.println("le damos 2 estrellas");
                break;
            case 3:
                System.out.println("le damos 3 estrellas");
                break;
            case 4:
                System.out.println("le damos 4 estrellas");
                break;
            case 5:
                System.out.println("le damos 5 estrellas");
                break;
                       
        }
    } else if(opinion < 0){
        System.out.println("una enee");
    } else if(opinion == 0){
        System.out.println("una ndeie");
    } else {
        System.out.println("una wn2i");
    }
    
    System.out.println("hasta la porxima");
         
    }
}
