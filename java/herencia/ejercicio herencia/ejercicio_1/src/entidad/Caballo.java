package entidad;

public class Caballo extends Animal{

    public Caballo() {
    }

    public Caballo(String nombre, String alimento, int edad, String raza_animal) {
        super(nombre, alimento, edad, raza_animal);
    }
    
    @Override
    public void alimentarse(){
        System.out.println("el caballo come " + alimento);
    }
    
}
