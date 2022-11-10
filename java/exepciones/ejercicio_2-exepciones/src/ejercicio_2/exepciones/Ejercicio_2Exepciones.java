
package ejercicio_2.exepciones;


public class Ejercicio_2Exepciones {

    public static void main(String[] args) {
        try{
            String[] cars = new String[5];
            
            for (int i = 0; i < 9; i++) {
                cars[i]= "emaune";
                System.out.println("los elementos del vector son " + cars[i]);
            }
            
            
        } catch(ArrayIndexOutOfBoundsException error){
            System.out.println("indice fuera de rango ");
        }
    }
    
}
