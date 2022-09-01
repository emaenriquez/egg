package servicio;
import entidad.Cine;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class CineServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
     
    public Cine crearPelicula(){

        System.out.println("ingrese titulo de la pelicula");
        String pelicula = leer.nextLine();
                
        System.out.println("ingrese el nombre del director");
        String director = leer.nextLine();
                
        System.out.println("ingrese la duracion de pelicula");
        int duracion_pelicula = leer.nextInt();
            
        return new Cine(pelicula, director, duracion_pelicula);

    }
    
    public void mostrarPeliculas(ArrayList<Cine> pelis){

        Iterator it = pelis.iterator();
        
        while(it.hasNext()){
            System.out.println(it.next() + " ");
        }

    }
    
    public void peliMasDeUnaHora(ArrayList<Cine> peli) {

        System.out.println("las pelis mas de una hora son");

        ArrayList<Cine> peliMayorHora = new ArrayList();
        for (Cine aux : peli) {
            if (aux.getDuracion_pelicula()> 1) {
                peliMayorHora.add(aux);
            }
        }

        Iterator it = peliMayorHora.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
    }
    
    // mayor a menor
    public void ordenarPelis(ArrayList<Cine> peli){
        Collections.sort(peli);
    }
}
