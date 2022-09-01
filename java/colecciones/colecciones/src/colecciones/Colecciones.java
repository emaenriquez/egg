
package colecciones;

import Libro.Libro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import servicio.Servcio;


public class Colecciones {

          public static void main(String[] args) {
        
         // Una colección representa un grupo de objetos, conocidos como elementos. Podemos crear una colección con cualquier tipo de objeto
         
         /*
          La principal diferencia entre las colecciones y los arreglos tradicionales es que las colecciones 
          crecen de manera dinámica a medida que se van agregando objetos
         
         */
         /*
          --------- Lista ---------
          ARRAYLIST
          A medida que se agregan más elementos, su tamaño aumenta dinámicamente
         
          LINKEDLIST
          Se implementa como una lista de doble enlace. Su rendimiento al agregar y quitar es mejor que 
          Arraylist, pero peor en los métodos set y get
         
          Metodos: 
          
          remove(int índice): Este método remueve un elemento de un índice especifico
          
          remove(elemento): Este método remueve la primera aparición de un elemento a borrar en una  lista

         */
         
         ArrayList <Integer> numeros = new ArrayList();       
         
          int a1 = 1;
          int a2 = 2;
          int a3 = 3;
          int a4 = 4;
          int a5 = 5;
          numeros.add(a1);
          numeros.add(a2);
          numeros.add(a3);
          numeros.add(a4);
          numeros.add(a5);
          numeros.remove(0); // remueve por el indice

          /*
          
          for(int n  : numeros){
              System.out.println(n);
          }
         
          */
          
          LinkedList<Integer> num = new LinkedList();
          
         
         /*
          --------- conjunto ---------
         Set modelan una colección de objetos de una misma clase donde cada 
         elemento aparece solo una vez
         
         el HashSet crea un código hash para cada valor, evitando 
           que hayan dos valores iguales o duplicados
         
          TreeSet
          TreeSet mantiene todos sus elementos 
          de manera ordenada (forma ascendente), pero los métodos de agregar, eliminar son más lentos 
          que el HashSe
          
         remove(elemento): Este método remueve la primera aparición de un elemento a borrar en un conjunto
         */
         
          HashSet<Integer> nombres = new HashSet();          
          
          Integer numeros_n1 = 10;
          Integer numeros_n2 = 1;
          Integer numeros_n3 = 130;
          Integer numeros_n4 = 14;
          Integer numeros_n5 = 132;

          nombres.add(numeros_n1);
          nombres.add(numeros_n2);
          nombres.add(numeros_n3);
          nombres.add(numeros_n4);
          nombres.add(numeros_n5);
          
          nombres.remove(132);
          
          for(Integer h : nombres){
              System.out.println(h);
          }
          
          TreeSet<Integer> n = new TreeSet();
          LinkedHashSet<String> frase = new LinkedHashSet();

          /*
          --------- Mapas ---------
          Los mapas modelan un objeto a través de una llave y un valor. Esto significa que cada valor de 
          nuestro mapa, va a tener una llave única para representar dicho valor. Las llaves de nuestro mapa 
          no pueden repetirse, pero los valores sí. 
           
          HASHMAP
          Es un mapa implementado a través de una tabla hash, las llaves se almacenan utilizando un 
           algoritmo de hash solo para las llaves y evitar que se repitan. 6
           
          TREEMAP
          Es un mapa que ordena los elementos de manera ascendente a través de las llaves. 
            
          LINKEDHASHMAP
          Es un HashMap que conserva el orden de inserción 
          
         remove(llave): Este método remueve la primera aparición de la llave de un elemento a borrar en un mapa
          */
          
          //HashMap<llave,valor> indetificador = new HashMap();
          HashMap<Integer,String> personas_a = new HashMap();
          
          int dni = 44820598;
          String nombre= "emanuel enriquez";
          personas_a.put(dni,nombre);
          
          //personas_a.remove(44820598);
          
          //  recorer las dos partes de un mapa
          for(Map.Entry<Integer , String> entry : personas_a.entrySet()){
                    System.out.println("documento = " + entry.getKey() + " nombre = " + entry.getValue());
          }
          // mostrar key
          for(Integer dn : personas_a.keySet()){
              System.out.println("documento " + dn);
          }
          // mostrar valores
          for(String nombre_personas : personas_a.values()){
                    System.out.println("Nombres " + nombre_personas);
          }
          TreeMap<Integer,String> personas_b  = new TreeMap();
          LinkedHashMap<Integer,String> personas_C = new LinkedHashMap();
          
          /*
          --------- iterator ---------       
          El Iterator es un objeto que pertenece al framework de colecciones. Este, nos permite recorrer, 
          acceder a la información y eliminar algún elemento de una colección.
         
          1. boolean hasNext(): Retorna verdadero si al iterator le quedan elementos por iterar
          2. Object next(): Devuelve el siguiente elemento en la colección, mientras le método hasNext() retorne true. 
          Este método es el que nos sirve para mostrar el elemento,
          3. void remove(): Elimina el elemento actual de la colección
          
         Los mapas son los únicos que no podemos eliminar mientras las iteramos.
          
          */
          
          ArrayList<String> lista = new ArrayList();
          lista.add("a");
          lista.add("b");
          
          Iterator iterator = lista.iterator();
          System.out.println("los elementos son :  ");
          
          while(iterator.hasNext()){
                    System.out.println(iterator.next());
          }
          
          // ELIMINAR UN ELEMENTO DE UNA COLECCIÓN CON ITERATOR
          
          ArrayList<String> palabras = new ArrayList();
          
          palabras.add("dragon ball");
          palabras.add("hola");
          palabras.add("adios");
          
          Iterator iteraccion_palabras = palabras.iterator();
          
          while(iteraccion_palabras.hasNext()){
                    if(iteraccion_palabras.next().equals("hola")){
                              iteraccion_palabras.remove();
                    }
          }
          
          // ORDENAR UNA COLECCIÓN
         //Los elementos, que vamos agregando a nuestra colección se van a mostrar según se fueron 
         //agregando y nosotros capaz, necesitemos mostrar o tener todos los elementos ordenados
          
         
          // ORDENAR UNA COLECCIÓN
         
          // lista
          ArrayList<Integer>  n1 = new ArrayList();
         
          int a = 10;
          int b = 20;
          n1.add(b);
          n1.add(a);
          n1.add(b);
          n1.add(b);
          
          Collections.sort(n1);
          
          for(Integer j : n1){
                    System.out.println(j);
          }
          //colecciones
          HashSet<Integer> num_set = new HashSet();
          
          int mun =0;
          int h = 10;
          int t = 5;
          int l = 9;
          
          num_set.add(mun);
          num_set.add(h);
          num_set.add(t);
          num_set.add(l);
          
          ArrayList<Integer> numeros_lista = new ArrayList(num_set);
          
          Collections.sort(numeros_lista);
            
          for(Integer k : numeros_lista){
                    System.out.println(k);
          }
         
          // mapas
          
          HashMap<Integer,String> alumnos = new HashMap();
          
          TreeMap<Integer,String> alumnos_tree = new TreeMap();
          
          ArrayList<Libro> libros = new ArrayList();
          
          Servcio srv = new Servcio();
          
          Libro l1 = srv.crearLibro();
          libros.add(l1);

          
          for(Libro ejemplar : libros){
              System.out.println(ejemplar);
          }
          
          
          // main lista
          ArrayList<Integer>notas = new ArrayList();
          
          srv.llenarLista(notas);
          
          Iterator it6 = notas.iterator();
          System.out.println("las notas son :  ");
          
          while(it6.hasNext()){
                    System.out.println(it6.next());
          }
          // conjunto
          HashSet<String> palbras = new HashSet();
          srv.llenarHash(palbras);
          
          Iterator it7 = palbras.iterator();
           System.out.println("las palabras son :  ");

          while(it7.hasNext()){
                    System.out.println(it7.next());
          }
          
          // map
          
          HashMap<Integer,String> alum = new HashMap();
          
          srv.leenarMap(alum);
          
          for(Map.Entry<Integer , String> entry : alum.entrySet()){
                    System.out.println("id = " + entry.getKey() + " nombre = " + entry.getValue());
          }
          
    }
          
}