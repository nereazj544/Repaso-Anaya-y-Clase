package swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class User {
    JFrame ventana;
    JLabel Nombre;
    JTextField textNombre;
    JButton btnCargar;

    //OBJETO
    public User (){

        // TAMAÑO DE LA VENTANA Y DEMAS CONTENIDO DE LA VENTANA
        ventana = new JFrame();
        ventana.setSize(400, 400);
        ventana.setLayout(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
        
        // indicaciones con texto
        Nombre = new JLabel("Ingrese Nombre");
        Nombre.setBounds(30, 30, 100, 30);
        ventana.add(Nombre);

        // cuadro de texto 
        textNombre = new JTextField();
        textNombre.setBounds(135, 30, 200, 30);
        ventana.add(textNombre);

        // Configuracion del Boton 
        btnCargar = new JButton("Cargar");
        btnCargar.setBounds(135, 70, 100, 30);
        ventana.add(btnCargar);
        // Agregar ActionListener al botón
        btnCargar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostarDatosConsola();
            }
        });

    }

    public void mostarDatosConsola(){
        System.out.println("Bienvenido " + textNombre.getText());
    }

    public static void main(String[] args) {
        User c= new User();

    }
}