package practice_7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;

public class seventh_practice_java {
    public static void main(String[] args) {
        FBGameImitator imitator = new FBGameImitator();
    }
}

//practice 7

class FBGameImitator extends JFrame {
    final int[] milanScore = {0};
    final int[] madridScore = {0};
    final String[] winnerArr = {"DRAW"};

    ArrayList<String> lastScorers = new ArrayList<String>(
            Arrays.asList("N/A"));

    JTextField jta = new JTextField(10);
    Font fnt = new Font("Times new roman",Font.BOLD,20);
    JPanel pnl = new JPanel();

    JLabel result_label = new JLabel("Result: " + milanScore[0] + "X" + madridScore[0]);
    JLabel last_scorer_label = new JLabel("Last Scorer: " + lastScorers.get(lastScorers.size() - 1));
    Label winner_label = new Label("Winner: " + winnerArr[0]);

    void recheckAllParameters() {
        checkAllowedLastScorersLength();
        result_label.setText("Result: " + milanScore[0] + "X" + madridScore[0]);
        last_scorer_label.setText("Last Scorer: " + lastScorers.get(lastScorers.size() - 1));
        winner_label.setText("Winner: " + winnerArr[0]);
    }

    void checkAllowedLastScorersLength() {
        if (lastScorers.size() >= 10) {
            String last = lastScorers.get(lastScorers.size() - 1);
            lastScorers.clear();
            lastScorers.add(last);
        }
    }

    FBGameImitator(){
        super("FBGameImitator");
        setLayout(null);

        ArrayList<String> teams = new ArrayList<>();
        teams.add("AC Milan");
        teams.add("Real Madrid");

        JButton milanBut = new JButton(teams.get(0));;
        JButton madridBut = new JButton(teams.get(1));;
        JButton stopBut = new JButton("Stop game!");

        milanBut.setBounds(60,390,150,20);
        madridBut.setBounds(270,390,150,20);
        stopBut.setBounds((milanBut.getX() + madridBut.getX()) / 2, milanBut.getY() + 30, 150,20);

        result_label.setBounds(stopBut.getX() + 35, stopBut.getY() - 60, 150, 20);
        last_scorer_label.setBounds(stopBut.getX() + 35, result_label.getY() - 40, 150, 20);
        winner_label.setBounds(stopBut.getX() + 35, last_scorer_label.getY() - 40, 150, 20);

        milanBut.addMouseListener(
                new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        milanScore[0] += 1;
                        lastScorers.add(teams.get(0));
                        recheckAllParameters();
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {}

                    @Override
                    public void mouseReleased(MouseEvent e) {}

                    @Override
                    public void mouseEntered(MouseEvent e) {}

                    @Override
                    public void mouseExited(MouseEvent e) {}
                }
        );

        madridBut.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                madridScore[0] += 1;
                lastScorers.add(teams.get(1));
                recheckAllParameters();
            }

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        });

        stopBut.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                madridBut.setEnabled(false);
                milanBut.setEnabled(false);
                stopBut.setEnabled(false);

                if (milanScore[0] == madridScore[0]) {
                    winnerArr[0] = "N/A";
                } else if (milanScore[0] > madridScore[0]) {
                    winnerArr[0] = teams.get(0);
                } else {
                    winnerArr[0] = teams.get(1);
                }

                recheckAllParameters();
            }

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        });

        add(milanBut);
        add(madridBut);
        add(stopBut);
        add(result_label);
        add(last_scorer_label);
        add(winner_label);
        setSize(500,500);

        setVisible(true);
    }
}