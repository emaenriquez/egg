/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

//import clase.Persona;
//import java.util.Date;
import clase.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author emanuel
 */
public class Metodos {
    
    Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona(){
        System.out.print("ingrse su nombre");
        String nombre = leer.nextLine();
        System.out.println("ingrese su fecha de nacimiento");
        System.out.print("ingrese dia");
        int dia = leer.nextInt();
        
        System.out.print("ingrese mes");
        int mes = leer.nextInt();
        
        System.out.println("ingrese año");
        int anio = leer.nextInt();
        
        Date fecha = new Date(anio-1900,mes-1,dia);
        System.out.println(fecha);
        return new Persona(nombre, fecha);
     
    }
    
    public int calcularEdad(Persona p1){
        Date fechaACtual = new Date();
        
        int edad = (fechaACtual.getYear() - p1.getFechaNacimiento().getYear()) - 1;
        
        if(fechaACtual.getMonth() >= p1.getFechaNacimiento().getMonth()){
            if(fechaACtual.getDate() >= p1.getFechaNacimiento().getDate()){
                edad++;
            }
        }
        
        return edad;
    }
    
     
    public int menorQue(Persona p, int edad) {
        int es;
        if(calcularEdad(p) < edad) {
            es = -1;
        } else if (calcularEdad(p) == edad) {
            es = 0;
        } else {
            es = 1;
        }
        return es;
    }
    
    public void mostrarPersona(Persona p1){
        
        System.out.println("");
        System.out.println("persona");
        System.out.println("nombre: " + p1.getNombre());
        System.out.println("fecha: " + p1.getFechaNacimiento());
    }
}
