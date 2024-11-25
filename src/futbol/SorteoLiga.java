package futbol;

import metodosliga.Emparejador;
import metodosliga.MostradorDePartidos;

import java.util.ArrayList;
import java.util.Scanner;

public class SorteoLiga {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> equipos = new ArrayList<>();

        // Ingreso de equipos
        System.out.println("Ingrese los nombres de los equipos (16 en total):");
        for (int i = 1; i <= 16; i++) {
            System.out.print("Equipo " + i + ": ");
            equipos.add(scanner.nextLine());
        }

        // Octavos de final
        System.out.println("\n--- Octavos de final ---");
        ArrayList<String> partidos = new ArrayList<>();
        Emparejador.emparejarEquipos(equipos, partidos);
        MostradorDePartidos.mostrarPartidos(partidos);
        
        // Ingresar los ganadores de octavos
        ArrayList<String> ganadoresOctavos = new ArrayList<>();
        System.out.println("\nIngrese los ganadores de los partidos:");
        for (int i = 0; i < partidos.size(); i++) {
            // Validar ganador
            String ganador;
            do {
                System.out.print("Ganador del partido " + (i + 1) + " (debe ser uno de los equipos del enfrentamiento): ");
                ganador = scanner.nextLine();
                if (!partidos.get(i).contains(ganador)) {
                    System.out.println("¡Error! El equipo ingresado no es parte de este enfrentamiento. Inténtalo de nuevo.");
                }
            } while (!partidos.get(i).contains(ganador));  // Verifica si el ganador está en el enfrentamiento actual

            ganadoresOctavos.add(ganador);
        }

        // Cuartos de final
        System.out.println("\n--- Cuartos de final ---");
        partidos.clear();
        Emparejador.emparejarEquipos(ganadoresOctavos, partidos);
        MostradorDePartidos.mostrarPartidos(partidos);
        
        // Ingresar los ganadores de cuartos
        ArrayList<String> ganadoresCuartos = new ArrayList<>();
        System.out.println("\nIngrese los ganadores de los partidos:");
        for (int i = 0; i < partidos.size(); i++) {
            // Validar ganador
            String ganador;
            do {
                System.out.print("Ganador del partido " + (i + 1) + " (debe ser uno de los equipos del enfrentamiento): ");
                ganador = scanner.nextLine();
                if (!partidos.get(i).contains(ganador)) {
                    System.out.println("¡Error! El equipo ingresado no es parte de este enfrentamiento. Inténtalo de nuevo.");
                }
            } while (!partidos.get(i).contains(ganador));  // Verifica si el ganador está en el enfrentamiento actual

            ganadoresCuartos.add(ganador);
        }

        // Semifinales
        System.out.println("\n--- Semifinales ---");
        partidos.clear();
        Emparejador.emparejarEquipos(ganadoresCuartos, partidos);
        MostradorDePartidos.mostrarPartidos(partidos);
        
        // Ingresar los ganadores de semifinales
        ArrayList<String> ganadoresSemis = new ArrayList<>();
        System.out.println("\nIngrese los ganadores de los partidos:");
        for (int i = 0; i < partidos.size(); i++) {
            // Validar ganador
            String ganador;
            do {
                System.out.print("Ganador del partido " + (i + 1) + " (debe ser uno de los equipos del enfrentamiento): ");
                ganador = scanner.nextLine();
                if (!partidos.get(i).contains(ganador)) {
                    System.out.println("¡Error! El equipo ingresado no es parte de este enfrentamiento. Inténtalo de nuevo.");
                }
            } while (!partidos.get(i).contains(ganador));  // Verifica si el ganador está en el enfrentamiento actual

            ganadoresSemis.add(ganador);
        }

        // Finales
        System.out.println("\n--- Finales ---");
        partidos.clear();
        Emparejador.emparejarEquipos(ganadoresSemis, partidos);
        MostradorDePartidos.mostrarPartidos(partidos);

        // Ingresar el ganador de la final
        String ganadorFinal;
        do {
            System.out.println("\nIngrese el ganador de la final (debe ser uno de los equipos del enfrentamiento):");
            ganadorFinal = scanner.nextLine();
            if (!partidos.get(0).contains(ganadorFinal)) {
                System.out.println("¡Error! El equipo ingresado no es parte de este enfrentamiento. Inténtalo de nuevo.");
            }
        } while (!partidos.get(0).contains(ganadorFinal));  // Verifica si el ganador está en el enfrentamiento final

        System.out.println("\nEl campeón es: " + ganadorFinal);

        scanner.close();
    }
}