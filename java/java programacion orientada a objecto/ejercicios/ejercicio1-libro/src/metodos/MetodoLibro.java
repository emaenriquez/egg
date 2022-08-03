/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import Clase.Libro;
import java.util.Scanner;

/**
 *
 * @author emanuel
 */
public class MetodoLibro {
    
    public Libro CargarLibro(){
        Scanner leer = new Scanner(System.in);
        System.out.println("titulo del libro");
        String titulo = leer.nextLine();
        System.out.println("autor");
        String autor = leer.nextLine();
        System.out.println("numero de paginas");
        int numeroPagina = leer.nextInt();
        System.out.println("isbn");
        int isbn = leer.nextInt();
        return new Libro(isbn, titulo, autor, numeroPagina);
    }
    
    public void MostrarLibro(Libro l){
    
        System.out.println();
        System.out.println("dato del libro");
        System.out.println();
        System.out.println("isbn"+ l.isbn);
        System.out.println("titulo"+ l.titulo);
        System.out.println("autor"+ l.autor);
        System.out.println("n de pagina"+ l.numeroPagina);
        
    }
    
}
