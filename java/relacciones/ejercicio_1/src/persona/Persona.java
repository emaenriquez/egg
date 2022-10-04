/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

import perro.Perro;

/**
 *
 * @author emanuel
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private double documento;
    private Perro nueva_mascota;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, double documento, Perro nueva_mascota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.nueva_mascota = nueva_mascota;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDocumento() {
        return documento;
    }

    public void setDocumento(double documento) {
        this.documento = documento;
    }

    public Perro getNueva_mascota() {
        return nueva_mascota;
    }

    public void setNueva_mascota(Perro nueva_mascota) {
        this.nueva_mascota = nueva_mascota;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + ", nueva_mascota=" + nueva_mascota + '}';
    }
    
    
}
