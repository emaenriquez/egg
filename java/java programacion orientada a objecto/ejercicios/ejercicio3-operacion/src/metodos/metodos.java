/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import clase.Operacion;
import java.util.Scanner;

/**
 *
 * @author emanuel
 */
public class metodos {
    
    public Operacion crearOperacion(){
        
       Scanner leer = new Scanner(System.in);
        
       System.out.println("deme un numero");
       int numero1 = leer.nextInt();
        
       System.out.println("deme un segundo numero");
       int numero2 = leer.nextInt();
        
       return new Operacion(numero1, numero2);
    }
    
    public int sumar(Operacion n1,Operacion n2){
        
       int res = n1.getNumero1() + n2.getNumero2();
        
       return res;
        
    }
    
    public int restar(Operacion n1,Operacion n2){
        
       int res = n1.getNumero1() - n2.getNumero2();
        
       return res;
        
    }
    
    public int multiplicar(Operacion n1,Operacion n2){
        
       int res ;
       
       if(n1.getNumero1()==0 &&  n2.getNumero2() == 0){
           System.out.println("eror");
           res=0;
       } else {
           res = n1.getNumero1() *  n2.getNumero2();
       }
        
       return res;
    }
    
    public int dividir(Operacion n1,Operacion n2){
       
       int res;
        
       if(n1.getNumero1()==0 &&  n2.getNumero2() == 0){
           System.out.println("eror");
           res=0;
       } else {
           res = n1.getNumero1() / n2.getNumero2();
       }
        
       return res;
    }
    
}
