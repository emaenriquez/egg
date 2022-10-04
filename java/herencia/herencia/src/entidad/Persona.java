
package entidad;

public class Persona {
    // el modificador de acceso protected permite que las 
    // subclases puedan acceder a los atributos sin la necesidad de getters y setters. 
    protected String nombre;
    protected Integer edad;
    protected Integer documento;

    public Persona(String nombre, Integer edad, Integer documento) {
        this.nombre = nombre;
        this.edad = edad;
        this.documento = documento;
    }
    
    public void codear(){
        System.out.println("una persona no codea");
    }
    
}

class Alumno extends Persona{
    
    private String materia;

    public Alumno(String materia, String nombre, Integer edad, Integer documento) {
        // hacer referencia o llamar a los atributos, métodos y 
        // constructores de la superclase en las subclases.
        super(nombre, edad, documento);
        this.materia = materia;
    }
    
    @Override
    public void codear(){
        System.out.println("la persona codea");
    }
    
}

