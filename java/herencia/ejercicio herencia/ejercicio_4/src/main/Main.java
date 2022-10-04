
package main;

import formasGeometricas.Circulo;
import formasGeometricas.Rectangulo;

public class Main {

    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(15, 12);
        circulo1.calcular_area_circulo();
        circulo1.calcular_perimetro_circulo();
        
        Rectangulo rectangulo1 = new Rectangulo(10, 5);
        rectangulo1.calcular_area_rectangulo();
        rectangulo1.calcular_perimetro_rectangulo();
    }

    
}
