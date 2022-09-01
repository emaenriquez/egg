/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro;

/**
 *
 * @author emanuel
 */
public class Libro {

          public String titulo;
          public int paginas;

          public Libro() {
          }

          public Libro(String titulo, int paginas) {
                    this.titulo = titulo;
                    this.paginas = paginas;
          }

          public String getTitulo() {
                   return titulo;
          }

          public int getPaginas() {
                   return paginas;
          }

          public void setTitulo(String titulo) {
                    this.titulo = titulo;
          }

          public void setPaginas(int paginas) {
                    this.paginas = paginas;
          }

          @Override
          public String toString() {
                    return "Libro{" + "titulo=" + titulo + ", paginas=" + paginas + '}';
          }
          
}
