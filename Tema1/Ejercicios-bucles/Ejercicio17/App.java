
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        int total = 0;

        System.out.println("Introduce un numero entero:");
        numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("El numero introducido no es correcto, prueba con un positivo: ");
        } else if (numero >=1) {
            for (int i = numero ; i <= (numero + 100); i++) {
                total += numero;
            }
            System.out.println(total);
        }
    }
}