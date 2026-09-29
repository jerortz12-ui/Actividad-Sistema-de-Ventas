import java.util.Scanner;

public class SistemaVentas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int cantidadVentas;
        int ventasMayores = 0;
        int ventasMenores = 0;

        double totalVentas = 0;
        double ventaMayor = 0;
        double ventaMenor = 0;

        System.out.print("Ingrese la cantidad de ventas: ");
        cantidadVentas = entrada.nextInt();

        for (int i = 1; i <= cantidadVentas; i++) {

            System.out.println("\nVenta #" + i);

            System.out.print("Ingrese el valor de la venta: ");
            double venta = entrada.nextDouble();

            totalVentas += venta;

            if (venta > 500000) {
                ventasMayores++;
            } else {
                ventasMenores++;
            }

            if (venta > ventaMayor) {
                ventaMayor = venta;
            }

            if (i == 1) {
                ventaMenor = venta;
            } else if (venta < ventaMenor) {
                ventaMenor = venta;
            }

            if (venta > 1000000) {
                System.out.println("CLIENTE VIP");
            }
            if (venta >= 500000 && venta <= 1000000) {
                System.out.println("ClIENTE FRECUENTE");
            }

            if (venta < 500000) {
                System.out.println("CLIENTE GENERAL");
            }

        }

        double promedio = totalVentas / cantidadVentas;

        System.out.println("\n========== INFORME EMPRESARIAL ==========");

        System.out.println("Cantidad de ventas: " + cantidadVentas);
        System.out.println("Total recaudado: $" + totalVentas);
        System.out.println("Promedio de ventas: $" + promedio);
        System.out.println("Venta más alta: $" + ventaMayor);
        System.out.println("Venta más baja: $" + ventaMenor);
        System.out.println("Ventas superiores a $500.000: " + ventasMayores);
        System.out.println("Ventas de $500.000 o menos: " + ventasMenores);

        entrada.close();
    }
}