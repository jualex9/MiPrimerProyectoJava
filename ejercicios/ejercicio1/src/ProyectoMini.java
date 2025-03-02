import java.util.Scanner;
public class ProyectoMini {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double PrimerNumero = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double SegundoNumero = scanner.nextDouble();
        System.out.print("Ingrese el tercer número: ");
        double TercerNumero = scanner.nextDouble();

        double MediaDeNumeros = (PrimerNumero + SegundoNumero + TercerNumero) / 3;

        System.out.println("La media de los tres números es: " + MediaDeNumeros);
        
        scanner.close();
        
    }
}