/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema5.AdivinaQueHace;

/**
 *
 * @author VESPERTINO
 */
public class Mix {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();
        
        //Primer bloque --> 2 linea
        b.m1(); //B's m1
        c.m2(); // A's m2
        a.m3(); // A's m3
        
        System.out.println("\n---");        
        //Segundo bloque --> Cuarta linea        
        c.m1(); //B's m1
        c.m2(); //A's m2
        c.m3(); //C's m3, 13
        
        System.out.println("\n---");
        //Tercer bloque --> ultima linea
        a.m1(); // A's m1,
        b.m2(); // A's m2
        c.m3(); // C's m3 + 13
        
        System.out.println("\n---");
        //Cuarto bloque --> Cuarta linea
        a2.m1(); //B's m1
        a2.m2(); // A's m2,
        a2.m3(); // C's m3 13          
    }
}
