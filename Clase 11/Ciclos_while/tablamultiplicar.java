package Ciclos_while;

public class tablamultiplicar {
    public static void main(String[] args) {
        int i = 1;

        while(i <=15 ) {
            System.out.print(i + "*|");

            int j = 1;
            while(j <= 15) {
                System.out.print((i*j) + "|"); j++;
            }
            System.out.println(); i++; // Salto de línea al final de cada fila a++;
        }
    }
}
