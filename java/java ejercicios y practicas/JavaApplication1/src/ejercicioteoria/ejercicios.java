/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioteoria;

import java.util.Arrays;
import java.util.Scanner;
import static javaapplication1.funciones.sumar;

/**
 *
 * @author emanuel
 */
public class ejercicios {
    public static void main(String[] args) {

        /*
        
        EJERCICIO 3
        Define variables donde puedas alojar los resultados y prueba
        usar dos operadores de cada tipo.
        
        int n1 = 10;
        int n2 = 5;
        
        int suma = n1 + n2;
        double division = n1 / n2;
        boolean bandera = n1 < n2;
        
        System.out.println("la suma de " + n1 + " "  + n2 + " es " + suma);
        System.out.println("la division de " + n1 + " "  + n2 + " es " + division);
        System.out.println("la boolean de " + n1 + " "  + n2 + " es " + bandera);
        
        */
        
        /*
        
        EJERCICIO 4
        Define una variable que aloje tu nombre y otra que guarde tu edad. 
        Imprime ambas variables por pantalla.
        
        String nom = "emanuel";
        int edad = 19;
       
        System.out.println("mi nombre es " + nom + " y mi edad es " + edad);
        
        */
        
        /*
        
        EJERCICIO 5
        Define una variable de tipo boolean, double y char.
        Guarda información en ellas a través del Scanner.
        
        Scanner leer = new Scanner(System.in);
        
        double tipodouble = leer.nextDouble();
        boolean tipoboleano = leer.nextBoolean();
        
        System.out.println("variable tipo double " + tipodouble + "variable tipo 
        boolean " + tipoboleano );
        
        */
        
        /*
        
        EJERCICIO 6
        Implementar un programa que le pida dos números enteros a usuario y 
        determine si ambos o alguno de ellos es mayor a 2
        
        System.out.println("ingrese numero 1");
        int numero1 = leer.nextInt();
        
        System.out.println("ingrese numero 2");
        int numero2 = leer.nextInt();
       
        
        if(numero1 >= 25){
            System.out.println("numero 1 es mayor que 25");
        } else {
            System.out.println("numero 1 no es mayor que 25");
        } 
        
        if(numero2 >= 25){
            System.out.println("numero 2 es mayor que 25");
        } else {
            System.out.println("numero 2 no es mayor que 25");
        }
            
        
        */
        
        /*
        
        EJERCICIO 7
        Considera que estás desarrollando una web para una empresa que 
        fabrica motores (suponemos 
        que se trata del tipo de motor de una bomba para mover fluidos). 
        Definir una variable tipoMotor y 
        permitir que el usuario ingrese un valor entre 1 y 4. El programa 
        debe mostrar lo siguiente:
        
        
        
        System.out.println("ingrese un numero del 1 a 4");
        int motor = leer.nextInt();
        
        switch(motor){
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("“La bomba es una bomba de hormigón");
                break;
            case 4:
                System.out.println("“La bomba es una bomba de pasta alimenticia");
                break;
            default:
                   System.out.println("No existe un valor válido para tipo de bomba");
        }
        
        */
        
        /*
        While
        
        EJERCICIO 8
        Escriba un programa que valide si una nota está entre 0 y 10, 
        sino está entre 0 y 10 la nota se 
        pedirá de nuevo hasta que la nota sea correcta
        
        Scanner n = new Scanner(System.in);
        
        int nota;
        
        System.out.println("ingrese su nota debe estar entre 0 y 10");
        nota = n.nextInt();
        
        while(nota <0 || nota >10 ){
            System.out.println("ingrese un numero nuevamente");
            nota = s.nextInt();
        }
        System.out.println("felicidades su nota esta entre 0 y 10"); */
        
        
        /*
        Do While
        
        EJERCICIO 9
        Escriba un programa que lea 20 números. Si el número leído es igual a 
        cero se debe salir del 
        bucle y mostrar el mensaje "Se capturó el numero cero". 
        El programa deberá calcular y mostrar el 
        resultado de la suma de los números leídos, 
        pero si el número es negativo no debe sumarse. 
        
        System.out.println("Ingrese 20 numeros.");
        int numero;
        int cont=1;
        int suma=0;
        do {
            System.out.println("Ingrese el numero " + (cont++) );
            numero= leer.nextInt();
        
        if (numero > 0){
            suma=suma+numero;
        }
        }while (numero != 0 && cont <= 20);
        
        System.out.println("EL total es de " +suma);}} */
        
        /*
        For
        
        EJERCICIO 10
        Realizar un programa que lea 4 números (comprendidos entre 1 y 20) 
        e imprima el número 
        ingresado seguido de tantos asteriscos como indique su valor. 
        Por ejemplo
        
        5 *****
        3 ***
        11 ***********
        2 **
        
        
        int n = 0;
        Scanner s = new Scanner(System.in);
        
        for(int i = 0; i < 4 ;i++){
            System.out.println("ingrese s cuatro numeros");
            n = s.nextInt();   
            for(int j=0 ; j < n;j++){
                System.out.print("*");
            }
        } */
        
        
        /*
        
        EJERCICIO 12
        Crea un procedimiento EsMultiplo que reciba los dos números pasados 
        por el usuario, validando que el primer numero múltiplo del segundo y e 
        imprima si el primer numero es múltiplo del segundo, sino informe que 
        no lo son.
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese numero 1");
        int num1 = leer.nextInt();
        System.out.println("ingrese numero 2");
        int num2 = leer.nextInt();
        
        int sumar = sumar(num1,num2);
        
        System.out.println(sumar);
        
        public static int sumar(int num1, int num2){
        
        if(num1 % num2 == 0){
            System.out.println("el numero " + num1 + " es multiplo del segundo " + num2);
        } else{
            System.out.println("el primer numero no es multiplo del segundo");
        }
        
        return 0;
        
        }
        
        */

        String[] equipo = new String[1];
        
        for(int i = 0; i < equipo.length;i++){
            equipo[i]="emanuel";
        }
        
        for(int i = 0; i < equipo.length;i++){
            System.out.println(Arrays.toString(equipo));
        }
        System.out.println("");
        
       
        
    }
}
