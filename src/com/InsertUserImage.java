package com;

import javax.swing.*;
import java.awt.*;

public class InsertUserImage {
    private JFrame frame;

    public static void main(String[] args) {
        InsertUserImage gui = new InsertUserImage();
        gui.go();
    }

    private void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyDrawPanel2 drawPanel2 = new MyDrawPanel2();
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel2);
        frame.setSize(420, 600);
        frame.setVisible(true);
    }

    class MyDrawPanel2 extends JPanel {
        public void paintComponent(Graphics g) {
            Image image = new ImageIcon("c:\\dev\\projects\\swing\\src\\com\\qw.jpg").getImage();
            g.drawImage(image, 30, 40, this);
            g.setColor(Color.white);
            g.fillRect(200,200,this.getWidth(),this.getHeight());
            g.fillOval(70, 70, 100, 100);
        }
    }
}
