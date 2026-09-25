
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println ("Introduce una cantidad de kb: ");
        int kb = scanner.nextInt();
        double conversion = kb * (0.001);
        System.out.println(kb + " son " + conversion + "MB");
    }
}
