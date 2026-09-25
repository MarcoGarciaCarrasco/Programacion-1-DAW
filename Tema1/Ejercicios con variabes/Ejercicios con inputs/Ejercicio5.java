import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Introduce una cantidad de pesetas: ");

        int pesetas = scanner.nextInt();

        double conversion = (pesetas / 166.3860);

        System.out.println(pesetas + " son en pesetas: " + conversion);

        scanner.close(); 

    }
}
