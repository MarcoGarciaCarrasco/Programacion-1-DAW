import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce un numero entero y te dire cuantos digitos tiene: ");
        int numero = scan.nextInt();
        int numerofinal = numero;
        int contador = 0;

        if (numero < 0){
            numero = numero * -1;
        } while (numero != 0){
            numero /=10;
            contador++;
        }

        System.out.println("El numero " + numerofinal + " tiene " + contador + " digitos" );
    }
    
}
