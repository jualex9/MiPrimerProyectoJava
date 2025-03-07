import java.util.Scanner;

public class UsuarioTresNumeros {
    public static void main(String[] args) {
         Scanner  Scanner = new Scanner(System.in);

         System.out.print("Ingrese el primer número: ");
         int PrimerNumero = Scanner.nextInt();
         System.out.print("Ingrese el segundo número: ");
         int SegundoNumero = Scanner.nextInt();
         System.out.print("Ingrese el tercer número: ");
         int TercerNumero = Scanner.nextInt();

         boolean resultado = (PrimerNumero > SegundoNumero) && (PrimerNumero < TercerNumero);
         Scanner.close();

        System.out.println("¿El primer número es mayor que el segundo y menor que el tercero? " + resultado);
    }
}
