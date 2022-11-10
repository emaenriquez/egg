
package servcio;

import java.util.List;

public class Servicio {
    public int division() throws ArithmeticException{
        int division = 20/0;
        return division;
    }
    
    public void agregar(List<Integer>lista,int numero) throws Exception{
        if(lista.contains(numero)){
            throw new Exception("el numero ya esta en la lista");
        }
        lista.add(numero);
    }
            
}
