import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Forma extends JFrame{ // Se extiende para poder trabajar con Swing y usar los métodos sin problemas
    private JPanel panelPrincipal;
    private JTextField campoTexto;
    private JLabel replicadorLabel;

    public Forma(){
        inicializarForma();
//        campoTexto.addActionListener(e -> {
//            replicarTexto();
//        });
        campoTexto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                replicarTexto();
            }
        });
    }

    private void inicializarForma(){
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cuando se cierre la ventana tambien finaliza la aplicacion
        setSize(600, 400);
        setLocationRelativeTo(null); // Se centra la venta
    }

    private void replicarTexto(){
        this.replicadorLabel.setText(this.campoTexto.getText()); // Se recupera el texto introducido en el campo de texto
    }

    public static void main(String[] args) {
        FlatDarculaLaf.setup(); // Se cambia el look and feel a modo oscuro
        Forma forma = new Forma();
        forma.setVisible(true);
    }
}
