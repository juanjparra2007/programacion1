package WORK;
import java.util.Scanner;


// Ejercicio 2: Punto de ebullición//

public class CuatroPuntoUnoB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la temperatura: ");
        int temp = scanner.nextInt();

        if (temp >= 100) {
            System.out.println("Esta por encima del punto de ebullición del agua.");
        }
        else {
            System.out.println("Esta por debajo del punto de ebullición del agua.");
        }

    }
}