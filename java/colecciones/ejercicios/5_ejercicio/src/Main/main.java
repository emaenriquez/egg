package Main;
import entidad.Pais;
import java.util.HashSet;
import java.util.Scanner;
import servicio.ServicioPaises;

public class main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioPaises srv = new ServicioPaises();
        
        HashSet<Pais> arr = new HashSet();
    
        String res;

        do{
            System.out.println("quiere ingresar un nuevo pais");
            res = leer.nextLine();
            
            if(res.equals("si")){
                arr.add(srv.guardarPaises());
            }
            
        } while(res.equals("si"));

        srv.mostrarElementos(arr);
        
        srv.ordenarElementosPaises(arr);
        
        srv.pedirPais(arr);

    }
    
}
