
package mascotaapp;

import enumeraciones.Sexoanimal;
import enumeraciones.Sexohumano;
import java.util.ArrayList;
import java.util.List;
import mascotaapp.mascotaEnridades.Mascota;
import mascotaapp.mascotaEnridades.Usuario;



public class MascotaApp {

    public static void main(String[] args) {
        
        Mascota m1 = new Mascota("fer", "chiquito", "perro", Sexoanimal.MACHO);
        Mascota m2 = new Mascota("michi", "naranjoso", "gato", Sexoanimal.HEMBRA);
        
        List<Mascota> mascota = new ArrayList();
        
        mascota.add(m1);
        mascota.add(m2);
        
        Usuario u1 = new Usuario();
        
        u1.setNombre("emanuel");
        u1.setSexo(Sexohumano.HOMBRE);
        
        u1.setMascotaFavorito(m1);
        u1.setMascota(mascota);
        
        u1.setMascota(mascota);
        
        System.out.println(u1.toString());
        
        /*
        Mascota m1 = new Mascota<RazaPeruna>("fer", "ferchuqyeu", "perro", Sexoanimal.MACHO);
        
        m1.setRaza(RazaPeruna.MESTIZO);
        
        System.out.println(m1.toString());
        
        Mascota m2 = new Mascota<RazaGatuna>("fem","ferm","gato",Sexoanimal.HEMBRA);
        
        m2.setRaza(RazaGatuna.MONDONGO);
        
        
        System.out.println(m2.toString());
        */
        
        /*
        Usuario u = new Usuario();
        
        u.setSexo(Sexohumano.HOMBRE);
        
        System.out.println(u.getSexo());
        
        System.out.println(RazaPeruna.BEAGEL.getCodigo());
        
        String raza_input = "PITBULL";

        for (RazaPeruna aux : RazaPeruna.values()) {
            
            if(aux.toString().equals(raza_input)){
                System.out.println("raza_input es igual a raza");  
            }
            
        }*/
        /*
        ArrayList<String> personas = new ArrayList();
        
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
        
        
        /*
        ServicioMascota srv = new ServicioMascota();
        
        srv.fabricaMascota(2);
          
        srv.eliminarNombre("camila");
          
        srv.mostrarMascota();
             
        HashMap<String,Mascota> nombres = new HashMap();
    
        
        nombres.put("1",new Mascota("neri", "ternera", "perro"));
        nombres.put("2",new Mascota("bigotes", "señor boigotes", "gato"));

        
        
        for (Map.Entry<String, Mascota> entry : nombres.entrySet()) {
            String key = entry.getKey();
            Mascota value = entry.getValue();
            
            System.out.println("key= " + key + "valor= " + value);
            
        }
        */

    }
    
}
