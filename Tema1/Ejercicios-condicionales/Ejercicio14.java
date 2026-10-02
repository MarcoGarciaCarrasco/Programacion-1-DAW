
import java.util.Scanner;



public class Ejercicio14 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int cargo = 0;
    int diasVisitando = 0;
    int estadoCivil = 0;
    double sueldoBase = 0.0;
    double dietas = 0.0;
    double sueldoBruto = 0.0;
    final double importeDietas = 30.0;
    final double retencionSoltero = 0.25;
    final double retencionCasado = 0.2;
    double retencion = 0.0;
    double sueldoNeto = 0.0;
    

    System.out.println("1 - Programador junior");
    System.out.println("2 - Programador senior");
    System.out.println("3 - Jefe de proyecto");
    System.out.println("Introduzca el cargo del empleado (1 - 3):");
    cargo = scanner.nextInt();
    System.out.println("Cuantos dias ha estado de viaje visitando clientes? ");
    diasVisitando = scanner.nextInt();
    System.out.println("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
    estadoCivil = scanner.nextInt();

    // Calculos

    switch (cargo){
        case 1 -> sueldoBase = 950;
        case 2 -> sueldoBase = 1_200;
        case 3 -> sueldoBase = 1_600;
        default -> sueldoBase = -1.0;
    }

    dietas = diasVisitando * importeDietas;
    sueldoBruto = sueldoBase + dietas;

    if (estadoCivil == 1 ){
        retencion = sueldoBruto * retencionSoltero;
    }else if (estadoCivil == 2){
        retencion = sueldoBruto * retencionCasado;
    } else{
        retencion = - 1;
    }
    sueldoNeto = sueldoBruto - retencion;

    //Impresion
    if (sueldoBase == -1 ){
        System.out.println("El cargo introducido no existe");
    }else {
        if (estadoCivil !=1 && estadoCivil != 2){
            System.out.println("El estado civil introducido no existe");
        }else {
            System.out.println("---------------------------");
            System.out.printf("Sueldo base:%.2f ", sueldoBase);
            System.out.printf("\nSueldo neto:%.2f ", sueldoNeto);
            System.out.println("\n---------------------------");
        }
    }

    }
}
