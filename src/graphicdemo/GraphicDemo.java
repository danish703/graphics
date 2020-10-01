/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicdemo;

import javax.swing.JFrame;

/**
 *
 * @author Dipendra
 */
public class GraphicDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Graphics program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Drawing d = new Drawing();
        frame.add(d);
        frame.setSize(400,250);
        frame.setVisible(true);
    }
    
}
