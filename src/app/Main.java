package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] productos = {"Hamburguesas", "Perros Calientes", "Papas Fritas"};
        String[] turnos = {"Almuerzo", "Tarde", "Noche", "Madrugada"};
        double[][] ventas = new double[3][4];
        registrarVentas(sc, productos, turnos, ventas);
        generarReportes(productos, turnos, ventas);
    }
    public static void registrarVentas(Scanner sc, String[] productos, String[] turnos, double[][] ventas) {
        int i = 0;
        int j = 0;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print("Ingresos de " + productos[i] + " en turno " + turnos[j] + ": ");
                ventas[i][j] = leerValorValido(sc);

            }
        }
    }
    public static double leerValorValido(Scanner sc) {
        double valor = 0;
        valor = sc.nextDouble();
        while (valor < 0) {
            System.out.print("Error: Monto invalido. Ingrese nuevamente: ");
            valor = sc.nextDouble();
        }
        return valor;
    }
    public static void generarReportes(String[] productos, String[] turnos, double[][] ventas) {
        double[] totalProductos = new double[3];
        double[] totalTurnos = new double[4];
        int i = 0;
        int j = 0;

        for (i = 0; i < 3; i++) {
            totalProductos[i] = 0;
            for (j = 0; j < 4; j++) {
                totalProductos[i] = totalProductos[i] + ventas[i][j];
            }
        }

        for (j = 0; j < 4; j++) {
            totalTurnos[j] = 0;
            for (i = 0; i < 3; i++) {
                totalTurnos[j] = totalTurnos[j] + ventas[i][j];
            }
        }
    }
    public static int mayor(double[] vector) {
        int pos = 0;
        int k = 0;
        for (k = 1; k < vector.length; k++) {
            if (vector[k] > vector[pos]) {
                pos = k;
            }
        }
        return pos;
    }
    public static int menor(double[] vector) {
        int pos = 0;
        int k = 0;
        for (k = 1; k < vector.length; k++) {
            if (vector[k] < vector[pos]) {
                pos = k;
            }
        }
        return pos;
    }
}