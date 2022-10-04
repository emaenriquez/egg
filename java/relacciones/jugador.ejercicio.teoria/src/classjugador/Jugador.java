
package classjugador;

public class Jugador {
    private String nombre;
    private String apellido;
    private String posicion_juego;
    private Integer numero_camiseta;

    public Jugador() {
    }

    public Jugador(String nombre, String apellido, String posicion_juego, Integer numero_camiseta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion_juego = posicion_juego;
        this.numero_camiseta = numero_camiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPosicion_juego() {
        return posicion_juego;
    }

    public void setPosicion_juego(String posicion_juego) {
        this.posicion_juego = posicion_juego;
    }

    public Integer getNumero_camiseta() {
        return numero_camiseta;
    }

    public void setNumero_camiseta(Integer numero_camiseta) {
        this.numero_camiseta = numero_camiseta;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", apellido=" + apellido + ", posicion_juego=" + posicion_juego + ", numero_camiseta=" + numero_camiseta + '}';
    }
    
    
}
