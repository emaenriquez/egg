package herencia;

import entidad.Animal;
import entidad.Gato;
import entidad.Inplementacion_interfaz;
import entidad.NewClass;
import entidad.NewInterface;
import entidad.Perro;
import java.util.ArrayList;
import java.util.List;

public class Herencia {

    public static void main(String[] args) {
        
        List<Animal> animales = new ArrayList();
        
        //Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();
        
        animales.add(b);
        animales.add(c);
        
        for (Animal animale : animales) {
            animale.hacerRuido();
        }
        
        
        Inplementacion_interfaz f1 = new Inplementacion_interfaz();
        
        f1.metodo();
        System.out.println(f1.sumar());
        
        NewClass n = new NewClass();
        
        n.metodo();
        
    }
}


