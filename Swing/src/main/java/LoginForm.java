import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame{
    private JPanel panelPrincipal;
    private JTextField usuarioTexto;
    private JPasswordField passwordTexto;
    private JButton enviarBoton;

    public LoginForm(){
        inicializarForma();
        enviarBoton.addActionListener(e -> validar());
    }

    private void inicializarForma(){
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null); // Se centra la ventana
    }

    private void validar(){
        // Leer los valores
        var usuario = this.usuarioTexto.getText();
        var password = new String(this.passwordTexto.getPassword());
        if ("root".equals(usuario) && "admin".equals(password)){
            mostrarMensaje("Datos correctos, bienvenidos!");
        } else if ("root".equals(usuario)) {
            mostrarMensaje("Contraseña incorrecta");
        } else {
            mostrarMensaje("Usuario incorrecto");
        }
    }

    private void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje);
    }

    public static void main(String[] args) {
        FlatDarculaLaf.setup(); // Modo de vista oscuro
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
    }
}
