package Ciclos_while;

import java.util.Scanner;

public class CalificacionesWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de estudiantes: ");
        int N = scanner.nextInt();

        int i = 1;
        int aprobados = 0;

        while (i <= N) {
            System.out.print("Ingrese la calificación del estudiante " + i + " (0-10): ");
            double calificacion = scanner.nextDouble();

            if (calificacion >= 0 && calificacion <= 10) {
                if (calificacion >= 5) {
                    System.out.println("✅ El estudiante aprueba");
                    aprobados++;
                } else {
                    System.out.println("❌ El estudiante reprueba");
                }
                i++; // Solo se incrementa si la nota es válida
            } else {
                System.out.println("⚠ Calificación inválida. Debe estar entre 0 y 10.");
            }
        }

        System.out.println("Número total de aprobados: " + aprobados);
        scanner.close();
        }
}
