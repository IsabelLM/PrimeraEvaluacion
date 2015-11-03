package iescomercio.tema2;

import java.util.Scanner;

/*
 implementar un programa en java que pida el nombre, el telefono, los apellidos y la edad.
 que muestre por pantalla una ficha con el siguiente aspecto:
 ************** 
 * Nombre:
 * Apellido:
 *************
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, apellidos;
        byte edad;
        long telefono;
        
        //String nombre;
        System.out.print("Dime tu nombre: ");
        nombre = sc.nextLine();

        //String apellidos;
        System.out.print("Dime tus apellidos: ");
        apellidos = sc.nextLine();

        //int telefono;
        System.out.print("Dime tu telefono: ");
        telefono = sc.nextLong();

        //int edad;
        System.out.print("Dime tu edad: ");
        edad = sc.nextByte();

        System.out.println(" ***************************** "
                + "\n * Nombre: " + nombre
                + "\n * Apellidos: " + apellidos
                + "\n * Telefono: " + telefono
                + "\n * Edad: " + edad
                + "\n *****************************");
    }
}
