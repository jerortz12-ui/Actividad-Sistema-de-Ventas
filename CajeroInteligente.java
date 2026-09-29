import java.util.Scanner;

public class CajeroInteligente {
    public static void main(String[] args) {
        int[] compras = { 12000, 25000, 8000, 35000, 15000, 18000, 27000, 40000 };
        // creamos las variables
        int cantidadCompras = 0;
        int totalVentas = 0;
        int comprasGrandes = 0;
        int comprasPequeñas = 0;

        for (int i = 0; i < compras.length; i++) {
            totalVentas = totalVentas + compras[i];
            cantidadCompras++;
            if (compras[i] > 30000) {
                comprasGrandes++;
            }
            if (compras[i] <= 20000) {
                comprasPequeñas++;
            }

        }

        // vamos con el promedio
        double promedio = (double) totalVentas / cantidadCompras;

        System.out.println("Total de ventas: " + totalVentas);
        System.out.println("Cantidad de compras: " + cantidadCompras);
        System.out.println("Compras grandes: " + comprasGrandes);
        System.out.printf("Promedio: %.2f%n", promedio);
        System.out.println("Compras pequeñas: " + comprasPequeñas);

        if (promedio > 25000) {
            System.out.println("Dia excelente");

        } else {
            System.out.println("Dia normal");
        }

    }
}
