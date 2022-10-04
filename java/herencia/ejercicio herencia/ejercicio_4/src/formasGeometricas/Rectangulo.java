
package formasGeometricas;

import calculos.calculosRectangulo;

public class Rectangulo implements calculosRectangulo{
    public double altura;
    public double base;

    public Rectangulo() {
    }

    public Rectangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }
    
    @Override
    public void calcular_area_rectangulo() {
        double area = base * altura;
        System.out.println("el area de un rectangulo es " + area);
    }

    @Override
    public void calcular_perimetro_rectangulo() {
        double perimetro = (base + altura) * 2;
        System.out.println("el perimetro de un rectangulo es " + perimetro);
    }
    
}
