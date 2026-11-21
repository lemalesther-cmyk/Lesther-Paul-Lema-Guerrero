/**
 * @author Lesther Paul Lema Guerrero
 */
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int a = sc.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int b = sc.nextInt();

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));

        if (b != 0) {
            System.out.println("División: " + ((double) a / b));
            System.out.println("Residuo: " + (a % b));
        } else {
            System.out.println("División: no se puede dividir para cero.");
            System.out.println("Residuo: no se puede calcular con divisor cero.");
        }

        sc.close();
    }
}
