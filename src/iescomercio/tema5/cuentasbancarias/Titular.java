/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema5.cuentasbancarias;

/**
 *
 * @author VESPERTINO
 */
public class Titular {

    private String nombre, apellidos;
    private int edad;

    //constructor
    public Titular(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    //setter   
    public void setNombre(String pNombre) {
        nombre = pNombre;
    }

    public void setApellidos(String pApellidos) {
        apellidos = pApellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Getter

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }
    //Metodo toString completo

    @Override
    public String toString() {
        String aux;
        aux = ("Nombre: " + nombre + " \nApellidos: "
                + apellidos + " \nEdad: " + edad);
        return aux;
    }
}
