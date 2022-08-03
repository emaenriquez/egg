/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import clase.Cadena;
import java.util.Scanner;

/**
 *
 * @author emanuel
 */
public class Metodos {
    
    Scanner leer = new Scanner(System.in);
    
    public Cadena ingreseFrase(){
        System.out.println("ingrese su frase");
        String frase = leer.nextLine();
        int longitud = frase.length();
        return new Cadena(frase, longitud);
    }
    
    // Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
    public void mostrarVocales(Cadena c1){
        int contadorVocales = 0;
        
        for (int i = 0; i < c1.getLongitud(); i++) {
            
            if(c1.getCadena().charAt(i)=='a' || c1.getCadena().charAt(i)== 'e' || c1.getCadena().charAt(i)=='i' || 
            c1.getCadena().charAt(i)=='o' || c1.getCadena().charAt(i)=='u'){
                contadorVocales++;
                
            }
        }
        
        System.out.println(" - la cantidad de vocales son " + contadorVocales);
    }
    
    //Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por 
    public void invertir(Cadena c1){
        
        StringBuilder stringbuilder = new StringBuilder(c1.getCadena());
        
        String cadenaInvertida = stringbuilder.reverse().toString();
        
        System.out.println(" - la cadena normal es " + c1.getCadena() + " la cadena inverida es " + cadenaInvertida);
        
        /*
           for (int i = c1.getLongF()-1; i >= 0 ; i--) {   
            System.out.print(c1.getFrase().charAt(i));
            }
            System.out.println("");
        */

        
    }
    
    // Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se 
    // repite el carácter en la frase
    public int vecesRepetido(Cadena c1){
        
        System.out.println("ingrese letra y le dire cuanta veces se repite");
        
        String c = leer.nextLine();
        
        int cont = 0;
        for (int i = 0; i < c1.getLongitud(); i++) {
            if(c1.getCadena().charAt(i) == c.charAt(0)){
                cont = cont + 1;
            }
        }
        System.out.println(" - el caracter que ingreso se repite " + cont);
        return cont;
        
    }
    
    //Método compararLongitud(String frase), deberá comparar la longitud de la frase que 
    //compone la clase con otra nueva frase ingresada por el usuario
    public void compararLongitud(Cadena c1){
        System.out.println("ingrse una nueva frase para comparar su longitud");
        String nuevaFrase = leer.nextLine();
        
        if(c1.getLongitud() > nuevaFrase.length() ){
            System.out.println(" - la longitud de la primera frase es mayor a la segunda frase");
        } else{
            System.out.println(" - la longitud de la segunda frase es mayor que la primera");
        }
        
    }
    
    //Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con 
    //una nueva frase ingresada por el usuario y mostrar la frase resultante.
    public void unirFrases(Cadena c1){
    
        System.out.println("deme una frase para concatenar con la primera frase ");
        String frase = leer.nextLine();
        
        String nuevaFrase = c1.getCadena().concat(frase);
        
        System.out.println(" - la frase unida es " + " - " + nuevaFrase);
        
    }
    
    //Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se 
    //encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la frase resultante
    public void reemplazar(Cadena c1){
        
        System.out.println("deme un caracter para remplazar la letra a");
        String letra = leer.nextLine();
        
        String nuevaFrase = c1.getCadena().replace("a",letra);
        
        System.out.println(nuevaFrase);
    }
    
    //Método contiene(String letra), deberá comprobar si la frase contiene una letra que 
    //ingresa el usuario y devuelve verdadero si la contiene y falso si no.
    public void contiene(Cadena c1){
        System.out.println("ingrese una letra y le devolvere true si esta incluida en la frase ");
        
        String letra = leer.nextLine();
        
        System.out.println(c1.getCadena().contains(letra));
    }
    
}
