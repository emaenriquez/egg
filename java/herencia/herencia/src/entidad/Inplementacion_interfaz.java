/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author emanuel
 */
public class Inplementacion_interfaz implements NewInterface {

    @Override
    public void metodo() {
        System.out.println("esto es un metodo abstracto");
    }

    @Override
    public int sumar() {
        int suma = 2+2;
        return suma;
    }
    
}
