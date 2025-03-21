import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("ingrese un numeri positivo de uno a dos digitos");
       int numero = sc.nextInt();
         sc.close();
         if (numero >=1 && numero <=9){
                System.out.println("el numero tiene un digito");
         }
         else if (numero >=10 && numero <=99){
                System.out.println("el numero tiene dos digitos");     
         }
    }
}