public class App {
    public static void main(String[] args) {
        /* masonada */
        System.out.print("Este metodo no salta de linea\n");
        System.out.println("\033[0m Hola Mundo");

        System.out.printf("El profesor tiene %d años ", 46 );
        System.out.printf("Ha nacido en %-10s y se crio en %10s\n", "Malaga", "Estepona");
        System.out.printf("Y vive a %.2f kilometros de distancia", 14.78);
    }
}
