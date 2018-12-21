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

        button.addActionListener(this);//Вы вызываете button.addActionListener( this ), потому что this реализует интерфейс ActionListener. Когда нажимается кнопка, вызывается метод actionPerformed(ActionEvent e) (определяемый интерфейсом и реализуемый вашим классом).
        //Каждый JButton имеет EventListenerList. Вызов addActionListener(this) добавляет в список ActionListener, функцию обратного вызова с именем actionPerformed(). Вы можете увидеть схему кода, который вызывает ваш метод здесь. Фактический метод fireActionPerformed() находится в AbstractButton. A JButton является JComponent, который вы можете видеть в списке среди различных классов, использующих механизм списка прослушивателей событий.

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