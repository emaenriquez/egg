
package classequipo;

import classjugador.Jugador;
import java.util.List;


public class Equipo {
    private List<Jugador> jugadores;

    public Equipo() {
    }

    public Equipo(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Equipo{" + "jugadores=" + jugadores + '}';
    }
    
    
    
}
