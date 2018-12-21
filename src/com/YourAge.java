package com;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.*;

public class YourAge implements ActionListener {
    private JButton button;
    private static int age;

    public static void main(String[] args) {
        YourAge gui = new YourAge();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your year of birh");
        age = 2018 - sc.nextInt();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("Click on me");
        button.addActionListener(this);
        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("Your age: " + age);
    }
}