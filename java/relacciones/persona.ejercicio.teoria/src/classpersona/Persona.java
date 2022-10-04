/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classpersona;

import classdni.Dni;

/**
 *
 * @author emanuel
 */
public class Persona {
    private String nombre;
    private String apellido;
    private Dni documento;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Dni documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
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

    public Dni getDocumento() {
        return documento;
    }

    public void setDocumento(Dni documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + '}';
    }

    
}
