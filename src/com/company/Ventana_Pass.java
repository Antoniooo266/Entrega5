package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana_Pass extends JFrame implements ActionListener {
    private JLabel title;
    private JLabel body;
    private TextField passwd;
    private JButton arriba;
    private JButton abajo;
    private JCheckBox minus;
    private JCheckBox mayus;
    private JCheckBox signos;
    private JCheckBox num;
    private JLabel contador;

    public Ventana_Pass(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel p1 = new JPanel();
        setLayout(new GridLayout(2,1));
        p1.add(title = new JLabel("PassRandom.com"));
        title.setFont(new Font("Serif", Font.PLAIN, 28));
        p1.add(body = new JLabel());
        body.setText("<html><p>Genera tus passwords seguros con un solo CLICK!</p><br><p> -Sin tener que pensar</p><br><p> -Elige de que tipo quieres que sea (Signos, mayusculas, etc.)</p><br><p> -Sencilo y rapido ¡A QUE ESPERAS!</p></html>");
        body.setFont(new Font("Serif", Font.PLAIN, 13));
        p1.add(passwd = new TextField("Your new password"), BorderLayout.SOUTH);

        JPanel p2 = new JPanel();
        setLayout(new FlowLayout());
        p2.add(new JLabel("Longitud"));
        p2.add(arriba = new JButton("^"));
        p2.add(abajo = new JButton("v"));
        p2.add(contador = new JLabel("0"));

        JPanel p3 = new JPanel();
        setLayout(new GridLayout(1,4,5,5));
        p3.add(mayus = new JCheckBox("Mayusculas"));
        p3.add(mayus = new JCheckBox("Minusculas"));
        p3.add(mayus = new JCheckBox("Signos"));
        p3.add(mayus = new JCheckBox("Numeros"));
        p3.add(p2, BorderLayout.WEST);

        JPanel principal = new JPanel();
        principal.add(p1, BorderLayout.NORTH);
        principal.add(p3, BorderLayout.SOUTH);

        add(principal);
        setSize(800,300);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
