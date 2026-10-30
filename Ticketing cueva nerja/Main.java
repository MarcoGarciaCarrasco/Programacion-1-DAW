
import java.util.Scanner;

public class Main {
    public void lectura() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce cuantas entradas para adultos necesitas: ");
        int numEntrAdul = scanner.nextInt();
        System.out.println("Introduce cuantas entradas para niños necesitas: ");
        int numEntrNino = scanner.nextInt();
        System.out.println("Cuantas audioguias necesitas?  ");
        int numGuias = scanner.nextInt();
        Ticket ticket1 = new Ticket(numEntrAdul, numEntrNino, numGuias);
    }
}
