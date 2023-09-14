package swing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Suma {
    JFrame ventana;
    JTextField num1;
    JTextField num2;

    public Suma(){
        ventana = new JFrame("Suma");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(300, 200);
        ventana.setLayout(null);
       
        // COLOR NORMAL
        // ventana.getContentPane().setBackground(Color.RED);

        // COLOR HEXADECIMAL
        Color colorHexade = Color.decode("#DBCF96");
        ventana.getContentPane().setBackground(colorHexade);

        JLabel label1 =  new JLabel("Num 1");
        label1.setBounds(20, 20, 100, 30);
        ventana.add(label1);

        num1 = new JTextField();
        num1.setBounds(130, 20, 100, 30);
        ventana.add(num1);
        
        JLabel label2 = new JLabel("Num 2");
        label2.setBounds(20, 60, 100, 30);
        ventana.add(label2);
        
        num2 = new JTextField();
        num2.setBounds(130, 60, 100, 30);
        ventana.add(num2);

        JButton sumButton = new JButton("Sumar");
        sumButton.setBounds(100, 100, 100, 30);
        ventana.add(sumButton);

        sumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String Num1 = num1.getText();
                String Num2 = num2.getText();
                String resultado = Num1 + Num2;

                JOptionPane.showMessageDialog(ventana, "el resultado es: " + resultado);
            }
        });

        ventana.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run(){
                new Suma();
            }
        });
    }

}
