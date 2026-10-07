import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int calculo = 0;

        System.out.println("Introduce un numero y te mostraré su tabla de multiplicar: ");
        int numero = scan.nextInt();

        for (int i = 0; i < 11; i++ ) {
            int multiplicacion = numero * calculo;
            System.out.println(numero + " x " + calculo + " = " + multiplicacion);
            calculo = calculo + 1;
        }   

        
    }
}