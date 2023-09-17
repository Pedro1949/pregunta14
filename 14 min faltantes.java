import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese dia (numero): ");
        int diaSemana = scanner.nextInt();
        System.out.print("Introduce la hora y los minutos: ");
        int horas = scanner.nextInt();
        int minutos = scanner.nextInt();

        int minutosTotales = horas * 60 + minutos;
        int minutosFaltantes = 0;

        switch (diaSemana) {
            case 1:
                minutosFaltantes = (4 * 60) - minutosTotales;
                break;
            case 2:
                minutosFaltantes = (3 * 60 + 60) - minutosTotales;
                break;
            case 3:
                minutosFaltantes = (2 * 60 + 60) - minutosTotales;
                break;
            case 4:
                minutosFaltantes = (1 * 60 + 60) - minutosTotales;
                break;
            case 5:
                minutosFaltantes = (60) - minutosTotales;
                break;
        }

        System.out.println("Numero de minutos faltantes: " + minutosFaltantes );

        scanner.close();
    }
}
