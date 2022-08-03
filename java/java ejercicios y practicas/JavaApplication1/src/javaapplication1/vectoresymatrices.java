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
public class vectoresymatrices {
    
    
    public static void main(String[] args) {
    
    int[] vector;
    vector = new int[2];
        
    // vector
    int[] producto = new int[3];
    
    // 
    /*
    declaracion de una matriz [][] los corchetes indica las dimensiones
    int [] [] matriz = {{4,9,3},{2,3,4}};
    4,9,3
    2,3,4
    */
    
    int [] [] matriz = {{4,9,3},{2,3,4}};
    
    System.out.println("ingresa los valores del vector " + vector.length);
    
    Scanner leer = new Scanner(System.in);
    
    for(int i = 0; i < vector.length;i++){
        System.out.print("v["+i+"]= ");
        vector[i] = leer.nextInt();
    }
    
    //multiplica vector por matriz
    int suma;
    
    for(int j=0;j <matriz[0].length;j++){
        
        suma = 0;
        
        for(int i = 0;i<vector.length;i++){
            suma += vector[i] * matriz[i][j];
        }
        
        producto[j] = suma;
    
    }
    
    String aux ="";
    
    //mostra vector
    System.out.println("vector: ");
    
    
    
    
    }
    
}
