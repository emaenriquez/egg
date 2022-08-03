/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author emanuel
 */
public class ejercicios {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
    
        /*
        1 - Escribir un programa que pida dos números enteros por teclado y 
        calcule la suma de los dos. El programa deberá después 
        mostrar el resultado de la suma
        
        System.out.println("ingresar numero 1 para sumar");
        int numero1 = leer.nextInt();
        
        System.out.println("ingresar numero 2 para sumar");
        int numero2 = leer.nextInt();
        
        int res = numero1 + numero2;
        
        System.out.println(res);
        */
        
        /*
        2 - Escribir un programa que pida tu nombre, lo guarde en una 
        variable y lo muestre por pantalla
        
        System.out.println("ingrese su nombre");
        
        String nombre = leer.nextLine();
        
        System.out.println("su nombre es " + nombre);
        */
        
        /*
        3 - Escribir un programa que pida una frase y la muestre 
        toda en mayúsculas y después toda en minúsculas. Nota: investigar 
        la función toUpperCase() y toLowerCase() en Java
        
        System.out.println("ingrese una frase");
        
        String frase = leer.nextLine();
        
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
        */
        
        /*    
        4 - Dada una cantidad de grados centígrados se debe mostrar su 
        equivalente en grados Fahrenheit. La fórmula correspondiente 
        es: F = 32 + (9 * C / 5)
        
        int c = 10;
        int f = 32 + (9 * c /5);
        
        System.out.println(f);
        */
        
        /*
        5 - Escribir un programa que lea un número entero por teclado y muestre 
        por pantalla el doble, el triple y la raíz cuadrada de ese número. 
        Nota: investigar la función Math.sqrt()
        
        System.out.println("ingrese numero");
        
        int numero = leer.nextInt();
        el doble
        System.out.println(numero *= 2);
        el triple
        System.out.println(numero *= 3);
        raiz cuadrada
        System.out.println(Math.sqrt(numero));
        
        */
        /*
        
        6 - Crear un programa que dado un numero determine si es par o impar
        
        System.out.println("ingrese un numero para derterminar si es par o impar");
        
        int numero = leer.nextInt();
        
        if(numero % 2 == 0){
            System.out.println("el numero es par");
        } else {
            System.out.println("el numero no es par");        
        }
        
        */
        
        /*
        
        7 - Crear un programa que pida una frase y si esa 
        frase es igual a “eureka” el programa pondrá un mensaje de Correcto, 
        sino mostrará un mensaje de Incorrecto. Nota: investigar 
        la función equals() en Java
        
                
        System.out.println("ingrese una frase");
        String frase = leer.nextLine();  
        
        if("eureka".equals(frase)){
            System.out.println("corecta");
        } else {
            System.out.println("incorecta");
        }
        
        */

        /*
        
        8. Realizar un programa que solo permita introducir solo frases o 
        palabras de 8 de largo. Si el usuario ingresa una frase o palabra de 8 
        de largo se deberá de imprimir un mensaje por pantalla que diga 
        “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
        Nota: investigar la función Lenght() en Java
        
        System.out.println("ingrese fraseo o pabra de 8 de largo");
        
        String frase = leer.nextLine();
        
        if(frase.length() >= 8){
            System.out.println("CORRECTO");
        } else{
            System.out.println("incorrecto");
        }
        
        */
        
        /*
        
        9 - Escriba un programa que pida una frase o palabra y valide si 
        la primera letra de esa frase es una ‘A’. Si la primera letra es una ‘A’,
        se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso 
        contrario, se deberá imprimir “INCORRECTO”. Nota: investigar 
        la función Substring y equals() de Java.
        
        System.out.println("ingrese fraseo o palabra");
        
        String frase = leer.nextLine();
        
        if("a".equals(frase.substring(0,1))){
            System.out.println("correcta");
        } else{
            System.out.println("incorrecta");
        }

        */
        
        /*
        10 - Escriba un programa en el cual se ingrese un valor límite positivo, y a
        continuación solicite números al usuario hasta que la suma de los números 
        introducidos supere el límite inicial. 
        
        System.out.println("ingrese un numero");
        
        int numeroLimite = leer.nextInt();
       
        int suma = 0;
        
        while(numeroLimite > suma){
            System.out.println("ingrese numeros para sumar");
            int numeros = leer.nextInt();
            suma = suma + numeros;
        }
        */
        
        /*
        11 - Realizar un programa que pida dos números enteros positivos por teclado 
        y muestre por pantalla el siguiente menú:
        MENU
        1. Sumar
        2. Restar
        3. Multiplicar
        4. Dividir
        5. Salir
        Elija opción:  El usuario deberá elegir una opción y el programa deberá 
        mostrar el resultado por pantalla  y luego volver al menú. El programa 
        deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el 
        usuario selecciona la opción 5, en vez de salir del programa directamente, se debe mostrar 
        el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? Si 
        el usuario selecciona el carácter ‘S’ se sale del 
        programa, caso contrario se vuelve a mostrar el menú 
        
        
        System.out.println("ingrese dos numeros por teclado");
        
        System.out.println("ingrese numero 1");
        int numero1 = leer.nextInt();
        System.out.println("ingrese numero 2");
        int numero2 = leer.nextInt();
        
        int res;
        char salirPrograma = ' ';
       
        
        System.out.println("1-sumar 2-restar 3-multiplicar 4-dividir 5-salir");
        int opcion = leer.nextInt();
        
        while(salirPrograma != 's' ){
            switch(opcion){
            case 1:
                res = numero1 + numero2;
                System.out.println("la suma de los numeros son " + res);
                System.out.println("1-sumar 2-restar 3-multiplicar 4-dividir 5-salir");
                opcion = leer.nextInt();
                
            case 2:
                res = numero1 - numero2;
                System.out.println("la resta de los numeros son " + res);
                System.out.println("1-sumar 2-restar 3-multiplicar 4-dividir 5-salir");
                opcion = leer.nextInt();
                
            case 3:
                res = numero1 * numero2;
                System.out.println("la multiplicar de los numeros son " + res);
                System.out.println("1-sumar 2-restar 3-multiplicar 4-dividir 5-salir");
                opcion = leer.nextInt();
            case 4:
                res = numero1 / numero2;
                System.out.println("la dividir de los numeros son " + res);
                System.out.println("1-sumar 2-restar 3-multiplicar 4-dividir 5-salir");
                opcion = leer.nextInt();
                 //String salirPrograma = leer.nextLine();
            case 5:
                System.out.println("esta seguro que quiere salir");
                
                char salir = leer.next().charAt(0);
                
                if('s' == salir ){
                    System.out.println("fin");
                    break;
                } else{
                    System.out.println("selecione una obcion");
                }
                
            }
            
        }
        */
       
        /*
        12 - Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
        este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben 
        llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, 
        el primer carácter tiene que ser X y el último tiene que ser una O. 
        Las secuencias leídas que respeten el formato se consideran correctas, la secuencia 
        especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta 
        de FDE, que no respete el formato se considera incorrecta. 
        Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e 
        incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las 
        siguientes funciones de Java Substring(), Length(), equals()
        
        System.out.println("ingrese los caracters");
        String frase = " ";
        
        int corecta = 0;
        int incorecta = 0;
        
        while(!"&&&&&".equals(frase)){
        frase = leer.nextLine();
        if(5 == frase.length()){
            if("x".equals(frase.substring(0,1))){
              
            if("0".equals(frase.substring(frase.length()-1,frase.length()))){
                System.out.println("corecta");
                corecta = corecta + 1;
            } else{
               System.out.println("incorecta");
               incorecta = incorecta + 1;
            }
        }
        } else {
            incorecta = incorecta + 1;      
        }
        }
        
        System.out.println("respuesta corectas " + corecta);
        System.out.println("respuesta incorectas " + incorecta);
        */
        
        /*
        
        
        Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el 
        cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
        * * * * 
        *     *
        *     *
        * * * *

          System.out.println("ingrese los lados");
        
        int lados = leer.nextInt();

        for(int i = 0; i < lados; i++) {
                System.out.print("*");
        }
        
        System.out.println();

        //centro de la forma
        for(int i = 0; i < lados-2; i++) {
            System.out.print("*");
                
        for(int j = 0; j < lados-2; j++) {
            System.out.print(" ");
        } System.out.println("*"); }

        //Linea inferior
        for(int i = 0; i < lados; i++) {
            System.out.print("*");
        }
        */
        
        /*
        
        14 - Crea una aplicación que a través de una función nos convierta una cantidad de euros 
        introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La 
        función tendrá como parámetros, la cantidad de euros y la moneda a converir que será 
        una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio 

        El cambio de divisas es:
        * 0.86 libras es un 1 €
        * 1.28611 $ es un 1 €
        * 129.852 yenes es un 1 €
        
         
        System.out.println("ingrese que moneda quire covertir euro,libras,yenes");
        int opcion = leer.nextInt();
        int monto = leer.nextInt();
        switch(opcion){
            case 1:
                covertirEuro(monto);
                break;
            case 2:
                covertirLibras(monto);
                break;
            case 3:
                covertirYenes(monto);
                break;
        
        }
        
        
        public static void covertirEuro(int monto){
            double res = monto*0.86;
            System.out.println("la cantidad de euro"+res);
        }
        
         public static void covertirLibras(int monto){
            double res = monto*0.128611;
            System.out.println("la cantidad de libras"+res);
        }
         
          public static void covertirYenes(int monto){
            double res = monto*129.852;
            System.out.println("la cantidad de yenes"+res);
        }
        
        */
        
        /*
        
        15 - Realizar un algoritmo que rellene un vector con los 100 primeros 
        números enteros y los muestre por pantalla en orden descendente.
        
        int vector[] = new int[100];
        
        for(int i = 0; i < 100;i++){
            
            vector[i] = i+1;
            
            
            
        }
        
         for(int i = 99; i > -1;i--){
            System.out.println(vector[i]);
        }
        */
       
        /*
        
        16 - Realizar un algoritmo que rellene un vector de tamaño N con 
        valores aleatorios y le pida al usuario un numero a buscar en el vector. 
        El programa mostrará donde se encuentra el numero y si se encuentra repetido
        
         
        System.out.println("ingrese el tamaño del vector");
        
        int n = leer.nextInt();
        
        int[] vector = new int[n];
        
        int cont = 0;
        
        for(int i = 0;i < n;i++){
            vector[i] = (int)(Math.random()*100+1);
        }
          
        for(int i = 0;i < n;i++){
           System.out.println(vector[i]);       
        }
        
        System.out.println("ingrese numero para buscar");
        
        int numeroBuscar = leer.nextInt();
        
        for (int j = 0; j < n; j++) {
            if(vector[j]==numeroBuscar){
                System.out.println("se encontro en" + j);
                cont++;
            }
        }
        if(cont > 1){
            System.out.println("esta repetido " + cont);
        }
        
        */
        
        // (int)(Math.random()*100+1)
       
        /*
        17 - Recorrer un vector de N enteros contabilizando cuántos 
        números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos)
        
        System.out.println("ingreese");
        
        int n = leer.nextInt();
        
        int[] vector = new int[n];
        
        int digito1 = 0;
        int digito2 = 0;
        int digito3 = 0;
        
        for(int i = 0;i < n;i++){
            vector[i] = (int)(Math.random()*999+1);
            String numero = Integer.toString(vector[i]);
            System.out.println(vector[i] + " tiene " + numero.length() + " digitos ");
            
            if(numero.length()==1){
                digito1++;
            }
            if(numero.length()==2){
                digito2++;
            }
            if(numero.length()==3){
                digito3++;
            }
        }
        
        System.out.println("tiene un digito " + digito1);
        System.out.println("tiene dos digito " + digito2);
        System.out.println("tiene tres digito " + digito3);
        */
        
        /*
        18 - Realizar un programa que rellene un matriz de 4 x 4 de valores 
        aleatorios y muestre la traspuesta de la matriz. La matriz traspuesta 
        de una matriz A se denota por B y se obtiene cambiando sus filas por 
        columnas (o viceversa).
        
        int[][] matriz = new int[4][4];
        int[][] matrizNueva = new int[4][4];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int)(Math.random()*100+1);
            }
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print( matriz[i][j] + " " );
            }
            System.out.println(" ");
        }
        System.out.println(" ---- ");
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matrizNueva[j][i] = matriz[i][j];
            }
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print( matrizNueva[i][j] + " " );
            }
            System.out.println(" ");
        }
        
        */
        
        /*
        
        19 - Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una 
        matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de 
        signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se 
        denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
        
        
        int[][] matriz = new int[3][3];
        
        System.out.println("dniee");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }
        
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("[" + matriz[i][j]*(-1) + "]");
            }
            System.out.println(" ");
        }
        */
        
        System.out.println("ingrese numeror");
        
        int suma = 0;
        int sumaActual;
        boolean positivo = true;
        int[][] matriz = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("ingrese los nuemro");
                matriz[i][j] = leer.nextInt();
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("[" +  matriz[i][j] + "]" );
            }
            System.out.println("");
        }
        
        while(positivo){
        
        }
        
        for (int i = 0; i < 3; i++) {
            sumaActual=0;
            for (int j = 0; j < 3; j++) {
                sumaActual = matriz[i][j] + sumaActual;
            }
            if(i==0){
                suma = sumaActual;
            } else{
                if(suma == sumaActual){
                    positivo = true;
                } else{
                    positivo = false;
                    break;
                }
            }
            
                            
            if(!positivo){
                break;
            }
        }
        
        for (int i = 0; i < 3; i++) {
             sumaActual=0;
            for (int j = 0; j < 3; j++) {
                sumaActual = matriz[j][i] + sumaActual;
            }
             if(i==0){
                suma = sumaActual;
            } else{
                if(suma == sumaActual){
                    positivo = true;
                } else{
                    positivo = false;
                    break;
                }
            
            
                            
            if(!positivo){
                break;
            }
        }
        
        for (int j = 0; j < 3; j++) {
                sumaActual = matriz[i][i] + sumaActual;
        }
            
        if(suma == sumaActual){
            positivo = true;
        } else{
            positivo = false;
        }
        sumaActual = 0;
        for (int j = 0; j < 3; j++) {
                sumaActual = matriz[2-i][i] + sumaActual;
        }
             
        if(suma == sumaActual){
            positivo = true;
        } else{
            positivo = false;
        }
         
    }
    }
   
}