package zona_fit.datos;

import zona_fit.connection.Conexion;
import zona_fit.domain.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO implements IClienteDAO{
    @Override
    public List<Cliente> listarClientes() {
        List<Cliente> clientes = new ArrayList<>();
        PreparedStatement ps; // Nos permite preparar la sentencia de sql
        ResultSet rs; // Contiene el resultado de la consulta
        Connection con = Conexion.getConexion();
        String sql = "SELECT * FROM cliente ORDER BY id";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setMembresia(rs.getInt("membresia"));
                clientes.add(cliente);
            }
        } catch (Exception e) {
            System.out.println("Error al listar clientes: " + e.getMessage());
        }
        finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar conexion: " + e.getMessage());
            }
        }
        return clientes;
    }

    @Override
    public boolean buscarClientePorId(Cliente cliente) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = Conexion.getConexion();
        String sql = "SELECT * FROM cliente WHERE id = ?";
        try {
            ps = con.prepareStatement(sql); //Se prepara la consulta sql
            ps.setInt(1, cliente.getId()); // Se introduce el parámetro que falta en la consulta = ?
            rs = ps.executeQuery();
            if (rs.next()){
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setMembresia(rs.getInt("membresia"));
                return true;
            }
        } catch (Exception e) {
            System.out.println("Error al buscar el cliente por el id: " + e.getMessage());
        }

        finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }

        return false;
    }

    @Override
    public boolean agregarCliente(Cliente cliente) {
        return false;
    }

    @Override
    public boolean modificarCliente(Cliente cliente) {
        return false;
    }

    @Override
    public boolean eliminarCliente(Cliente cliente) {
        return false;
    }

    public static void main(String[] args) {
        // Listar clientes
//        System.out.println("*** Listar clientes ***");
        IClienteDAO clienteDAO = new ClienteDAO();
//        var clientes = clienteDAO.listarClientes();
//        clientes.forEach(System.out::println);

        // Buscar por id
        Cliente cliente1 = new Cliente(2);
        System.out.println("Cliente antes de la búsqueda: " + cliente1);
        var encontrado = clienteDAO.buscarClientePorId(cliente1);
        if (encontrado){
            System.out.println("Cliente encontrado: " + cliente1);
        } else {
            System.out.println("No se encontró cliente: " + cliente1.getId());
        }
    }
}
