/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jercicio9.matemática;

import clase.Matematica;
import metodos.Metodos;

/**
 *
 * @author emanuel
 */
public class Jercicio9Matemática {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Metodos m = new Metodos();
        
        Matematica n1 = new Matematica();
        
        double num1 = Math.random()*99;
        double num2 = Math.random()*99;
        
        System.out.println(num1);
        System.out.println(num2);
        
        n1.setNum1(num1);
        
        n1.setNum2(num2);
        
        m.devolverMayor(n1, n1);
        m.calcularPotencia(n1, n1);
        m.calculaRaiz(n1, n1);
    }
    
}
