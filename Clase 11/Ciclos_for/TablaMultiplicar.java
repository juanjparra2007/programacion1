

public class TablaMultiplicar {
    public static void main(String[] args) {
        for (int a = 1; a <= 15; a++) {
            System.out.print(a + "*|");
            
            for (int b = 1; b <= 15; b++) {
                System.out.print((a * b) + "|");
            }
            
            System.out.println(); // Salto de línea al final de cada fila
        }
    }
}

