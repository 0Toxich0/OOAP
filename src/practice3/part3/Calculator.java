package practice3.part3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    private JTextField num1 = new JTextField(10);
    private JTextField num2 = new JTextField(10);

    public Calculator() {
        super("Калькулятор");
        setLayout(new FlowLayout());
        setSize(550, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(new JLabel("Число 1:")); add(num1);
        add(new JLabel("Число 2:")); add(num2);

        JButton addBtn = new JButton("+");
        JButton subBtn = new JButton("-");
        JButton mulBtn = new JButton("*");
        JButton divBtn = new JButton("/");

        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate('+');
            }
        });

        subBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate('-');
            }
        });

        mulBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate('*');
            }
        });

        divBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate('/');
            }
        });

        add(addBtn); add(subBtn); add(mulBtn); add(divBtn);
    }

    private void calculate(char op) {
        try {
            double a = Double.parseDouble(num1.getText().trim());
            double b = Double.parseDouble(num2.getText().trim());
            double res = 0;
            switch (op) {
                case '+': res = a + b; break;
                case '-': res = a - b; break;
                case '*': res = a * b; break;
                case '/':
                    if (b == 0) {
                        JOptionPane.showMessageDialog(this, "Деление на ноль!", "Ошибка", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    res = a / b;
                    break;
            }
            JOptionPane.showMessageDialog(this, "Результат: " + res, "Ответ", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Введите корректные числа!", "Ошибка", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }
}