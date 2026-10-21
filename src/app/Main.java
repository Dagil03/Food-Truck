package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] productos = {"Hamburguesas", "Perros Calientes", "Papas Fritas"};
        String[] turnos = {"Almuerzo", "Tarde", "Noche", "Madrugada"};
        double[][] ventas = new double[3][4];
        registrarVentas(sc, productos, turnos, ventas);
    }
    public static void registrarVentas(Scanner sc, String[] productos, String[] turnos, double[][] ventas) {
        int i = 0;
        int j = 0;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print("Ingresos de " + productos[i] + " en turno " + turnos[j] + ": ");
                ventas[i][j] = sc.nextDouble();
            }
        }
    }
}