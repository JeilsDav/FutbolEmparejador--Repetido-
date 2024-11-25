package metodosliga;

import java.util.ArrayList;

public class MostradorDePartidos {

    // Método para mostrar los enfrentamientos de manera organizada
    public static void mostrarPartidos(ArrayList<String> partidos) {
        System.out.println("\nLista de enfrentamientos:");
        for (int i = 0; i < partidos.size(); i++) {
            String enfrentamiento = partidos.get(i);
            // Alineación para imprimir los enfrentamientos de manera ordenada
            System.out.printf("Enfrentamiento %2d: %-30s\n", i + 1, enfrentamiento);
        }
    }
}