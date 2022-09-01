
package mascotaapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import mascotaapp.Sersviciomascota.ServicioMascota;
import mascotaapp.mascotaEnridades.Mascota;

public class MascotaApp {

    public static void main(String[] args) {

        ArrayList<String> personas = new ArrayList();
        
        /*
        
        personas.add("emanuel");
        personas.add("leo");
        personas.add("camila");
        
        Iterator<String> it = personas.iterator();
        
        while(it.hasNext()){
            String aux = it.next();
            
            //System.out.println(aux);
            
            if(aux.equals("leo")){
                it.remove();
            }
            
        }
        
        personas.forEach(cnsmr -> System.out.println(cnsmr));
        */
                
        /*
        
        for(String aux : personas){
            System.out.println(aux);
        }
        
        for (int i = 0; i < personas.size(); i++) {
            System.out.println(personas.get(i));
        }
        
     
        
        */
        
        
        /*
        String[] nombre = {"emanuel","david"};
        
        ArrayList<String> nombre_list = new ArrayList(Arrays.asList(nombre));
        ArrayList<String> nombre_list_2 = new ArrayList(Arrays.asList(nombre));
        
        nombre_list_2.addAll(nombre_list);
        */
        
        
        
        ServicioMascota srv = new ServicioMascota();
     /*
        srv.fabricaMascota(2);
          
        srv.eliminarNombre("camila");
          
        srv.mostrarMascota();
          */
     
        HashMap<String,Mascota> nombres = new HashMap();
    
        
        nombres.put("1",new Mascota("neri", "ternera", "perro"));
        nombres.put("2",new Mascota("bigotes", "señor boigotes", "gato"));

        
        
        for (Map.Entry<String, Mascota> entry : nombres.entrySet()) {
            String key = entry.getKey();
            Mascota value = entry.getValue();
            
            System.out.println("key= " + key + "valor= " + value);
            
        }
    }
    
}
