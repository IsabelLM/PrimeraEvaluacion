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
public class RunLibro {

    public static void main(String[] args) {
        Libro miLibro, l2, l3, l4; // Declarado un objeto
        miLibro = new Libro("2432435"); // Instanciado el objeto
        l2 = new Libro ("88888");
        
        // Rellenar con información el objeto
        miLibro.setIsbn("747474");
        miLibro.setTitulo("El señor de los anillos");
        miLibro.setPrecio(25.60);
        miLibro.setNumeroDePaginas(425);
        
        System.out.println("El titulo es: " + miLibro.getTitulo());
        System.out.println("El precio es:" + miLibro.getPrecio());
        System.out.println("***********************");
        System.out.println("El isbn es: " + l2.getIsbn());
        System.out.println("El titulo es:" + l2.getTitulo());
        System.out.println("El precio es:" + l2.getPrecio());
    }
}
