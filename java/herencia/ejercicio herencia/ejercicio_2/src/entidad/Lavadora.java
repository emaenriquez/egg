/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author emanuel
 */
public class Lavadora extends Electrodomesticos{
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    protected Integer carga;

    public Lavadora() {
    }

    public Lavadora(Integer carga, Double precio, String color, String consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    public Lavadora crearLavadora() {
        System.out.println("Creamos una lavadora");
        System.out.println("");
        Electrodomesticos electro = crearElectrodomestico();
        System.out.println("ingresar carga");
        int carg = leer.nextInt();

        return new Lavadora(carg, electro.getPrecio(), electro.getColor(), electro.getConsumoEnergetico(), electro.getPeso());
    }

    @Override
    public void precioFinal() {
        super.precioFinal(); //To change body of generated methods, choose Tools | Templates.
        if (this.getCarga() > 30) this.setPrecio(this.getPrecio() + 500);
    }
    
}
