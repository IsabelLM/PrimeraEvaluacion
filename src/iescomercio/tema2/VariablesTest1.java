/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 Averigua cual es el valor por defecto que toman los tipos primitivos 
 vistos en clase
 */
package iescomercio.tema2;

/**
 *
 * @author VESPERTINO
 */
public class VariablesTest1 {

    static boolean unBoolean;
    static byte unByte;
    static short unShort;
    static int unInt;
    static long unLong;
    static float unFloat;
    static double unDouble;
    static char unChar;
    static String unString;
    static char charRaro = '\u0958';

    public static void main(String[] args) {
        System.out.println("\n Boolean: " + unBoolean
                + "\n Byte: " + unByte
                + "\n Short: " + unShort
                + "\n Int: " + unInt
                + "\n Long: " + unLong
                + "\n Float: " + unFloat
                + "\n Double: " + unDouble
                + "\n Char: " + unChar
                + "\n String: " + unString
                + "\n Char2: " + charRaro);
    }
}
