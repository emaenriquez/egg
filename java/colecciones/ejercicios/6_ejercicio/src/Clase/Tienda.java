
package Clase;

public class Tienda {
    public String producto;
    public Integer precio;

    public Tienda() {
    }

    public Tienda(String producto, Integer precio) {
        this.producto = producto;
        this.precio = precio;
    }


    public String getProducto() {
        return producto;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
}
