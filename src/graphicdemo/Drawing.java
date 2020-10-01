/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicdemo;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Dipendra
 */
public class Drawing extends JPanel{
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.red);
        g.drawString("Hello Nepal",100,100);
        g.setColor(Color.ORANGE);
        //g.drawLine(50,40,5,400);
        g.fillRect(25, 50, 250, 50);
        g.setColor(Color.red);
        g.fillRect(30,70, 250, 50);
        g.setColor(Color.BLUE);
        g.drawRect(50,100,250,50);
        g.setColor(Color.GRAY);
        g.fillOval(50, 80, 50, 20);
        g.setColor(Color.MAGENTA);
        g.drawArc(100, 120, 500, 100, 50, 90);
        g.setColor(Color.blue);
        g.fill3DRect(100, 120, 500, 200, false);
        g.setColor(Color.PINK);
        g.fillRoundRect(100, 100, 100, 100, 15, 15);
        
    }
}
