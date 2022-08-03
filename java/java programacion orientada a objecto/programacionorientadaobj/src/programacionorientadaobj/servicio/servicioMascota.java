/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionorientadaobj.servicio;

import java.util.Scanner;
import programacionorientadaobj.entidades.Mascota;

/**
 *
 * @author emanuel
 */
public class servicioMascota {
    
    private Scanner leer = new Scanner(System.in);
    
    public Mascota crearMascota(){
        
      System.out.println("introducir nombre");
      String nombre = leer.nextLine();
      
      System.out.println("introducir apodo"); 
      String apodo = leer.nextLine();
      
      System.out.println("introducir tipo"); 
      String tipo = leer.nextLine();
    
      return new Mascota(nombre, apodo, tipo);

    }
    
    
}
