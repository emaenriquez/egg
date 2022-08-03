package programacionorientadaobj;

import programacionorientadaobj.entidades.Mascota;

public class Programacionorientadaobj {

    public static void main(String[] args) {
        
        int a = 10;
        
        Mascota m = new Mascota();
        
        modificar(a,m);
        
        System.out.println("a "+ a);
        System.out.println("mascota " + a);
        System.out.println(m.toString());
        
    }
    
    public static void modificar(int num, Mascota m){
        num = 100;
        m.setApodo("mascota referencia");
    }
    
}
