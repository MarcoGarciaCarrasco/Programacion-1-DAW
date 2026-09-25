
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner (System.in);

        System.out.println("Introduce tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Introduce tu direccion: ");
        String direccion = scanner.nextLine();
        System.out.println("Introduce tu numero de contacto: ");
        int contacto = scanner.nextInt();

        System.out.println( nombre);
        System.out.println( direccion);
        System.out.println( contacto);

        scanner.close();

    }
        
    
}
