/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import entidad.Persona;

/**
 *
 * @author emanuel
 */
public class Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Persona primera = new Persona();
        Persona segunda = new Persona("emanuel");
        
        primera.setNombre("emanuel enriquez");
        segunda.getNombre();
    }
    
}
