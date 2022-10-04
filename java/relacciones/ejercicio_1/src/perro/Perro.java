/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perro;

/**
 *
 * @author emanuel
 */
public class Perro {
    
    private String nombre_perro;
    private String raza;
    private int edad_perro;
    private String tamaño;

    public Perro() {
    }

    public Perro(String nombre_perro, String raza, int edad_perro, String tamaño) {
        this.nombre_perro = nombre_perro;
        this.raza = raza;
        this.edad_perro = edad_perro;
        this.tamaño = tamaño;
    }

    public String getNombre_perro() {
        return nombre_perro;
    }

    public void setNombre_perro(String nombre_perro) {
        this.nombre_perro = nombre_perro;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad_perro() {
        return edad_perro;
    }

    public void setEdad_perro(int edad_perro) {
        this.edad_perro = edad_perro;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre_perro=" + nombre_perro + ", raza=" + raza + ", edad_perro=" + edad_perro + ", tama\u00f1o=" + tamaño + '}';
    }
    
    
    

    
}
