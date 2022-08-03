/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.practica;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author emanuel
 */
public class practica {
    
    public static void main(String[] args) {
    
        // es un sting
        String nombre = "emanuel";
        System.out.println("mi nombre es " + nombre);
        
        // es numero
        int num = 10;
        System.out.println("el numero es " + num);
        
        // numero con dicimal
        double numero  = 10.555;
        System.out.println("es un numero con decimal " + numero );
        
        int n1 = 10;
        int n2 = 5;
        
        int suma = n1 + n2;
        double division = n1 / n2;
        boolean bandera = n1 < n2;
        
        System.out.println("la suma de " + n1 + " "  + n2 + " es " + suma);
        System.out.println("la division de " + n1 + " "  + n2 + " es " + division);
        System.out.println("la boolean de " + n1 + " "  + n2 + " es " + bandera);
        
        
        /*
        scanner
        
                
        Scanner leer = new Scanner(System.in);
        
        String nom;
        int edad;
        
        System.out.println("ingrese su nombre");
        nom = leer.nextLine();
        
        System.out.println("ingrese su edad");
        edad = leer.nextInt();
       
        
        System.out.println("mi nombre es " + nom + " y mi edad es " + edad);
        
        */

        System.out.println("-------------------------");
        // recorrer vectores con bucle for
        String[] movie = {"Black adam","Superman","Batman","batman the long hallowen"};
        
        for(int i =0;i < movie.length;i++){
            System.out.println(movie[i]);
        }
        
        System.out.println("-------------------------");
        
        int[] myNum = {2,31,23,4,5,6,7,8,9,2,1};
        for(int i = 0; i < myNum.length;i++){
            System.out.println(myNum[i]);
        }
        
        System.out.println("-------------------------");
        
        // recorrer matriz con dos vectores
        int[][] numeros = {{12,3,4,5},{21,3,5,}};
        
        for(int i = 0;i < numeros.length;i++){
            for(int j = 0;j<numeros[i].length;j++){
                System.out.println(numeros[i][j]);
            }
        }
        
        System.out.println("-------------------------");
        
        // asignar valores a un vector con un bucle for
        int[] v = new int[5];
        
        for(int i = 0;i<5;i++){
            v[i] = i + 5;
        }
        
        for(int i = 0;i<5;i++){
            System.out.println("["+ v[i] + "]");
        }
        
        System.out.println("");
        
        System.out.println("-------------------------");
        // asignar valores a una matriz con un bucle for
        
        String[][] m = new String[3][3];
        
        
        for(int i = 0;i < m.length;i++){
            for(int j = 0;j<m[i].length;j++){
                m[i][j] = "A";
            }
        }
        
        for(int i = 0;i < m.length;i++){
            for(int j = 0;j<m[i].length;j++){
                System.out.println(m[i][j]);
            }
        }
        
        // devuelve un caracter en el indice
        System.out.println("Hola mundo ".charAt(5));
        // devuelve una parter de la cadena 
        System.out.println("Hola mundo ".substring(5));
        // devuelve una cadena de 0 a 2
        System.out.println("Hola mundo ".substring(0,2));
        
        // une dos cadenas
        String s1 = "hola ";
        String s2 = "mundo";
        
        System.out.println(s1.concat(s2));
        
        //devuelve en que indice esta la cadena que pusimos
        String s = "java desde cero";
        
        System.out.println(s.indexOf("cero"));
        
        System.out.println(s.indexOf("a",4));
        // especifica si son las mismas cadenas        
        boolean salida = "a".equals("java");
        System.out.println(salida + "SSsss");
            
        // convierte la cadena en minusculas
        String cadena = "JAVA";
        System.out.println(cadena.toLowerCase());
        // convierte la cadena en mayusculas
        String cadena2 = "java";
        System.out.println(cadena2.toUpperCase());
        //
        String palabra1 = "yava desde cero";
        System.out.println(palabra1.replace("y","j"));
        
        String numCadena = "11";
        
        System.out.println(Integer.parseInt(numCadena));
}}
