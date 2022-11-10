
package ejercicio_5.exepciones;

import entidad.Numero;
import java.util.InputMismatchException;
import java.util.Scanner;
import metodo.Metodo;

public class Ejercicio_5Exepciones {

    public static void main(String[] args) {
        Metodo m1 = new Metodo();
        Numero n1 = m1.generarNumero();
        int numero_usuario;
        int contador_fallos=0;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("el numero aleatorio es " + n1.getNumero());
        try{
            do{
                System.out.println("ingrese un numero");
                numero_usuario = leer.nextInt();
            
                if(numero_usuario > n1.getNumero()){
                    System.out.println("el numero ingresado es mayor que el numero de la computadora");
                    contador_fallos++;
                } else if(numero_usuario < n1.getNumero()){
                    System.out.println("el numero ingresado es menor que le numero de la computador<");
                    contador_fallos++;
                }
            
            } while(numero_usuario != n1.getNumero());
            
            System.out.println("la cantidad de vecez que lo intento adivinar el numero " + contador_fallos);
        
        } catch(InputMismatchException  e){
            System.out.println("lo que ingreso no es un numero");
        }
       
    }
    
}
