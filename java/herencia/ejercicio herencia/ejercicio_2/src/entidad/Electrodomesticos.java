
package entidad;

import java.util.Scanner;

public class Electrodomesticos {
   
     Scanner leer = new Scanner(System.in).useDelimiter("\n");

    protected Double precio;
    protected String color;
    protected String consumoEnergetico;
    protected Double peso;

    public Electrodomesticos() {
    }

    public Electrodomesticos(Double precio, String color, String consumoEnergetico, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String comprobarConsumoEnergetico(char letra) {
        String letter = Character.toString(letra).toUpperCase();
        if (letter.contains("A") || letter.contains("B") || letter.contains("C") || letter.contains("D") || letter.contains("E") || letter.contains("F")) {
            return letter;
        } else {
            return "F";
        }
    }

    public String comprobarColor(String color) {
        if (color.toUpperCase().contains("BLANCO") || color.toUpperCase().contains("NEGRO") || color.toUpperCase().contains("ROJO") || color.toUpperCase().contains("AZUL") || color.toUpperCase().contains("GRIS")) {
            return color.toUpperCase();
        } else {
            return "BLANCO";
        }
    }

    public Electrodomesticos crearElectrodomestico() {
        System.out.println("Ingrese el color  ");
        String color = leer.next();
        System.out.println("Ingrese el consumo  ");
        char consumo = leer.next().charAt(0);
        System.out.println("Ingrese el peso");
        Double peso = leer.nextDouble();
        System.out.println("Ingrese el precio");
        Double precio = leer.nextDouble();
        System.out.println("hasta aca venimos bien");
        return new Electrodomesticos(precio, comprobarColor(color), comprobarConsumoEnergetico(consumo), peso);
    }

    public void precioFinal() {
        switch (this.getConsumoEnergetico()) {
            case "A":
                this.setPrecio(this.getPrecio() + 1000);
                break;
            case "B":
                this.setPrecio(this.getPrecio() + 800);
                break;
            case "C":
                this.setPrecio(this.getPrecio() + 600);
                break;
            case "D":
                this.setPrecio(this.getPrecio() + 500);
                break;
            case "E":
                this.setPrecio(this.getPrecio() + 300);
                break;
            case "F":
                this.setPrecio(this.getPrecio() + 100);
                break;
        }
        if (this.getPeso() >= 1 && this.getPeso() <= 19) {
            this.setPrecio(this.getPrecio() + 100);
        } else if (this.getPeso() >= 20 && this.getPeso() <= 49) {
            this.setPrecio(this.getPrecio() + 500);
        } else if (this.getPeso() >= 50 && this.getPeso() <= 79) {
            this.setPrecio(this.getPrecio() + 800);
        } else if (this.getPeso() >= 80) {
            this.setPrecio(this.getPrecio() + 1000);
        }
    }


}
