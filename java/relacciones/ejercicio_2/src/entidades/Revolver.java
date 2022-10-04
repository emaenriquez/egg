
package entidades;

public class Revolver {
    private int posAct, posAgua;
    private final int nPosTambor = 6;
    
    public void llenarRevolver() {
        posAct = (int) Math.round((Math.random() * 10 + 1) * 0.55); // Números aleatorios de 1 a 6
        posAgua = (int) Math.round((Math.random() * 10 + 1) * 0.55); // Números aleatorios de 1 a 6
    }
    
    public boolean mojar() {
        return posAct == posAgua;
    }
    
    public void siguienteChorro() {
        posAct++;
        if(posAct > nPosTambor) {
            posAct = 1;
        }
    }
    
    @Override
    public String toString() {return "(Gatillo en posición: " + posAct + " | Posición de agua: " + posAgua + ")";}
}
