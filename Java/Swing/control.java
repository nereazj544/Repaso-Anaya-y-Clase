package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class control implements ActionListener{
    User ventana;


    public control() {
        ventana = new User();

    }

    public static void main(String[] args) {
        control ctrl = new control();
    }

    /*
     * Esto se mostrara por la consola no por la ventana de la app
    */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(ventana.btnCargar)) {
            ventana.mostarDatosConsola();
        }
    }
    
}
