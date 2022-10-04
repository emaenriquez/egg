/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author emanuel
 */
public class Jugador {
    private int id;
    private String name;
    private boolean mojado;
    
    public boolean getMojado() {return mojado;}    
    
    public Jugador(int id) {
        this.id = id;
        this.name = "Jugador " + id;
    }
    
    public void disparo(Revolver r) {
        mojado = r.mojar();
        if(!mojado) {
            r.siguienteChorro();
        }
    }
    
    @Override
    public String toString() {return name;}
    
    
}
