package com.company;

import javax.swing.*; // включаем все классы данной библиотеки
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class Calculator {

        // объявление всех компонентов калькулятора

        JFormattedTextField displayField = new JFormattedTextField("");
        JButton button0 = new JButton("0");
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton buttonPoint = new JButton(".");
        JButton buttonSum = new JButton("+");
        JButton buttonDiff = new JButton("-");
        JButton buttonMul = new JButton("×");
        JButton buttonDiv = new JButton("÷");
        JButton buttonEqual = new JButton("=");
        JPanel windowContent = new JPanel();

                // В конструкторе создаются все компоненты
                // и добавляются на фрейм с помощью комбинации
                // BorderLayout и GridLayout
                Calculator() {


                        // Задаем схемы для этой панели
                        BorderLayout b1 = new BorderLayout();
                        windowContent.setLayout(b1);

                        // Создаем и отображаем поле
                        // ДОбавляем его в северную область окна

                        windowContent.add("North", displayField);

                        // Создаем панель GridLayout
                        // которая содержит 12 кнопок - 10 кнопок с числами
                        // и кнопки с точкой и знаком равно

                        JPanel p1 = new JPanel();
                        GridLayout g1 = new GridLayout(4,3);

                        // Добавляем кнопки на панели p1 и на p2
                        p1.setLayout(g1);
                        p1.add(button1);
                        p1.add(button2);
                        p1.add(button3);
                        p1.add(button4);
                        p1.add(button5);
                        p1.add(button6);
                        p1.add(button7);
                        p1.add(button8);
                        p1.add(button9);
                        p1.add(button0);
                        p1.add(buttonPoint);
                        p1.add(buttonEqual);

                        // Помещаем панель p1 в центральную область окна
                        // а панель p2 в восточную область окна
                        windowContent.add("Center", p1);

                        // Создаем панель с менеджером расположения GridLayout
                        // на которой будет 4 кнопки

                        JPanel p2 = new JPanel();
                        GridLayout g12 = new GridLayout(4,1);

                        p2.setLayout(g12);
                        p2.add(buttonDiv);
                        p2.add(buttonMul);
                        p2.add(buttonDiff);
                        p2.add(buttonSum);

                        // Добавляем панель p2 в правую часть окна

                        windowContent.add("East", p2);



                        // Создаем фрейм и задаем его основную панель
                        JFrame frame = new JFrame("Calculator");
                        frame.setContentPane(windowContent);
                        displayField.setHorizontalAlignment(JTextField.RIGHT);
                        // Делаем размер окна достаточным
                        // для того, чтобы вместить все компоненты

                        frame.pack();

                        // отображаем окно
                        frame.setVisible(true);

                        // присваиваем кнопкам действия
                        CalculatorEngine calcEngine = new CalculatorEngine(this);
                        button0.addActionListener(calcEngine);
                        button1.addActionListener(calcEngine);
                        button2.addActionListener(calcEngine);
                        button3.addActionListener(calcEngine);
                        button4.addActionListener(calcEngine);
                        button5.addActionListener(calcEngine);
                        button6.addActionListener(calcEngine);
                        button7.addActionListener(calcEngine);
                        button8.addActionListener(calcEngine);
                        button9.addActionListener(calcEngine);
                        buttonSum.addActionListener(calcEngine);
                        buttonEqual.addActionListener(calcEngine);
                        buttonPoint.addActionListener(calcEngine);
                        buttonDiff.addActionListener(calcEngine);
                        buttonDiv.addActionListener(calcEngine);
                        buttonMul.addActionListener(calcEngine);

                }

        public static void main(String[] args) {

                    Calculator calc = new Calculator();
        }

}
