/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema2;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author VESPERTINO
 */
public class Ejercicio4_1 extends Applet {

    @Override
    public void paint(Graphics g) {
        g.drawRect(10, 90, 100, 100);
        g.setColor(Color.CYAN);
        g.fillRect(40, 140, 40, 50);
        g.drawOval(45, 40, 30, 30);
        // g.drawLine(10, 90, 60, 10); x y 
        //g.drawLine(110, 90, 60, 10);
        g.setColor(Color.red);
        g.fillArc(10, 15, 100, 150, 0, 180);
        g.setColor(Color.getHSBColor(20, 240, 60));
        g.fillRect(210, 100, 25, 90);
        g.setColor(Color.green);
        g.fillOval(192, 50, 60, 60);
        g.setColor(Color.yellow);
        g.fillOval(120, 10, 40, 40);

    }

}
