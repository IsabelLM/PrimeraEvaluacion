/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema2;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import javafx.scene.layout.GridPane;

/**
 *
 * @author VESPERTINO
 */
public class Ejercicio4 extends Applet {

    @Override
    public void paint(Graphics g) {
        g.drawLine(5, 10, 20, 20);
        g.setColor(Color.red);
        g.drawLine(50, 60, 200, 210);
        g.setColor(Color.green);
        g.drawRect(70, 80, 100, 25);
        g.setColor(Color.ORANGE);
        g.drawArc(100, 100, 100, 100, 90, 90); //1 lateral  2 abajo
        g.drawOval(WIDTH, WIDTH, WIDTH, WIDTH); //Start angle 30, empezará el circulo en la posición 30
    }
}
