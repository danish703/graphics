/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicdemo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Dipendra
 */
class Surface extends JPanel{
  
    public void doDrawing(Graphics g){
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setPaint(Color.RED);
        
        g2d.fillRect(20,20,80,50);
        g2d.translate(180,-50);
        g2d.rotate(Math.PI/4);
        g2d.fillRect(80,80,80,50);
        g2d.dispose();
    }
    
    
    @Override
    public void paintComponent(Graphics g){
      super.paintComponent(g);
        doDrawing(g);
    }
}

public class TranslationEx  extends JFrame{
    public TranslationEx(){
      add(new Surface());
        setTitle("Translation");
        setSize(300,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        TranslationEx ex = new TranslationEx();
        ex.setVisible(true);
    }
    
}
