/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotaapp.Sersviciomascota;

import enumeraciones.Sexoanimal;
import enumeraciones.RazaPeruna;
import java.util.ArrayList;
import java.util.Scanner;
import mascotaapp.mascotaEnridades.Mascota;

/**
 *
 * @author emanuel
 */
public class ServicioMascota {
    
    Scanner leer = new Scanner(System.in);

    private final ArrayList<Mascota> masco;

    public ServicioMascota() {
        this.masco = new ArrayList();
    }
    
    public void crearMascota(){
        System.out.println("ingrese su nombre");
        String nombre = leer.nextLine();
          
        System.out.println("introducir apodo");
        String apodo = leer.nextLine();
          
        System.out.println("introduce el tipo ");
        String tipo = leer.nextLine();
          
      //  return new Mascota(nombre, apodo, tipo, RazaPeruna.BEAGEL, Sexoanimal.MACHO);
    }
    
    public void agregarMascota(Mascota m){
        masco.add(m);
    }
    
   public void mostrarMascota(){
        System.out.println("las mascota de la lista son");
          
        for (Mascota cota : masco) {
            System.out.println(cota.toString());
        }
          
        System.out.println("mascota = " + masco.size());
           
    }
   
    /* public void fabricaChiquito(int cantidad){
        for (int i = 0; i < cantidad; i++) {
            masco.add( new Mascota("ternera", "neri", "mestizo") );
                    
        }
    }

    public void fabricaMascota(int cantidad){
        for (int i = 0; i < cantidad; i++) {
            Mascota mascotaCreada = crearMascota();
            agregarMascota(mascotaCreada);
            System.out.println(mascotaCreada.toString());
        }
    }*/
    
   /*
     public void actualizarMascota(int index){
        Mascota m = masco.get(index);
        m.setApodo("roberto");
    }
    */
    
    public void actualizarMascota(int index){
        
        if(index <= masco.size()-1){
            System.out.println("");
            System.out.println("-----Actualizar Mascota-----");
            //Mascota m = crearMascota();
        
            //masco.set(index,m);
        } else {
            System.out.println("fallo al actualzar el indice es erroneo");
        }

    }
    
    public void removeMascota(int index){

        if(index <= masco.size()-1){
            masco.remove(index);
        } else {
            System.out.println("fallo a remover un elemento el indice es erroneo");
        }
        
    }
    
    public void eliminarNombre(String nombre){
        for (int i = 0; i < masco.size(); i++) {
            
            Mascota m = masco.get(i);
            
            if(m.getNombre().equals(nombre)){
                masco.remove(i);
            }
            
        }
    }
    
    public void actualizarNombre(String nombreviejo,String nombreNuevo){
        for (int i = 0; i < masco.size(); i++) {
            
            Mascota m = masco.get(i);
            
            if(m.getNombre().equals(nombreviejo)){
                m.setNombre(nombreNuevo);
            }
            
        }
    }

}
