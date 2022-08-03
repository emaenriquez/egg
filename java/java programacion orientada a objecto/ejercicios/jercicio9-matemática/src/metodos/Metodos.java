/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import clase.Matematica;

/**
 *
 * @author emanuel
 */
public class Metodos {
    
    // Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
    public void devolverMayor(Matematica n1,Matematica n2){
        
        if(n1.getNum1() > n2.getNum2()){
            System.out.println("numero 1 es mayor que el numero 2");
                 
        } else{
            System.out.println("numero 2 es mayor que el numero 1");
        }
        
    }
    
    //  Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado 
    //al menor número. Previamente se deben redondear ambos valores.
    public void calcularPotencia(Matematica n1,Matematica n2){
        int potencia = 0;
        if(n1.getNum1() > n2.getNum2()){
           
            potencia = (int) Math.pow(n1.getNum1(),n2.getNum2());
            
            System.out.println("la potencia es " + Math.floor(potencia));
                 
        } else{
            potencia = (int) Math.pow(n2.getNum2(),n1.getNum1());
            
            System.out.println("la potencia es " + Math.floor(potencia));
        }
    }
    
    //Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores. 
    //Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número
    
    public void calculaRaiz(Matematica n1,Matematica n2){
        
        System.out.println("raiz " + Math.sqrt(n1.getNum1()));
        
        System.out.println("raiz " + Math.sqrt(n2.getNum2()));
        
        
    }
    
}
