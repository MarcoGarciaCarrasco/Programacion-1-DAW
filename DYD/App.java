import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class App {
    private static Scanner scanner = new Scanner(System.in);


    
    public static void main(String[] args) {
        
    }


    private static int tirarDado20(){
        return new Random().nextInt(20) + 1;
    }


    private static int leerEnteroSeguro(){
        int entero = 0;
        boolean esCorrecto = false;

        do {
            try {
                System.out.print("Introduce un número entero: ");
                entero = scanner.nextInt();
                esCorrecto = true;
            }
            catch (InputMismatchException ex){
                scanner.next();
                System.out.println("No es un entero");
            }
        }while (!esCorrecto);  
        return entero;
                
    }
}
