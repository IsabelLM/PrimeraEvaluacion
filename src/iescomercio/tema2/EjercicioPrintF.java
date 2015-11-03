package iescomercio.tema2;
/*Realizar un programa que declare una variable de tipo entero inicializada en 878953
 y que muestre y saque por pantalla ese número en decimal, en octal y en hexadecimal.
 y sacar nombre edad y sueldo usando print f.
Mirar: https://docs.oracle.com/javase/8/docs/api/java/util/Formatter.html
*/

public class EjercicioPrintF {

    public static void main(String[] args) {

        int numero = 878953;
        String n = "Isabel";
        byte e = 22; 
        float s = (float)1240.5;
        System.out.printf("Decimal: %d \nOctal: %o \nHexadecimal: %x ", numero, numero, numero, numero);
        System.out.printf("\nNombre: %s \nEdad: %d \nSueldo: %f \n", n, e, s); //si se pone %.2f saca solo 2 decimales
                
    }
}
