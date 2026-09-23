public class Ejercicio4 {
    public static void main(String[] args) {
        double pesetas =  50000.0;
        
        double conversion = 6.0/1000.0;

        double euros = pesetas * conversion;

        System.out.println(pesetas + " pesetas son " + euros + " euros");
    }
}
