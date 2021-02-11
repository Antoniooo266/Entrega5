package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;

public class Ventana_Pass extends JFrame{
    private JLabel title;
    private JLabel body;
    private TextField passwd;
    private int contador = 8;
    private JButton arriba;
    private JButton abajo;
    private JButton generarPass;
    private JCheckBox minus;
    private JCheckBox mayus;
    private JCheckBox sign;
    private JCheckBox num;
    private JLabel label;
    String minusculas = "qwertyuiopñlkjhgfdsazxcvbnm";
    String mayusculas = "QWERTYUIOPÑLKJHGFDSAZXCVBNM";
    String signos = "?¡¿![]*()/&%@|";
    String numeros = "1234567890";

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
        arriba.addActionListener(new FuncionBotonArriba());
        p2.add(abajo = new JButton("v"));
        abajo.addActionListener(new FuncionBotonAbajo());
        p2.add(label = new JLabel(String.valueOf(contador)));

        JPanel p3 = new JPanel();
        setLayout(new GridLayout(1,4,5,5));
        p3.add(mayus = new JCheckBox("Mayusculas"));
        mayus.addActionListener(new GenerarPass());
        p3.add(minus = new JCheckBox("Minusculas"));
        minus.addActionListener(new GenerarPass());
        p3.add(sign = new JCheckBox("Signos"));
        sign.addActionListener(new GenerarPass());
        p3.add(num = new JCheckBox("Numeros"));
        num.addActionListener(new GenerarPass());
        p3.add(p2, BorderLayout.WEST);

        JPanel principal = new JPanel();
        principal.add(p1, BorderLayout.NORTH);
        principal.add(p3, BorderLayout.CENTER);
        principal.add(generarPass = new JButton("GENERAR"), BorderLayout.SOUTH);

        add(principal);
        setSize(800,300);
        setVisible(true);
    }

    private class FuncionBotonArriba implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (contador >= 8) {
                contador++;
                label.setText(String.valueOf(contador));
            }
        }
    }
    private class FuncionBotonAbajo implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
             if (contador >= 8) {
                 contador--;
                 label.setText(String.valueOf(contador));
             }
        }
    }
    public class GenerarPass implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}
