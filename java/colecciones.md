
# Colecciones Resumen

<p>Una colección representa un grupo de objetos, conocidos como elementos. Podemos crear una colección con cualquier tipo de objeto</p>


<p>La principal diferencia entre las colecciones y los arreglos tradicionales es que las colecciones 
crecen de manera dinámica a medida que se van agregando objetos</p>

# Lista
## ARRAYLIST
A medida que se agregan más elementos, su tamaño aumenta dinámicamente
```java
    ArrayList <Integer> numeros = new ArrayList(); 
    int a1 = 1;
    int a2 = 2;
    // agregramos dos elementos a un arrlist
    numeros.add(a1);
    numeros.add(a2);

    // iteramos y mostramos cada elemento
    for(int n  : numeros){
        System.out.println(n);
    }  Iterator it7 = palbras.iterator();
           System.out.println("las palabras son :  ");

    while(it7.hasNext()){
        System.out.println(it7.next());
    }
```

## LINKEDLIST
Se implementa como una lista de doble enlace. Su rendimiento al agregar y quitar es mejor que 
Arraylist, pero peor en los métodos set y get
```java
    ArrayList <Integer> numeros = new ArrayList();   
```

## Metodos: 
remove(int índice): Este método remueve un elemento de un índice especifico
remove(elemento): Este método remueve la primera aparición de un elemento a borrar en una  lista

```java
    ArrayList <Integer> numeros = new ArrayList(); 
    int a1 = 1;
    int a2 = 2;
    int a3 = 90;
    numeros.add(a1);
    numeros.add(a2);

    numeros.remove(0) // por indice
    numeros.remove(90) // por valor
```

#  Mapas 
Los mapas modelan un objeto a través de una llave y un valor. Esto significa que cada valor de 
nuestro mapa, va a tener una llave única para representar dicho valor. Las llaves de nuestro mapa 
no pueden repetirse, pero los valores sí. 

## HASHMAP
Es un mapa implementado a través de una tabla hash, las llaves se almacenan utilizando un 
algoritmo de hash solo para las llaves y evitar que se repitan.

```java
    //HashMap<llave,valor> indetificador = new HashMap();
    HashMap<Integer,String> personas_a = new HashMap();
    
    int dni = 44820598;
    String nombre= "emanuel enriquez";
    personas_a.put(dni,nombre); // agragmos los valores 
```

## TREEMAP
Es un mapa que ordena los elementos de manera ascendente a través de las llaves. 
```java
    TreeMap<Integer,String> personas_b  = new TreeMap();
````

## LINKEDHASHMAP
Es un HashMap que conserva el orden de inserción 
```java
    LinkedHashMap<Integer,String> personas_C = new LinkedHashMap();
```

## metodos
remove(llave): Este método remueve la primera aparición de la llave de un elemento a borrar en un mapa
```java
    personas_a.remove(44820598);
```
## iterar un mapa
## recorer las dos partes de un mapa
```java
    for(Map.Entry<Integer , String> entry : personas_a.entrySet()){
        System.out.println("documento = " + entry.getKey() + " nombre = " + entry.getValue());
    }
```
### mostrar key
```java
    for(Integer dn : personas_a.keySet()){
        System.out.println("documento " + dn);
    }
```
### mostrar valores
```java
    for(String nombre_personas : personas_a.values()){
        System.out.println("Nombres " + nombre_personas);
    }
```

# Iterator
El Iterator es un objeto que pertenece al framework de colecciones. Este, nos permite recorrer, 
acceder a la información y eliminar algún elemento de una colección.

* 1. boolean hasNext(): Retorna verdadero si al iterator le quedan elementos por iterar
* 2. Object next(): Devuelve el siguiente elemento en la colección, mientras le método hasNext() retorne true. 
Este método es el que nos sirve para mostrar el elemento,
* 3. void remove(): Elimina el elemento actual de la colección

Los mapas son los únicos que no podemos eliminar mientras las iteramos.
```java
    ArrayList<String> lista = new ArrayList();
    lista.add("a");
    lista.add("b");
          
    Iterator iterator = lista.iterator();
    System.out.println("los elementos son :  ");
          
    while(iterator.hasNext()){
        System.out.println(iterator.next());
    }
```

# eliminar un elemento de un coleccion con iterator 
```java
    //lista 
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

    // colecciones

    HashSet<Integer> numerosSet = new HashSet();

    int a = 10;
    int b = 30;
    int c = 3;

    numerosSet.add(a);
    numerosSet.add(b);
    numerosSet.add(c)

    Iterator<Integer> it2 = numerosSet.iterator();

    while(it2.hasnext()){
        if(it2.next() == 3){
            it2.remove();
        }
    }

```
# ORDENAR UNA COLECCIÓN

Los elementos, que vamos agregando a nuestra colección se van a mostrar según se fueron 
agregando y nosotros capaz, necesitemos mostrar o tener todos los elementos ordenados
Nota: recordemos que los TreeSet y TreeMap se ordenan por sí mismos
## lista
```java
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
```
## conjunto
```java
    HashSet<Integer> num_set = new HashSet();

    int mun =0;
    int h = 10;
    int t = 5;
    int l = 9;

    num_set.add(mun);
    num_set.add(h);
    num_set.add(t);
    num_set.add(l);          
    // pasamos la conjunto a lista
    ArrayList<Integer> numeros_lista = new ArrayList(num_set);
    Collections.sort(numeros_lista);

    for(Integer k : numeros_lista){
        System.out.println(k);
    }
```

## Mapas
```java
    HashMap<Integer,String> alumnos = new HashMap();
    TreeMap<Integer,String> alumnos_tree = new TreeMap();
```        

# funciones 
          
## listas
```java
    // main
    ArrayList<Integer>notas = new ArrayList();

    srv.llenarLista(notas);

    Iterator it6 = notas.iterator();
    System.out.println("las notas son :  ");

    while(it6.hasNext()){
        System.out.println(it6.next());
    }
    // funcion
    public void llenarLista(ArrayList<Integer> nume){
        nume.add(20);
    }
```    
## conjunto
```java
    // main
    HashSet<String> palbras = new HashSet();
    
    srv.llenarHash(palbras);
    Iterator it7 = palbras.iterator();
    System.out.println("las palabras son :  ");

    while(it7.hasNext()){
        System.out.println(it7.next());
    }
    // funcio
    public void llenarHash(HashSet<String> palabras){
        palabras.add("hola");
    }
```    
## map
```java
    //main
    HashMap<Integer,String> alum = new HashMap();
          
    srv.leenarMap(alum);
          
    for(Map.Entry<Integer , String> entry : alum.entrySet()){
        System.out.println("id = " + entry.getKey() + " nombre = " + entry.getValue());
    }
    // funcion
    public void leenarMap(HashMap<Integer,String> alumnos){
        alumnos.put(1,"emanuel");
    }
```   
# DEVOLVER UNA COLECCIÓN EN FUNCIONES


## lista 
```java
    public ArrayList<Integer> llenarList(){
    
        ArrayList<Integer> numeros = new ArrayList();
        numeros.add(39);
        return numeros;
    }
```   

## coleccion
```java
    public HashSet<String> llenarHash(){
        HashSet<String>  palabras = new HashSet();
        palabras.add("hola mundo");
        return palabras;
    }
```   
# Map
```java
    public HashMap<Integer,String> llenarMap(){
        HashMap<Integer,String> alumnos = new HashMap();
        alumnos.put(2,"emanuel");
        return alumnos;
    }
```   
 masco.size()