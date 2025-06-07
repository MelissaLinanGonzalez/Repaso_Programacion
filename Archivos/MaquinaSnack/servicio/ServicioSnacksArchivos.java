package MaquinaSnack.servicio;

import MaquinaSnack.dominio.Snack;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ServicioSnacksArchivos implements IServioSnacks{
    private final String NOMBRE_ARCHIVO = "snacks.txt";
    // Crear la lista de snacks
    private List<Snack> snacks = new ArrayList<>();

    // Constructor de la clase
    public ServicioSnacksArchivos(){
        // Creamos el archivo si no existe
        File archivo = new File(NOMBRE_ARCHIVO);
        boolean existe = false;
        try {
            existe = archivo.exists();
            if (existe){
                this.snacks = obtenerSnacks();
            }else {
                PrintWriter salida = new PrintWriter(new FileWriter(archivo));
                salida.close(); // Para guardar el archivo en disco
                System.out.println("Se ha creado el archivo");
            }
        } catch (Exception e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }
        // Si no existe, cargamos algunos snacks iniciales
        if (!existe){
            cargarSnacksIniciales();
        }
    }

    private void cargarSnacksIniciales(){
        this.agregarSnack(new Snack("Chuches", 0.50));
        this.agregarSnack(new Snack("Pringles", 2.50));
        this.agregarSnack(new Snack("Conchas", 1));
    }

    private List<Snack> obtenerSnacks(){
        ArrayList<Snack> snacks = new ArrayList<>();
        try {
            List<String> lineas = Files.readAllLines(Paths.get(NOMBRE_ARCHIVO));
            for (String linea : lineas){
                String[] lineaSnack = linea.split(",");
                var idSnack = lineaSnack[0];
                String nombre = lineaSnack[1];
                var precio = Double.parseDouble(lineaSnack[2]);
                var snack = new Snack(nombre, precio);
                snacks.add(snack); // Agregamos el snack leido a la lista
            }
        } catch (Exception e) {
            System.out.println("Error al leer archivo de snacks: " + e.getMessage());
            e.printStackTrace();
        }
        return snacks;
    }

    @Override
    public void agregarSnack(Snack snack) {
        // Agregamos el nuevo snack
        //1. A la lista en memoria
        this.snacks.add(snack);
        //2. Guardamos el nuevo snack en el archivo
        this.agregarSnackArchivo(snack);
    }

    private void agregarSnackArchivo(Snack snack){
        boolean agregar = false;
        File archivo = new File(NOMBRE_ARCHIVO);
        try {
            agregar = archivo.exists();
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, agregar));
            salida.println(snack.escribirSnack());
            salida.close(); //Se escribe la información en el archivo
        } catch (Exception e) {
            System.out.println("Error al agregar snack: " + e.getMessage());
        }
    }

    @Override
    public void mostrarSnacks() {
        System.out.println("--- Snacks en el Inventario ---");
        // Mostramos la lista de snacks en el archivo
        var inventarioSnack = "";
        for (Snack snack : this.snacks){
            inventarioSnack += snack.toString() + " \n";
        }
        System.out.println(inventarioSnack);
    }

    @Override
    public List<Snack> getSnacks() {
        return List.of();
    }
}
