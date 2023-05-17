package practica8.clases;

import java.util.Scanner;

public class cincog implements base {

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu de opciones para 5G:");
            System.out.println("1. Conectar");
            System.out.println("2. Escribir");
            System.out.println("3. Leer");
            System.out.println("4. Desconectar");
            System.out.println("5. Volver al menú principal");
            System.out.print("Ingrese una opción: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Conectar();
                    break;
                case 2:
                    Escribir();
                    break;
                case 3:
                    Leer();
                    break;
                case 4:
                    Desconectar();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }

    @Override
    public void Conectar() {
        System.out.println("Conectado a 5G");
    }

    @Override
    public void Escribir() {
        System.out.println("Escribir en 5G");
    }

    @Override
    public void Leer() {
        System.out.println("Leer en 5G");
    }

    @Override
    public void Desconectar() {
        System.out.println("Desconectar de 5G");
    }
}
