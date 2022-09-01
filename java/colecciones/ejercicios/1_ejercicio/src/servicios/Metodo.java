
package servicios;

import entidad.Perro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Metodo {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    String res;
    public ArrayList<Perro> crearPerro(){
        
        ArrayList<Perro> perros = new ArrayList();
        Perro crear_nuevo_perro;
    
        do{
            System.out.println("quiere ingresar raza de perros ");
            res = leer.nextLine();
            if(res.equals("si")){
                System.out.println("ingrese raza");
                String raza =leer.nextLine();
                
                crear_nuevo_perro = new Perro(raza);
                perros.add(crear_nuevo_perro);
            }
        } while(res.equals("si"));
        
        return perros;
       
    }
    
    public void mostrarPerros(ArrayList<Perro> perros){
        perros.forEach((item)->{
            System.out.println(item + " ");
        });
    }
    
    public void eliminarPerrosUsusario(ArrayList<Perro> perros){
        
        System.out.println("ingrese el perro para eliminar");
        String raza_perro_eliminar = leer.nextLine();
        
        Iterator<Perro> it = perros.iterator();
        
        boolean find = false;
        
        while(it.hasNext()){
            if(it.next().getRaza_perros().equals(raza_perro_eliminar)){
                it.remove();
                find =true;
            }
        }
        
        if(find){
            mostrarPerros(perros);
        } else{
            System.out.println("no se encontro la raza ingresada");
            mostrarPerros(perros);
        }
        
    }
}
