import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de empleados: ");
        int n = scanner.nextInt();

        int count100to300 = 0;
        int countAbove300 = 0;
        double totalSalaries = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese el sueldo del empleado " + i + ": ");
            double salary = scanner.nextDouble();

            if (salary >= 100 && salary <= 300) {
                count100to300++;
            } else if (salary > 300) {
                countAbove300++;
            }

            totalSalaries += salary;
        }

        System.out.println("Cantidad de empleados que cobran entre $100 y $300: " + count100to300);
        System.out.println("Cantidad de empleados que cobran más de $300: " + countAbove300);
        System.out.println("El importe total que gasta la empresa en sueldos: $" + totalSalaries);

        scanner.close();
    }
}