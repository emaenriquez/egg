package entidad;
public class Cine implements Comparable<Cine>{
    public String titulo;
    public String director;
    public Integer duracion_pelicula;

    public Cine() {
    }

    public Cine(String titulo, String director, int duracion_pelicula) {
        this.titulo = titulo;
        this.director = director;
        this.duracion_pelicula = duracion_pelicula;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuracion_pelicula(int duracion_pelicula) {
        this.duracion_pelicula = duracion_pelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public int getDuracion_pelicula() {
        return duracion_pelicula;
    }
    @Override
    public String toString() {
        return "Cine{" + "titulo=" + titulo + ", director=" + director + ", duracion_pelicula=" + duracion_pelicula + '}';
    }
    
    //odenar las peliculas deacuerdo a su duracion de mayor de menor

    @Override
    public int compareTo(Cine t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
