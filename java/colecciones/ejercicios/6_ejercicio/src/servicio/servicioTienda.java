
package servicio;

import Clase.Tienda;
import java.util.HashMap;
import java.util.Scanner;

public class servicioTienda {
   
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Tienda introducirProducto(){
       System.out.println("introduzca el nombre del producto");
       String producto = leer.nextLine();
       System.out.println("introduzca el precio del producto");
       int precio_producto = leer.nextInt();
       
       return new Tienda(producto, precio_producto);
    }
    
    public void modificarPrecioProducto(HashMap<Integer,String>producto){
        System.out.println("ingrese el nombre del producto para modificar su precio");
        
        String res = leer.nextLine();
        
        if(producto.equals(res)){
            System.out.println("ingrese el nuevo precio del producto");
            int res1 = leer.nextInt();
            
            producto.remove(res1);
            
        }
        
        
    }

}
