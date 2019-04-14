package com.company;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class CalculatorEngine implements ActionListener {

    Calculator parent; //ссылка на окно Calculator'а

    char selectedAction = ' '; // +, -, / или *
    double currentResult = 0;

    // Конструктор сохраняет ссылку на окно калькулятора
    // в переменной экземпляра класса

    CalculatorEngine (Calculator parent) {
        this.parent = parent;
    }


    public void actionPerformed(ActionEvent e) {

        // Получаем источник действия
        JButton clickedButton = (JButton) e.getSource();

        String displayFieldText = parent.displayField.getText();

        double displayValue = 0;

        // Получить число из дисплея калькулятора
        // если он не пустой.
        // Восклицительный знак - это оператор отрицания

        if (!"".equals(displayFieldText)) {
            displayValue = Double.parseDouble(displayFieldText);
        }

        Object src = e.getSource();

        // Для каждой кнопки арифметичекого действия
        // ЗАпомнить его и сохранить текущее число
        // в переменной currentResult, и очистить дисплей
        // для ввода нового числа

        if (src == parent.buttonSum) {

            selectedAction = '+';
            currentResult = displayValue;
            parent.displayField.setText("");

        } else if (src == parent.buttonDiff) {

            selectedAction = '-';
            currentResult = displayValue;
            parent.displayField.setText("");

        } else if ( src == parent.buttonMul) {

            selectedAction = '×';
            currentResult = displayValue;
            parent.displayField.setText("");

        } else if (src == parent.buttonDiv) {

            selectedAction = '÷';
            currentResult = displayValue;
            parent.displayField.setText("");

        } else if (src == parent.buttonEqual) {

        // Совершить арифметическое действие, в зависимости
        // от selectionAction, обновить переменную currentResult
        // и показать результат на дисплее

            if (selectedAction == '+') {

                currentResult += displayValue;

                // Сконвертировать результат в строку, добавляя его
                // к пустой строке и показать его
                parent.displayField.setText(""+currentResult);

            } else if (selectedAction == '-') {

                currentResult -= displayValue;
                parent.displayField.setText(""+currentResult);

            } else if (selectedAction == '×') {

                currentResult *= displayValue;
                parent.displayField.setText(""+currentResult);

            } else if (selectedAction == '÷') {

                currentResult /= displayValue;
                parent.displayField.setText(""+currentResult);

            }

        } else {

            // Для всех цифровых кнопок присоеденить надпись на
            // кнопке к надписи на дислпее.

            String clickedButtonLabel = clickedButton.getText();
            parent.displayField.setText(displayFieldText +
                                            clickedButtonLabel);

        }

    }



    // Конструктор созраняет ссылку на окно калькулятора
    // В переменной класса "parent"


}
