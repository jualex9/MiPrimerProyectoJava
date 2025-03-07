import java.util.Scanner;

public class ScannerPrueba{
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = Scanner.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = Scanner.nextInt();
        Scanner.close();

        System.out.println("Hola, " + nombre + ". Tienes " + edad + " años.");
    }
}