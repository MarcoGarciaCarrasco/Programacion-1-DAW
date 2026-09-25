import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("Introduce una cantidad de euros: ");
        int euros = scanner.nextInt();

        double conversion = (euros * 166.3860);

        System.out.println(euros + " son en pesetas: " + conversion);

        scanner.close(); 

    }
}


