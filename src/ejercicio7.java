import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("ingrese un numero entero");
       double numero = sc.nextDouble();
         sc.close();
         if (numero >=1 && numero <=9){
                System.out.println("el numero tiene un digito");
         }
         else if (numero >=10 && numero <=99){
                System.out.println("el numero tiene dos digitos");     
         }
         else if (numero >=100 && numero <=999){
                System.out.println("el numero tiene tres digitos");
         }
    }
}