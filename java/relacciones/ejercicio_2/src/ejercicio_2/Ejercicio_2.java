
package ejercicio_2;

import entidades.Juego;

public class Ejercicio_2 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int n_ronds = 1;
        boolean fin = false;
        Juego ruletaRusa = new Juego();
        ruletaRusa.llenarJuego();
        System.out.println();
        do {
            System.out.println("RONDA " + n_ronds);
            ruletaRusa.ronda(fin);
            n_ronds++;
        } while(fin);
        
    }
    
}
