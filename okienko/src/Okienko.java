import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Okienko implements ActionListener {

    JTextField tekst2;
    JLabel tekst;
    Color c = new Color(255, 165, 170);

    public Okienko() {
        JFrame okienko = new JFrame("uwu");
        okienko.setSize(900, 300);
        okienko.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        FlowLayout fl = new FlowLayout();
        okienko.setLayout(new FlowLayout());
        tekst = new JLabel("Hoi, I'm tEm.");
        okienko.add(tekst);
        tekst2 = new JTextField("tEm tHe teMmIe!");
        okienko.add(tekst2);
        JButton przycisk = new JButton("kliknij");
        JButton przycisk2 = new JButton("owa owa");
        JButton przycisk3 = new JButton("tak");
        JButton przycisk4 = new JButton("bububu");
        JButton przycisk5 = new JButton("bibibi");
        przycisk.addActionListener(this);
        przycisk2.addActionListener(this);
        przycisk3.addActionListener(new Cos());
        przycisk4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("bububu");
                tekst.setText("bububu");
            }
        });
        przycisk5.addActionListener(e -> tekst.setText("bibibi"));
        okienko.add(przycisk);
        okienko.add(przycisk2);
        okienko.add(przycisk3);
        okienko.add(przycisk4);
        okienko.add(przycisk5);
        okienko.setVisible(true);
        okienko.getContentPane().setBackground(c);
    }

    public class Cos implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            tekst.setText("tak owo");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Okienko();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("kliknij")) {
            tekst.setText(tekst2.getText());
        }
        if (e.getActionCommand().equals("owa owa")) {
            tekst.setText("owa owa");
        }
    }

}
