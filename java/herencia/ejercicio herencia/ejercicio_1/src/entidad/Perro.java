
package entidad;


public class Perro extends Animal {

    public Perro() {
    }

    public Perro(String nombre, String alimento, int edad, String raza_animal) {
        super(nombre, alimento, edad, raza_animal);
    }

    @Override
    public void alimentarse() {
        System.out.println("el perro se alimenta de " + alimento);
    }
    
}
