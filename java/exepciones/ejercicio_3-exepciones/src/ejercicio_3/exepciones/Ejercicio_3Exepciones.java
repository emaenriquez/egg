
package ejercicio_3.exepciones;

import java.util.Scanner;
import metodos.Metodo;

public class Ejercicio_3Exepciones {

    public static void main(String[] args) throws Exception {
        
        
            Metodo m1 = new Metodo();
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
            System.out.println("ingrese numero 1");
            String numero1 = leer.nextLine();
            System.out.println("ingrese numero 2");
            String numero2 = leer.nextLine();
            
            m1.numero(numero1, numero2);
           
        
        
    }
    

}
