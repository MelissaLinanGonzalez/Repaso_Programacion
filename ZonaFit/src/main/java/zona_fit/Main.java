package zona_fit;

import zona_fit.datos.ClienteDAO;
import zona_fit.domain.Cliente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ClienteDAO clienteDAO = new ClienteDAO();
        System.out.println("*** Sistema de Zona Fit ***");
        Scanner entrada = new Scanner(System.in);
        int opcion ;
        boolean seguir = false;
        while (!seguir){
            System.out.print("""
                    \n--- Menú ---
                    \t1. Listar los clientes
                    \t2. Añadir nuevo cliente
                    \t3. Modificar cliente existente
                    \t4. Eliminar cliente
                    \t5. Salir.
                    """);
            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(" ");
                    System.out.println("*** Clientes ***");
                    var clientes = clienteDAO.listarClientes();
                    clientes.forEach(System.out::println);
                    break;
                case 2:
                    System.out.println(" ");
                    entrada.nextLine();
                    System.out.print("Introduce el nombre: ");
                    String nombre = entrada.nextLine();
                    System.out.print("Introduce el apellido: ");
                    String apellido = entrada.nextLine();
                    System.out.print("Introduce el número de membresía: ");
                    int membresia = entrada.nextInt();
                    Cliente cliente = new Cliente(nombre, apellido, membresia);
                    boolean agregado = clienteDAO.agregarCliente(cliente);
                    if (agregado){
                        System.out.println("Cliente añadido correctamente: " + cliente);
                    } else {
                        System.out.println("Error al añadir cliente: " + cliente);
                    }
                    break;
                case 3:
                    System.out.println(" ");
                    System.out.print("Introduce el id del cliente que deseas modificar: ");
                    int id = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("Introduce el nombre modificado (o el suyo si no desea modificarlo): ");
                    String nombreModificado = entrada.nextLine();
                    System.out.print("Introduce el apellido modificado (o el suyo si no desea modificarlo): ");
                    String apellidoModificado = entrada.nextLine();
                    System.out.print("Introduce el número de membresía (o el suyo si no desea modificarlo): ");
                    int membresiaModificada = entrada.nextInt();

                    Cliente clienteModificado = new Cliente(id, nombreModificado, apellidoModificado, membresiaModificada);
                    boolean modificado = clienteDAO.modificarCliente(clienteModificado);
                    if (modificado){
                        System.out.println("Cliente modificado correctamente");
                    } else {
                        System.out.println("Error al modificar cliente");
                    }
                    break;
                case 4:
                    System.out.println(" ");
                    System.out.println("*** Clientes ***");
                    var listaClientes = clienteDAO.listarClientes();
                    listaClientes.forEach(System.out::println);
                    System.out.print("Introduce el id del cliente que deseas eliminar: ");
                    int idEliminar = entrada.nextInt();
                    Cliente clienteEliminar = new Cliente(idEliminar);
                    boolean eliminado = clienteDAO.eliminarCliente(clienteEliminar);
                    if (eliminado){
                        System.out.println("Cliente eliminado correctamente");
                    } else {
                        System.out.println("Error al eliminar el cliente");
                    }
                    break;
                case 5:
                    System.out.println(" ");
                    System.out.println("Saliendo del programa. Hasta pronto ...");
                    seguir = true;
                    break;
                default:
                    System.out.println("Valor introduci NO válido");
                    break;
            }
        }
    }
}