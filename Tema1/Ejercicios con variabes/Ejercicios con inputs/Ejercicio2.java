
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Introduce tu Primer Apellido: ");
        String Apellido1 = scanner.nextLine();
        System.out.println("Introduce tu Segundo Apellido: ");
        String Apellido2 = scanner.nextLine();
        System.out.println( Apellido1 + ", " + Apellido2 + ", " +  nombre);

        scanner.close();

    }
}
