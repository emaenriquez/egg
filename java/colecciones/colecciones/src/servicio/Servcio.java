/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import Libro.Libro;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author emanuel
 */
public class Servcio {
            Scanner leer = new Scanner(System.in).useDelimiter("\n");       
          public Libro crearLibro(){
              
                    System.out.println("ingrese el nombre del libro");
                    String titulo = leer.nextLine();
                    
                    System.out.println("ingrese el numero de pagina");
                    int paginas = leer.nextInt();
                    
                    return new Libro(titulo,paginas);
                    
          }
          
          
          // funciones 
          
          // listas
          public void llenarLista(ArrayList<Integer> nume){
                    nume.add(20);
          }
          // conjunto
          public void llenarHash(HashSet<String> palabras){
                    palabras.add("hola");
          }
          
          // map
          
          public void leenarMap(HashMap<Integer,String> alumnos){
                    alumnos.put(1,"emanuel");
          }
          
          // devolver una coleccion en funciones
          
          public ArrayList<Integer> llenarList(){
                    ArrayList<Integer> numeros = new ArrayList();
                    numeros.add(39);
                    return numeros;
          }
          
          public HashSet<String> llenarHash(){
                    HashSet<String>  palabras = new HashSet();
                    palabras.add("hola mundo");
                    return palabras;
          }
          
          public HashMap<Integer,String> llenarMap(){
                    HashMap<Integer,String> alumnos = new HashMap();
                    alumnos.put(2,"emanuel");
                    return alumnos;
                    
          }
}
