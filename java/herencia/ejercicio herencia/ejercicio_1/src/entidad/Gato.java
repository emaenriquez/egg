package entidad;

public class Gato extends Animal{

    public Gato() {
    }

    public Gato(String nombre, String alimento, int edad, String raza_animal) {
        super(nombre, alimento, edad, raza_animal);
    }
    
    @Override
    public void alimentarse(){
        System.out.println("el gato se alimenta de " + alimento);
    }
}
