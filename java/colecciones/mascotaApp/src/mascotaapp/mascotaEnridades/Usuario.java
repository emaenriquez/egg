
package mascotaapp.mascotaEnridades;

import enumeraciones.Sexohumano;
import java.util.List;

public class Usuario {
    public String nombre;
    public String apodo;
    public String tipo;
    public Sexohumano sexo;
    
    //private Mascota mascota;
    private List<Mascota> mascota;
    private Mascota mascotaFavorito;
    
    public Usuario() {
    }

    /*
    public Usuario(String nombre, String apodo, String tipo, Sexohumano sexo) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.sexo = sexo;
    }*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Sexohumano getSexo() {
        return sexo;
    }

    public void setSexo(Sexohumano sexo) {
        this.sexo = sexo;
    }

    public List<Mascota> getMascota() {
        return mascota;
    }

    public void setMascota(List<Mascota> mascota) {
        this.mascota = mascota;
    }

    public Mascota getMascotaFavorito() {
        return mascotaFavorito;
    }

    public void setMascotaFavorito(Mascota mascotaFavorito) {
        this.mascotaFavorito = mascotaFavorito;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", sexo=" + sexo + ", mascota=" + mascota + ", mascotaFavorito=" + mascotaFavorito + '}';
    }

    
    
    
}
