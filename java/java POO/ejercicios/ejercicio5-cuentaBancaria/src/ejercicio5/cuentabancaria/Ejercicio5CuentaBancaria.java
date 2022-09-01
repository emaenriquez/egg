/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5.cuentabancaria;

import Clase.Cuenta;
import Metodos.Metodos;
import java.util.Scanner;

/**
 *
 * @author emanuel
 */
public class Ejercicio5CuentaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String resp, confirm = "";
       
        Metodos serv = new Metodos();
        Cuenta cuent = serv.crearCuenta();

        do {
            System.out.println("▄▄▄▄▄▄▄▄▄▄");
            System.out.println("█ MENÚ CAJERO █");
            System.out.println("▀▀▀▀▀▀▀▀▀▀");
            System.out.println();
            System.out.println("1] Ingresar dinero.");
            System.out.println("2] Retirar dinero.");
            System.out.println("3] Extracción rápida.");
            System.out.println("4] Consultar saldo.");
            System.out.println("5] Consultar datos.");
            System.out.println("6] Salir.");
            System.out.println();
            System.out.print("» Seleccione una opción [1|2|3|4|5|6]: ");
            resp = read.next();
            switch(resp) {
                case "1":
                    serv.ingresar(cuent);
                    break;
                case "2":
                    serv.retirar(cuent);
                    break;
                case "3":
                    serv.extraccionRapida(cuent);
                    break;
                case "4":
                    serv.consultarSaldo(cuent);
                    break;
                case "5":
                    serv.consultarDatos(cuent);
                    break;
                case "6":
                    System.out.print("¿Está seguro que desea salir? [y/n]: ");
                    confirm = read.next();
                    break;
                default:
                    System.out.println("Error: opción ingresada no válida.");
                    System.out.println("Presione intro para seguir...");
                    read.next();       
            }
        } while(!confirm.equalsIgnoreCase("y"));
    }
}
 
