import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println ("Introduce el precio sin iva de algo que quieras comprar:");
        int precioinamobible = scanner.nextInt();

        double iva = precioinamobible * (0.21);

        System.out.println ("Precio Inamobible: " + precioinamobible);
        System.out.println ("IVA: " + iva);

    }
}
