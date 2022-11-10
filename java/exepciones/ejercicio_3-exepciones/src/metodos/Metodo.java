
package metodos;

public class Metodo {
    public void numero(String n1,String n2){
        try{
        int res = Integer.parseInt(n1) + Integer.parseInt(n2);
        System.out.println("la suma es " + res);
        }catch(Exception e){
            System.out.println("la operacion no se pudo hacer");
        }
    }
}
