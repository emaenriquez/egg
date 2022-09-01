package main;
import entidad.Cine;
import java.util.ArrayList;
import java.util.Scanner;
import servicio.CineServicio;

public class Main {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        CineServicio ps = new CineServicio();
        String respuesta;
        ArrayList<Cine>peli = new ArrayList();
        peli.add(ps.crearPelicula());
        ps.mostrarPeliculas(peli);
        
        do {
            System.out.println("Quiere ingresar otra pelicula");
            respuesta = leer.next();
            if (respuesta.equals("si")) {
               peli.add(ps.crearPelicula());   
            }

        } while (respuesta.equals("si"));
        
        for (Cine aux : peli) {
            System.out.println(aux);
        }
        ps.peliMasDeUnaHora(peli);
    }
        
}
    
