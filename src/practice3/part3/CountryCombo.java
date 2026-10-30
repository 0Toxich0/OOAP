package practice3.part3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountryCombo extends JFrame {
    public CountryCombo() {
        super("Hello Swing");
        setLayout(new FlowLayout());
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        String[] countries = {"Australia", "China", "England", "Russia"};
        final JComboBox<String> combo = new JComboBox<>(countries);
        final JLabel infoLabel = new JLabel("Выберите страну");

        combo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selected = (String) combo.getSelectedItem();
                if (selected != null) {
                    infoLabel.setText("Выбрана страна: " + selected);
                }
            }
        });

        add(combo);
        add(infoLabel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CountryCombo().setVisible(true);
            }
        });
    }
}