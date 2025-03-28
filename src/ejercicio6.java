import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un numero entero");
        int numero = sc.nextInt();
        sc.close();
        if (numero>0){
            System.out.println("el numero es positivo");
        }
        else if (numero<0){
            System.out.println("el numero es negativo");
        }
        else{
            System.out.println("el numero es nulo");
        }
    }
}
