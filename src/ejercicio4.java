import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese su sueldo");
        double sueldo = sc.nextDouble();
        sc.close();
        if (sueldo > 3000){
            System.out.println("debe abonar impuestos");
        }
    }
    
}