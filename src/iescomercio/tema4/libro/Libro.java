/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema4.libro;

/**
 *
 * @author VESPERTINO
 */
public class Libro {

    //atributos
    private String isbn, titulo;
    private int numeroDePaginas;
    private double precio;

    //constructor
    public Libro(String pIsbn, String pTitulo) {
        isbn = pIsbn;
        titulo = pTitulo;
    }

    public Libro(String pIsbn) {
        isbn = pIsbn;
    }

    // Metodos set
    public void setIsbn(String pIsbn) {
        isbn = pIsbn;
    }
    
    public void setTitulo(String pTitulo) {
        titulo = pTitulo;
    }
    
    public void setNumeroDePaginas(int pNum) {
        numeroDePaginas = pNum;
    }
    
    public void setPrecio(double pPrecio) {
        precio = pPrecio;
    }
    
    // Meotods getters
    public String getIsbn() {
        return isbn;
    }
    public String getTitulo() {
        return titulo;
    }
    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }
    public double getPrecio() {
        return precio;
    }
            
            
}
