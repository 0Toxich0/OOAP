package practice3.part3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridCalculator extends JFrame {
    private JTextField display = new JTextField();

    private double firstNumber = 0;
    private String operator = "";
    private boolean isNewNumber = true;

    public GridCalculator() {
        super("Simple Calculator");
        setSize(320, 380);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setHorizontalAlignment(JTextField.RIGHT);
        add(display, BorderLayout.NORTH);

        JPanel grid = new JPanel(new GridLayout(4, 4, 5, 5));
        String[] keys = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+"};

        for (final String key : keys) { // добавил final для использования в анонимном классе
            JButton btn = new JButton(key);
            btn.setFont(new Font("Arial", Font.BOLD, 18));

            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    handleButtonClick(key);
                }
            });

            grid.add(btn);
        }
        add(grid, BorderLayout.CENTER);
    }

    private void handleButtonClick(String key) {
        if (key.matches("[0-9.]")) {
            if (key.equals(".") && display.getText().contains(".")) {
                return;
            }

            if (isNewNumber) {
                display.setText(key);
                isNewNumber = false;
            } else {
                display.setText(display.getText() + key);
            }
        } else if (key.matches("[+\\-*/]")) {
            if (!display.getText().isEmpty()) {
                firstNumber = Double.parseDouble(display.getText());
                operator = key;
                isNewNumber = true;
            }
        } else if (key.equals("=")) {
            if (!operator.isEmpty() && !display.getText().isEmpty()) {
                double secondNumber = Double.parseDouble(display.getText());
                double result = 0;

                switch (operator) {
                    case "+": result = firstNumber + secondNumber; break;
                    case "-": result = firstNumber - secondNumber; break;
                    case "*": result = firstNumber * secondNumber; break;
                    case "/":
                        if (secondNumber == 0) {
                            display.setText("Error");
                            isNewNumber = true;
                            operator = "";
                            return;
                        }
                        result = firstNumber / secondNumber;
                        break;
                }

                if (result % 1 == 0) {
                    display.setText(String.valueOf((long) result));
                } else {
                    display.setText(String.valueOf(result));
                }

                isNewNumber = true;
                operator = "";
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GridCalculator().setVisible(true);
            }
        });
    }
}