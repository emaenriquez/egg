/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author emanuel
 */
public class Cadena {
    public String cadena;
    public int longitud;

    public Cadena() {
    }

    public Cadena(String cadena, int longitud) {
        this.cadena = cadena;
        this.longitud = longitud;
    }

    public String getCadena() {
        return cadena;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    
    
}
