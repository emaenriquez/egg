
package pkg6_ejercicio;

import Clase.Tienda;
import java.util.HashMap;
import java.util.Map;
import servicio.servicioTienda;

public class Main {

    public static void main(String[] args) {
        
        servicioTienda srv = new servicioTienda();
        
        Tienda t1 = srv.introducirProducto();
        
        HashMap<Integer,String> map = new HashMap();
        
        map.put(t1.getPrecio(), t1.getProducto());
                 
        for(Map.Entry<Integer , String> entry : map.entrySet()){
            System.out.println("precio = " + entry.getKey() + " nombre del producto = " + entry.getValue());
        }
        
        srv.modificarPrecioProducto(map);
        
    }
    
}
