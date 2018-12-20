package com;

import javax.swing.*;
import java.awt.event.*;

public class SimpleGui implements ActionListener {
    JButton button;

    public static void main(String[] args) {
        SimpleGui gui = new SimpleGui();
        gui.go();
    }

    public void go() {

        JFrame frame = new JFrame(); //create frame
        button = new JButton("click me");//create button

        button.addActionListener(this);

        frame.getContentPane().add(button);//add button on the panel of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// if window will close program will stop
        frame.setSize(300, 300);// set the size of frame
        frame.setVisible(true);// make the frame visible

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("I've been checked");
    }
}