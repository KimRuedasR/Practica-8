package practica8;

import practica8.clases.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        base base = null;

        do {
            System.out.println("\n*************************");
            System.out.println("Seleccione el medio de comunicación:");
            System.out.println("1. 5G");
            System.out.println("2. Wifi");
            System.out.println("3. Ethernet");
            System.out.println("4. Salir");
            System.out.println("*************************\n");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    base = new cincog();
                    break;
                case 2:
                    base = new wifi();
                    break;
                case 3:
                    base = new ethernet();
                    break;
                case 4:
                    System.exit(0);
            }

            if (base != null) {
                base.showMenu();
            }
        } while (true);
    }
}


