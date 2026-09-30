
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dia1 = "Lunes";
        String dia2 = "Martes";
        String dia3 = "Miercoles";
        String dia4 = "Jueves";
        String dia5 = "VIernes";
        String dia6 = "Sabado";
        String dia7 = "Domingo";

        System.out.println("Introduce un dia de la semana en valor numérico(1-7): ");
        int dia = scanner.nextInt();

        if (dia == 1 ){
            System.out.println( dia1 );
        }else if (dia == 2){
            System.out.println (dia2);
        }   
        else if (dia == 3){
            System.out.println (dia3);
        }   
        else if (dia == 4){
            System.out.println (dia4);
        }   
        else if (dia == 5){
            System.out.println (dia5);
        }   
        else if (dia == 6){
            System.out.println (dia6);
        }   
        else if (dia == 7){
            System.out.println (dia7);
        }else{
            System.out.println ("Ese valor no se encuentra entre las opciones.");
        }


    }
}
