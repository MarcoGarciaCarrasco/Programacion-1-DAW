
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vehiculo bici = new Bicicleta();
        Vehiculo coche = new Coche();
        int opcion = 0;

        System.out.println("1. Anada con la bici");
        System.out.println("3. Anda con el coche");
        System.out.println("4. Quemar rueda");

        opcion = scanner.nextInt();

        switch (opcion) {
            case 1 -> {
                int kilometros = scanner.nextInt();
                bici.recorre(kilometros);
            }
        }
    }    
}
