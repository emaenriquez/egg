/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

/**
 *
 * @author emanuel
 */
public class Libro {
    //s: ISBN, Título, Autor, 
//Número de páginas
    
    public int isbn;
    public String titulo;
    public String autor;
    public int numeroPagina;
    
    public Libro(){
    }
    
    
    public Libro(int isbn, String titulo, String autor, int numeroPagina) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPagina = numeroPagina;
    }  


}
