
package jugador.ejercicio.teoria;

import classequipo.Equipo;
import classjugador.Jugador;
import java.util.ArrayList;

public class JugadorEjercicioTeoria {

    public static void main(String[] args) {
        
        Jugador jugador_1 = new Jugador();
        Jugador jugador_2 = new Jugador();

        
        jugador_1.setNombre("messi");
        jugador_1.setApellido("andres");
        jugador_1.setNumero_camiseta(10);
        jugador_1.setPosicion_juego("delantero");
        
        jugador_2.setNombre("julian");
        jugador_2.setApellido("alvarez");
        jugador_2.setNumero_camiseta(9);
        jugador_2.setPosicion_juego("medio campista");
        
        ArrayList<Jugador> jugadores = new ArrayList();
        
        jugadores.add(jugador_1);
        jugadores.add(jugador_2);
        
        Equipo argentina = new Equipo();
        
        argentina.setJugadores(jugadores);
        
        System.out.println(argentina);
        
        
    }
    
}
