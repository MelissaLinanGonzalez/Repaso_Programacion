package MaquinaSnack.presentacion;

import MaquinaSnack.dominio.Snack;
import MaquinaSnack.servicio.IServioSnacks;
import MaquinaSnack.servicio.ServicioSnacksArchivos;
import MaquinaSnack.servicio.ServicioSnacksLista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks {
    public static void main(String[] args) {
        maquinaSnacks();
    }

    public static void maquinaSnacks(){
        var salir = false;
        var entrada = new Scanner(System.in);
        // Creamos el objeto para obtener el servicio de snacks (lista)
        //IServioSnacks servicioSnacks = new ServicioSnacksLista();
        IServioSnacks servicioSnacks = new ServicioSnacksArchivos();
        // Creamos la lista de productos de tipo snack
        List<Snack> productos = new ArrayList<>();
        System.out.println("*** Máquina de Snacks ***");
        servicioSnacks.mostrarSnacks(); // Mostramos el inventario disponible

        while (!salir){
            try{
                var opcion = mostrarMenu(entrada);
                salir = ejecutarOpciones(opcion, entrada, productos, servicioSnacks);
            }catch (Exception e){
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
            finally {
                System.out.println(" ");
            }
        }
    }

    private static int mostrarMenu(Scanner entrada){
        System.out.print("""
                Menu:
                1. Comprar snack
                2. Mostrar ticket
                3. Agregar snack
                4. Inventario Snacks
                5. Salir
                Elige una opción: \s""");
        // Leemos y devolvemos la opcion seleccionada por el usuario
        return Integer.parseInt(entrada.nextLine());
    }

    private static boolean ejecutarOpciones(int opcion, Scanner entrada, List<Snack> productos, IServioSnacks servicioSnacks){
        var salir = false;
        switch (opcion){
            case 1 -> comprarSnack(entrada, productos, servicioSnacks);
            case 2 -> mostrarTicket(productos);
            case 3 -> agregarSnack(entrada, servicioSnacks);
            case 4 -> listarInventarioSnacks(entrada, servicioSnacks);
            case 5 -> {
                System.out.println("Saliendo del programa...");
                salir = true;
            }
            default -> System.out.println("Opción incorrecta: " + entrada);
        }
        return salir;
    }

    private static void listarInventarioSnacks(Scanner entrda, IServioSnacks servioSnacks){
        servioSnacks.mostrarSnacks();
    }

    private static void comprarSnack(Scanner entrada, List<Snack> productos, IServioSnacks servicioSnacks){
        System.out.print("¿Qué quieres comprar (id)? ");
        var idSnack = Integer.parseInt(entrada.nextLine());
        // Validar que el snack exista en la lista
        var snackEncontrado = false;
        for (var snack : servicioSnacks.getSnacks()){
            if (idSnack == snack.getIdSnack()){
                //Agregamos el snack a la lista de productos
                productos.add(snack);
                System.out.println("Producto agregado: " + snack);
                snackEncontrado = true;
                break;
            }
        }
        if (!snackEncontrado){
            System.out.println("Id de snack no encontrado: " + idSnack);
        }
    }

    private static void mostrarTicket(List<Snack> productos){
        String ticket = "*** Ticket de venta ***";
        double total = 0.0;
        for (var producto : productos){
            ticket += "\n\t- " + producto.getNombre() + " - " + producto.getPrecio() + "€";
            total += producto.getPrecio();
        }
        ticket += "\n\tTotal -> " + total + "€";
        System.out.println(ticket);
    }

    private static void agregarSnack(Scanner entrada, IServioSnacks servicioSnacks){
        System.out.print("Nombre del producto a agregar: ");
        var nombre = entrada.nextLine();
        System.out.print("Precio del producto: ");
        var precio = entrada.nextDouble();
        entrada.nextLine();
        servicioSnacks.agregarSnack(new Snack(nombre, precio));
        System.out.println("Producto agregado correctamente");
        servicioSnacks.mostrarSnacks();
    }
}