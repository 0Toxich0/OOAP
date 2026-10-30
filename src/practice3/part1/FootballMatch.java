package practice3.part1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FootballMatch extends JFrame {
    private int milanScore = 0;
    private int madridScore = 0;
    private String lastScorer = "N/A";

    private JLabel resultLabel = new JLabel("Result: 0 X 0", SwingConstants.CENTER);
    private JLabel lastScorerLabel = new JLabel("Last Scorer: N/A", SwingConstants.CENTER);
    private JLabel winnerLabel = new JLabel("Winner: DRAW", SwingConstants.CENTER);

    public FootballMatch() {
        super("Football Match");
        setLayout(new GridLayout(5, 1));
        setSize(300, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton milanBtn = new JButton("AC Milan");
        JButton madridBtn = new JButton("Real Madrid");

        milanBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                lastScorer = "AC Milan";
                updateUI();
            }
        });

        madridBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                lastScorer = "Real Madrid";
                updateUI();
            }
        });

        add(milanBtn);
        add(madridBtn);
        add(resultLabel);
        add(lastScorerLabel);
        add(winnerLabel);
    }

    private void updateUI() {
        resultLabel.setText("Result: " + milanScore + " X " + madridScore);
        lastScorerLabel.setText("Last Scorer: " + lastScorer);

        if (milanScore > madridScore) winnerLabel.setText("Winner: AC Milan");
        else if (madridScore > milanScore) winnerLabel.setText("Winner: Real Madrid");
        else winnerLabel.setText("Winner: DRAW");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FootballMatch().setVisible(true);
            }
        });
    }
}