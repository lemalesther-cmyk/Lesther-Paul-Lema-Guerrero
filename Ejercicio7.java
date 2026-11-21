/**
 * @author Lesther Paul Lema Guerrero
 */
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int cantidad = 0;
        double suma = 0;

        System.out.print("Ingrese un número positivo (negativo para terminar): ");
        double numero = sc.nextDouble();

        while (numero >= 0) {
            cantidad++;
            suma += numero;

            System.out.print("Ingrese un número positivo (negativo para terminar): ");
            numero = sc.nextDouble();
        }

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Cantidad de números ingresados: " + cantidad);
        System.out.println("Suma total: " + suma);

        sc.close();
    }
}
