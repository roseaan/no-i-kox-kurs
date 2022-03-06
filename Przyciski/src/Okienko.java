import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Okienko implements ActionListener{

    JLabel tekst4;
    JTextField tekst3;
    JTextField tekst2;
    JLabel tekst;
    Color c = new Color(160, 124, 255);

    public Okienko() {
        JFrame okienko = new JFrame("Kalkulator");
        okienko.setSize(500, 200);
        okienko.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okienko.setLayout(new FlowLayout());

        tekst = new JLabel("Podaj dwie liczby:");
        okienko.add(tekst);
        tekst2 = new JTextField("pierwsza liczba:");
        okienko.add(tekst2);
        tekst = new JLabel("+");
        okienko.add(tekst);
        tekst3 = new JTextField("druga liczba:");
        okienko.add(tekst3);
        tekst4 = new JLabel("wynik");
        okienko.add(tekst4);


        JButton przycisk = new JButton("dodaj");
        przycisk.addActionListener(this);
        okienko.add(przycisk);

        okienko.setVisible(true);

        okienko.getContentPane().setBackground(c);
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
        tekst4.setText(" = " + Integer.valueOf(tekst2.getText()) + Integer.valueOf(tekst3.getText()) + "");
    }
}
