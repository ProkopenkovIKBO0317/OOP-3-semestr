package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame{
    String t1 = "AC Milan";
    String t2 = "Real Madrid";
    int score1 = 0;
    int score2 = 0;
    JLabel curr_score = new JLabel("<html><font size = +2>Result: " + score1 + "-" + score2 + "<font>");
    String curr_team = "MyTeam";
    JLabel last_scorer = new JLabel("<html><font size = +1>Last scorer: " + curr_team + "<font>");
    JLabel winner = new JLabel();

    MyFrame() {
        super("Picker");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        JButton butt1 = new JButton("<html><h4>Pick: " + t1);
        JButton butt2 = new JButton("<html><h4>Pick: " + t2);

        butt1.setSize(150, 25);
        butt1.setLocation(30, 100);
        butt1.setBackground(Color.BLACK);
        butt1.setForeground(Color.RED);
        butt1.setFocusPainted(false);
        butt1.addActionListener(new ButtonEventListener1());
        panel.add(butt1);

        butt2.setSize(150, 25);
        butt2.setLocation(300, 100);
        butt2.setBackground(Color.WHITE);
        butt2.setForeground(Color.BLACK);
        butt2.setFocusPainted(false);
        butt2.addActionListener(new ButtonEventListener2());
        panel.add(butt2);

        curr_score.setLocation(181, 42);
        curr_score.setSize(160, 40);
        panel.add(curr_score);

        last_scorer.setLocation(150, 150);
        last_scorer.setSize(250, 30);
        panel.add(last_scorer);

        winner.setLocation(150, 180);
        winner.setSize(250, 30);
        panel.add(winner);

        setContentPane(panel);
        setResizable(false);
        setSize(500, 280);
        setVisible(true);
    }

    void WhoIsWinner() {
        if (score1 == score2) { winner.setText("<html><font size = +1>Winner: DRAW" + "<font>"); }
            else if (score1 > score2) { winner.setText("<html><font size = +1>Winner: " + t1); }
            else if (score2 > score1) { winner.setText("<html><font size = +1>Winner: " + t2); }
    }

    class ButtonEventListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message = "";
            message += "1 Goal added to " + t1;
            score1++;
            curr_score.setText("<html><font size = +2>Result: " + score1 + "-" + score2);
            curr_team = t1;
            last_scorer.setText("<html><font size = +1>Last scorer: " + curr_team);
            WhoIsWinner();
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
        }
    }

    class ButtonEventListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message = "";
            message += "1 Goal added to " + t2;
            score2++;
            curr_score.setText("<html><font size = +2>Result: " + score1 + "-" + score2);
            curr_team = t2;
            last_scorer.setText("<html><font size = +1>Last scorer: " + curr_team);
            WhoIsWinner();
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
        }
    }

}
