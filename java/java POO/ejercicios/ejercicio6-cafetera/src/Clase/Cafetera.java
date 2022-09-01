/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

/**
 *
 * @author emanuel
 */
public class Cafetera {
    public int capacidadMaxima;
    public int capacidadMinima;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int capacidadMinima) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadMinima = capacidadMinima;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCapacidadMinima() {
        return capacidadMinima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCapacidadMinima(int capacidadMinima) {
        this.capacidadMinima = capacidadMinima;
    }
    
}
