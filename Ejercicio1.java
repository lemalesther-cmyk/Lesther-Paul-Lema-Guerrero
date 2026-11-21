/**
 * @author Lesther Paul Lema Guerrero
 */
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        sc.nextLine();

        System.out.print("Ingrese su carrera: ");
        String carrera = sc.nextLine();

        System.out.print("Ingrese su estatura (en metros): ");
        double estatura = sc.nextDouble();

        System.out.println("\n--- DATOS INGRESADOS ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Carrera: " + carrera);
        System.out.printf(Locale.US, "Estatura: %.2f m%n", estatura);

        sc.close();
    }
}
