package MaquinaSnack.servicio;

import MaquinaSnack.dominio.Snack;
import java.util.List;

public interface IServioSnacks {
    void agregarSnack(Snack snack);
    void mostrarSnacks();
    List<Snack> getSnacks();

}