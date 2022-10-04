
package mascotaapp.mascotaEnridades;

import enumeraciones.Sexoanimal;

public class Mascota <T> {
    public String nombre;
    public String apodo;
    public String tipo;
    private T raza;
    private Sexoanimal sexo;
    
    
    public Mascota() {
    }

    public Mascota(String nombre, String apodo, String tipo, Sexoanimal sexo) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public T getRaza() {
        return raza;
    }

    public void setRaza(T raza) {
        this.raza = raza;
    }
    
    public Sexoanimal getSexo() {
        return sexo;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setSexo(Sexoanimal sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", raza=" + raza + ", sexo=" + sexo + '}';
    }
    
    
    
}
