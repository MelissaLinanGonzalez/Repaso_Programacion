import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Forma extends JFrame{ // Se extiende para poder trabajar con Swing y usar los métodos sin problemas
    private JPanel panelPrincipal;
    private JTextField campoTexto;
    private JLabel replicadorLabel;

    public Forma(){
        inicializarForma();
        campoTexto.addActionListener(e -> {
            System.out.println("Se ejecutó el action listener");
        });
    }

    private void inicializarForma(){
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cuando se cierre la ventana tambien finaliza la aplicacion
        setSize(600, 400);
        setLocationRelativeTo(null); // Se centra la venta
    }

    public static void main(String[] args) {
        FlatDarculaLaf.setup(); // Se cambia el look and feel a modo oscuro
        Forma forma = new Forma();
        forma.setVisible(true);
    }
}
