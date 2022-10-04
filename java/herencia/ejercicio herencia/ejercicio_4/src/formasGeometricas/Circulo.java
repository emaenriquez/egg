
package formasGeometricas;

import calculos.calculosCirculo;

public class Circulo implements calculosCirculo{
    public double radio;
    public double diametro;

    public Circulo() {
    }

    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    @Override
    public void calcular_area_circulo() {
        double area = NUMERO_PI * Math.pow(radio, 2);
        System.out.println("el area del circulo es " + area);
    }

    @Override
    public void calcular_perimetro_circulo() {
        double perimetro = NUMERO_PI * diametro;
        System.out.println("el perimetro de un circulo es " + perimetro);
    }
    
    
}
