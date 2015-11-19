/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema5.herencia;

/**
 *
 * @author VESPERTINO
 */
public class Herencia {
    private int codigo;
    private String nombre;
    private double saldo;
    
    //constructor
    
    public Herencia(int codigo, String nombre, double saldo){
        this.codigo = codigo;
        this.nombre = nombre;
        this.saldo = saldo;
    }
    
    public Herencia(int codigo){
        this(codigo, "", 0);
        
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
