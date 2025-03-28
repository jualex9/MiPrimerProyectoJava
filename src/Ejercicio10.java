import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el sueldo del operario: ");
        double sueldo = scanner.nextDouble();
        System.out.print("Ingrese los años de antigüedad del operario: ");
        int antiguedad = scanner.nextInt();
        int caso;

        if (sueldo < 500 && antiguedad >= 10) {
            caso = 1;
        } else if (sueldo < 500 && antiguedad < 10) {
            caso = 2;
        } else {
            caso = 3;
        }

        switch (caso) {
            case 1:
                sueldo += sueldo * 0.20; // Aumento del 20%
                System.out.println("Sueldo con aumento del 20%: " + sueldo);
                break;
            case 2:
                sueldo += sueldo * 0.05; // Aumento del 5%
                System.out.println("Sueldo con aumento del 5%: " + sueldo);
                break;
            case 3:
                System.out.println("Sueldo sin cambios: " + sueldo);
                break;
            default:
                System.out.println("Error en los datos ingresados.");
        }

        scanner.close();
    }
}