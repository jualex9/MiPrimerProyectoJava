import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese un numero uno");
        int numeroUno = input.nextInt();
        System.out.println("ingrese un numero dos");
        int numeroDos = input.nextInt();
        input.close();
        if (numeroUno > numeroDos){
            System.out.println("el numero uno es el mayor: " + numeroUno);
        }
        else if (numeroUno < numeroDos){
            System.out.println("el numero dos es el mayor: " + numeroDos);
        }
        
    }
}