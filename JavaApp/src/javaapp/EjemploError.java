
import java.util.Scanner;
public class EjemploError {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingresa tu nombre: ");
    String nombre = scanner.nextLine(); // Cambiamos nextInt por nextLine
    System.out.println("Hola, " + nombre);
}
}