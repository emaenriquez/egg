/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

//import java.util.ArrayList;

/**
 *
 * @author emanuel
 */
public class Perro {
    //ArrayList<String> raza_perros = new ArrayList();
    
    public String raza_perros;

    public Perro() {
    }

    public Perro(String raza_perros) {
        this.raza_perros = raza_perros;
    }

    public String getRaza_perros() {
        return raza_perros;
    }

    public void setRaza_perros(String raza_perros) {
        this.raza_perros = raza_perros;
    }

    @Override
    public String toString() {
        return "["+ raza_perros + ']';
    }
    
    
    
    
}
