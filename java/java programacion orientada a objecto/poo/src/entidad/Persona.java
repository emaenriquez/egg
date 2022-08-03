/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author emanuel
 */
public class Persona {
    public String nombre;
    public String fechaNacimiento;
    public int dni;

    public Persona(){
    
    }
    
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getDni() {
        return dni;
    }
    
    
    
    
    
}
