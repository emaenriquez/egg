package ejercicio_1;

import entidad.Animal;
import entidad.Caballo;
import entidad.Gato;
import entidad.Perro;

public class Ejercicio_1 {

    public static void main(String[] args) {
        
        Animal perro1 = new Perro("pepe chiquito", "croquetas", 12, "doberman");
        perro1.alimentarse();
        
        Animal gato1 = new Gato("bigotes", "wiskas", 2, "naranjoso");
        gato1.alimentarse();
        
        Animal caballo1 = new Caballo("ruben", "pasto", 2, "puro");
        caballo1.alimentarse();
    }
    
}
