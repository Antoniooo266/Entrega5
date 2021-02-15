package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class Ventana_Pass extends JFrame {
    private JLabel title;
    private JLabel body;
    private JLabel password;
    private int contador = 8;
    private JButton arriba;
    private JButton abajo;
    private JButton generar;
    private JCheckBox minus;
    private JCheckBox mayus;
    private JCheckBox sign;
    private JCheckBox num;
    private JLabel label;


    public Ventana_Pass() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel p1 = new JPanel();
        setLayout(new GridLayout(2, 1));
        p1.add(title = new JLabel("PassRandom.com"));
        title.setFont(new Font("Serif", Font.PLAIN, 28));
        p1.add(body = new JLabel());
        body.setText("<html><p>Genera tus passwords seguros con un solo CLICK!</p><br><p> -Sin tener que pensar</p><br><p> -Elige de que tipo quieres que sea (Signos, mayusculas, etc.)</p><br><p> -Sencilo y rapido ¡A QUE ESPERAS!</p></html>");
        body.setFont(new Font("Serif", Font.PLAIN, 13));
        p1.add(password = new JLabel("Your new password"), BorderLayout.SOUTH);

        JPanel p2 = new JPanel();
        setLayout(new FlowLayout());
        p2.add(new JLabel("Longitud"));
        p2.add(arriba = new JButton("^"));
        arriba.addActionListener(new FuncionBotonArriba());
        p2.add(abajo = new JButton("v"));
        abajo.addActionListener(new FuncionBotonAbajo());
        p2.add(label = new JLabel(String.valueOf(contador)));

        JPanel p3 = new JPanel();
        setLayout(new GridLayout(1, 4, 5, 5));
        p3.add(mayus = new JCheckBox("Mayusculas"));
        p3.add(minus = new JCheckBox("Minusculas"));
        p3.add(sign = new JCheckBox("Signos"));
        p3.add(num = new JCheckBox("Numeros"));
        p3.add(p2, BorderLayout.WEST);

        JPanel principal = new JPanel();
        principal.add(p1, BorderLayout.NORTH);
        principal.add(p3, BorderLayout.CENTER);
        principal.add(generar = new JButton("GENERAR"), BorderLayout.SOUTH);
        generar.addActionListener(new GenerarPass());

        add(principal);
        setSize(800, 300);
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

    public class GenerarPass implements ActionListener {
        Random random = new Random();
        ArrayList<Character> Contraseña = new ArrayList<Character>();
        private String passwd = " ";

        @Override
        public void actionPerformed(ActionEvent e) {
            //Parametros de el codigo ASCII
            if (mayus.isSelected()) {
                for (char i = 65; i <= 90; i++) {
                    Contraseña.add(i);
                }
            }
            if (minus.isSelected()) {
                for (char i = 97; i <= 122; i++) {
                    Contraseña.add(i);
                }
            }
            if (sign.isSelected()) {
                for (char i = 33; i <= 47; i++) {
                    Contraseña.add(i);
                }
            }
            if (num.isSelected()) {
                for (char i = 48; i <= 57; i++) {
                    Contraseña.add(i);
                }
            }
            for (int i = 0; i < contador; i++) {
                passwd += Contraseña.get(random.nextInt(Contraseña.size()));
                password.setText(passwd);
            }
            Contraseña.clear();
        }
    }

    public static void main(String[] args) {
        Ventana_Pass v1 = new Ventana_Pass();
    }
}
