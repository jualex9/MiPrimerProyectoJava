import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countAboveOrEqual7 = 0;
        int countBelow7 = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese la nota del alumno " + i + ": ");
            double nota = scanner.nextDouble();

            if (nota >= 7) {
                countAboveOrEqual7++;
            } else {
                countBelow7++;
            }
        }

        System.out.println("Cantidad de alumnos con notas mayores o iguales a 7: " + countAboveOrEqual7);
        System.out.println("Cantidad de alumnos con notas menores a 7: " + countBelow7);

        scanner.close();
    }
}