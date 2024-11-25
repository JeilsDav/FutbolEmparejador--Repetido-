package metodosliga;

import java.util.ArrayList;
import java.util.Collections;

public class Emparejador {

    // Método estático para emparejar equipos de forma recursiva
    public static ArrayList<String> emparejarEquipos(ArrayList<String> equipos, ArrayList<String> partidos) {
        if (equipos.size() == 2) {
            partidos.add(equipos.get(0) + " vs " + equipos.get(1));
            return partidos;
        }

        Collections.shuffle(equipos);
        partidos.add(equipos.get(0) + " vs " + equipos.get(1));
        equipos.remove(0);
        equipos.remove(0);
        return emparejarEquipos(equipos, partidos); // Llamada recursiva
    }
}