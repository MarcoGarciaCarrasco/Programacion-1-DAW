import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);    

    int contra = 1234;
    int intentos = 4;

    while (intentos > 0) {
        System.out.print("Ingrese la contraseña: ");
        int acceder = scanner.nextInt();

        if (acceder == contra) {
            System.out.println("¡Contraseña correcta! El papu ha entrado.");
            break;
        } else {
            intentos--;
            System.out.println("Contraseña incorrecta. Intentos restantes: " + intentos);
        }

    }
}
}