/**
 * @author Lesther Paul Lema Guerrero
 */
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Ingrese el número 1: ");
        double mayor = sc.nextDouble();
        double menor = mayor;

        for (int i = 2; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            double numero = sc.nextDouble();

            if (numero > mayor) {
                mayor = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Número mayor: " + mayor);
        System.out.println("Número menor: " + menor);

        sc.close();
    }
}
