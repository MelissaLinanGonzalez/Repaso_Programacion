package MaquinaSnack.servicio;

import MaquinaSnack.dominio.Snack;

import java.util.ArrayList;
import java.util.List;

public class ServicioSnacksLista implements IServioSnacks{
    private static final List<Snack> snacks;

    // Bloque de tipo estatico inicializador

    static {
        snacks = new ArrayList<>();
        snacks.add(new Snack("Patatas", 1.5));
        snacks.add(new Snack("Pipas", 0.75));
        snacks.add(new Snack("Cocacola", 1.85));
    }

    public void agregarSnack (Snack snack){
        snacks.add(snack);
    }

    public void mostrarSnacks(){
        var inventarioSnack = "";
        for (var snack : snacks){
            inventarioSnack += snack.toString() + "\n";
        }
        System.out.println("--- Snacks disponibles ---");
        System.out.println(inventarioSnack);
    }

    public List<Snack> getSnacks(){
        return snacks;
    }
}