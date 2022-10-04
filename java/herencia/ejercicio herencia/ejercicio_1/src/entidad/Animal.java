
package entidad;

public class Animal {
    protected String nombre;
    protected String alimento;
    protected int edad;
    protected String raza_animal;

    public Animal() {
    }

    public Animal(String nombre, String alimento, int edad, String raza_animal) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza_animal = raza_animal;
    }

    public void alimentarse() {
        
    }
    
}
