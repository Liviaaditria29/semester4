/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasgui;

/**
 *
 * @author Lenovo
 */
import javax.swing.*;
import java.awt.*;
        
public class TugasGUI extends JFrame {

    private JTextField textField;

    TugasGUI() {
        super("Kalkulator");
        setSize(400, 400);
        JPanel panelUtama = new JPanel(new BorderLayout(5, 5));
        JPanel panelTombol = new JPanel(new GridLayout(3, 6, 5, 5));

        textField = new JTextField();
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton b0 = new JButton("0");
        JButton b10 = new JButton("+");
        JButton b11 = new JButton("-");
         
        JButton b12 = new JButton("*");
        JButton b13 = new JButton("/");
        JButton b14 = new JButton("=");
        JButton b15 = new JButton("%");
        JButton b16 = new JButton("Mod");
        JButton b17 = new JButton("Exit");

        panelUtama.add(textField, BorderLayout.NORTH);

        panelTombol.add(b1);
        panelTombol.add(b2);
        panelTombol.add(b3);
        panelTombol.add(b4);
        panelTombol.add(b5);
        panelTombol.add(b6);
        panelTombol.add(b7);
        panelTombol.add(b8);
        panelTombol.add(b9);
        panelTombol.add(b0);
        panelTombol.add(b10);
        panelTombol.add(b11);
        panelTombol.add(b12);
        panelTombol.add(b13);
        panelTombol.add(b14);
        panelTombol.add(b15);
        panelTombol.add(b16);
        panelTombol.add(b17);

        panelUtama.add(panelTombol, BorderLayout.CENTER);

        add(panelUtama);

        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();
    }

    public static void main(String[] args) {
        new TugasGUI();
    }
}