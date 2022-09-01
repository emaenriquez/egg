package servicio;
import entidad.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ServicioPaises {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Pais guardarPaises(){
        
        System.out.println("ingrese pais");
        
        String pais_res = leer.nextLine();
        
        return new Pais(pais_res);
    }
    
    public void mostrarElementos(HashSet<Pais> p){
        System.out.println("los paises ingresados son: ");
        for (Pais string : p) {
           System.out.println(string);
        }
    }
    
    public void ordenarElementosPaises(HashSet<Pais> orden_pais){
        
        System.out.println("los paises ordenados alfabeticamente");
        System.out.println("");
        
        List<Pais> p1 = new ArrayList(orden_pais);
        
        Collections.sort(p1);
        
        for (Pais paises_ordenados : p1) {
            System.out.println(paises_ordenados);
        }
    
    }
    
    public void pedirPais(HashSet<Pais> pais_set_buscar){
        System.out.println("ingrese pais que desea eleminar");
        String pais_ingresado = leer.nextLine();
        
        Iterator<Pais> it3 = pais_set_buscar.iterator();
        
        boolean find = false;
        
        while(it3.hasNext()){
            
            if(it3.next().getPais().equals(pais_ingresado)){
               it3.remove();
               find = true;
            }
         
        }
        
        if(find){
            mostrarElementos(pais_set_buscar);
        } else {
            System.out.println("pais no encontrado");
            mostrarElementos(pais_set_buscar);
        }
        
    }
    
}
    
