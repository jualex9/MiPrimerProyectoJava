import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar la cantidad total de preguntas
        System.out.print("Ingrese la cantidad total de preguntas: ");
        int totalPreguntas = scanner.nextInt();

        // Ingresar la cantidad de preguntas correctas
        System.out.print("Ingrese la cantidad de preguntas contestadas correctamente: ");
        int correctas = scanner.nextInt();

        // Calcular el porcentaje de respuestas correctas
        double porcentaje = ((double) correctas / totalPreguntas) * 100;

        // Determinar el nivel del postulante
        if (porcentaje >= 90) {
            System.out.println("Nivel máximo");
        } else if (porcentaje >= 75) {
            System.out.println("Nivel medio");
        } else if (porcentaje >= 50) {
            System.out.println("Nivel regular");
        } else {
            System.out.println("Fuera de nivel");
        }

    }
}