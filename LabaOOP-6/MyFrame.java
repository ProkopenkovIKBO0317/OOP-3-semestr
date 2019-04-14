package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class MyFrame extends JFrame {
    String      message = "Вы не угадали число с трех попыток";
    String      Error   = "<html><font color='red'>Текстовое поле может содержать только целочисленные числовые значения</font></html>";
    String      great   = "Число угадано правильно!";
    JTextField  textField = new JTextField("");
    JLabel      range = new JLabel("<html><font color='white'>" + "Угадайте число от 0 до 20 с трёх попыток" + "</font></html>");
    JLabel      moreLess = new JLabel();
    int         tries = 0;
    int         number = 10;


    MyFrame() {
        super("Guessing Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // создаем элементы приложения
        JPanel panel = new JPanel();

        JButton but = new JButton("<html><h4>УГАДАТЬ");

        panel.setBackground(Color.BLACK);

        panel.setLayout(null);


        // создаем кнопку и добавляем ее на главную панель
        but.setSize(150, 25);

        but.setLocation(170, 115);

        but.addActionListener(new ButtonEventListener());

        but.setBackground(Color.YELLOW);

        but.setForeground(Color.BLACK);

        but.setFocusPainted(false);

        panel.add(but);


        // добавляем Label на панель
        range.setBounds(120,10,300,30);

        moreLess.setBounds(187,175,200,25);

        panel.add(moreLess);

        panel.add(range);


        // Задаём размеры текстового поля
        textField.setSize(150, 25);

        textField.setLocation(170, 50);
        panel.add(textField);


        // задаем параметры панели
        setContentPane(panel);

        setResizable(true);

        setSize(500, 280);

        setVisible(true);

    }

    void moreOrLess() {
        if (Integer.parseInt(textField.getText()) == number) {
            JOptionPane.showMessageDialog(null, great, "Диалоговое окно", JOptionPane.PLAIN_MESSAGE);

            System.exit(0);

        }
        else if (Integer.parseInt(textField.getText()) > number)
        {moreLess.setText("<html><font color='white'>Ваше число больше");}

        else if (Integer.parseInt(textField.getText()) < number)
        {moreLess.setText("<html><font color='white'>Ваше число меньше");}
    }


    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {

                tries++;

                moreOrLess();

                if (tries == 3) {

                    JOptionPane.showMessageDialog(null, message, "Диалоговое окно", JOptionPane.PLAIN_MESSAGE);

                    System.exit(0);
                }
            }

            catch(Exception ex) {

                JOptionPane.showMessageDialog(null, Error, "Диалоговое окно", JOptionPane.PLAIN_MESSAGE);

                System.exit(1);
            }
        }
    }
}
