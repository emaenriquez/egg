/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8.cadena;

import clase.Cadena;
import metodos.Metodos;

/**
 *
 * @author emanuel
 */
public class Ejercicio8Cadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Metodos c1 = new Metodos();
        
        Cadena srv = c1.ingreseFrase();
        
        c1.mostrarVocales(srv);
        c1.invertir(srv);
        c1.vecesRepetido(srv);
        c1.compararLongitud(srv);
        c1.unirFrases(srv);
        c1.reemplazar(srv);
        c1.contiene(srv);
    }
    
    
    
}
