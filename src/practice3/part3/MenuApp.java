package practice3.part3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuApp extends JFrame {
    public MenuApp() {
        super("Hello Swing");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem saveItem = new JMenuItem("Сохранить");
        JMenuItem exitItem = new JMenuItem("Выйти");

        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        JMenu editMenu = new JMenu("Edit");
        editMenu.add(new JMenuItem("Копировать"));
        editMenu.add(new JMenuItem("Вырезать"));
        editMenu.add(new JMenuItem("Вставить"));

        JMenu helpMenu = new JMenu("Help");
        helpMenu.add(new JMenuItem("О программе"));

        menuBar.add(fileMenu); menuBar.add(editMenu); menuBar.add(helpMenu);
        setJMenuBar(menuBar);

        JPanel panel = new JPanel(new BorderLayout());

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(new JButton("Button 1"));
        buttonPanel.add(new JButton("Button 2"));

        JTextArea textArea = new JTextArea("This is the area you can write text");

        panel.add(buttonPanel, BorderLayout.NORTH);
        panel.add(new JScrollPane(textArea), BorderLayout.CENTER);

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenuApp().setVisible(true);
            }
        });
    }
}