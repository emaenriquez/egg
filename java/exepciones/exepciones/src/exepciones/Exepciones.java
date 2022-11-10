
package exepciones;

import java.util.ArrayList;
import java.util.List;
import servcio.Servicio;

public class Exepciones {

    public static void main(String[] args) {
        
        try{
            int division = 10/0;
        } catch(ArithmeticException a){
            // ArithmeticException - Exception - NumberFormatException
            System.out.println("ERROR: la division fallo " + a.getMessage());
            System.out.println("ERROR: la division fallo " + a);
            System.out.println("ERROR: la division fallo " + a.fillInStackTrace());

        } finally{
            System.out.println("saliendo del try");
        }
        
        Servicio srv = new Servicio();
        
        try{
            System.out.println(srv.division());
        } catch(ArithmeticException error){
            System.out.println("error la division no se puede hacer por cero"+ error);
        }
        
        List<Integer> lista = new ArrayList();
        try{
            srv.agregar(lista, 2);

            for (Integer integer : lista) {
                System.out.println("lo elementos son " + integer);
            }
        } catch(Exception error){
            System.out.println(error.getMessage());
        }
    }
    
}
