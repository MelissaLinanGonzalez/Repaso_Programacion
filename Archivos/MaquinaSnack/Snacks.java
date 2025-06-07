package MaquinaSnack;

import java.util.ArrayList;
import java.util.List;

public class Snacks {
    private static final List<Snack> snacks;

    // Bloque de tipo estatico inicializador

    static {
        snacks = new ArrayList<>();
        snacks.add(new Snack("Patatas", 1.5));
        snacks.add(new Snack("Pipas", 0.75));
        snacks.add(new Snack("Cocacola", 1.85));
    }

    public static void agregarSnack (Snack snack){
        snacks.add(snack);
    }

    public static void mostrarSnacks(){
        var inventarioSnack = "";
        for (var snack : snacks){
            inventarioSnack += snack.toString() + "\n";
        }
        System.out.println("--- Snacks disponibles ---");
        System.out.println(inventarioSnack);
    }

    public static List<Snack> getSnacks(){
        return snacks;
    }
}