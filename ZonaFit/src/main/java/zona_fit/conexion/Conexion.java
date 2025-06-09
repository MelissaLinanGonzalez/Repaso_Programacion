package zona_fit.conexion;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    public static Connection getConexion(){
        Connection conexion = null;
        String baseDatos = "zona_fit_db";
        String url = "jdbc:mysql://localhost:3306/" + baseDatos;
        String usuario = "root";
        String password = "14022019";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Esta es la conexión con la base de datos
            conexion = DriverManager.getConnection(url, usuario, password);
        } catch (Exception e) {
            System.out.println("Error al conectar con la base de datos: " + e.getMessage());
        } return conexion;
    }

    // Comprobación de conexión a la base de datos
//    public static void main(String[] args) {
//        Connection conexion = Conexion.getConexion();
//        if (conexion != null){
//            System.out.println("Conexion exitosa: " + conexion);
//        } else {
//            System.out.println("Error al conectarse");
//        }
//    }
}
