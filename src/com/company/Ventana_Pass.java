package com.company;

import javax.swing.*;
import java.awt.*;

public class Ventana_Pass extends JFrame {
    private JLabel title;
    private JLabel body;
    private TextField passwd;

    public Ventana_Pass(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel p1 = new JPanel();
        p1.add(title = new JLabel("PassRandom.com"));
        title.setFont(new Font("Serif", Font.PLAIN, 28));
        p1.add(body = new JLabel());
        body.setText("<html><p>Genera tu passwords seguros con un solo CLICK!</p><br><p> -Sin tener que pensar</p><br><p> -Elige de que tipo quieres que sea (Signos, mayusculas, etc.)</p><br><p> -Sencilo y rapido ¡A QUE ESPERAS!</p></html>");
        body.setFont(new Font("Serif", Font.PLAIN, 13));
        p1.add(passwd = new TextField("Your new password"), BorderLayout.SOUTH);

        JPanel p2 = new JPanel();



        add(p1);
        setSize(350,500);
        setVisible(true);
    }
}
