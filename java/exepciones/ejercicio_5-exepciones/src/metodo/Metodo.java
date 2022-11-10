
package metodo;

import entidad.Numero;

public class Metodo {
    public Numero generarNumero(){
        int numero_aleatorio = (int) Math.floor(Math.random()*10);
        return new Numero(numero_aleatorio);
    }
}
