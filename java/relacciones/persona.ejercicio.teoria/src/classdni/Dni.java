/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classdni;

import classpersona.Persona;

/**
 *
 * @author emanuel
 */
public class Dni {
    private String caracter;
    private String dni;
    private Persona persona;

    public Dni() {
    }

    public Dni(String caracter, String dni, Persona persona) {
        this.caracter = caracter;
        this.dni = dni;
        this.persona = persona;
    }

    public String getCaracter() {
        return caracter;
    }

    public void setCaracter(String caracter) {
        this.caracter = caracter;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    

    
    
    
    
}
