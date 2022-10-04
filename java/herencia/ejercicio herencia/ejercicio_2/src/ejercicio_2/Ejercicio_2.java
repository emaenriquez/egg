
package ejercicio_2;
import entidad.Electrodomesticos;
import entidad.Lavadora;
import entidad.Televisor;
import java.util.ArrayList;


public class Ejercicio_2 {
    
    static double total;

    public static void main(String[] args) {
   
        
        Lavadora lavarropa = new Lavadora();
        Televisor smart = new Televisor();

        ArrayList<Electrodomesticos> listaElectro = new ArrayList<>();
        listaElectro.add(lavarropa.crearLavadora());
        listaElectro.add(smart.crearTelevisor());
        listaElectro.add(lavarropa.crearLavadora());
        listaElectro.add(smart.crearTelevisor());

        System.out.println("Cantidad de elementos en el arrayList:" + listaElectro.size());

        listaElectro.forEach((Electrodomesticos elemento) -> {
            elemento.precioFinal();
            System.out.println("el precio final de " + elemento.getClass() + "es de " + elemento.getPrecio());
            total = total + elemento.getPrecio();
        });
        System.out.println("La suma total de los electrodomesticos es " + total);
        

    }
    
}
