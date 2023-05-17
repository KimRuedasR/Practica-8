package practica8.clases;

import java.util.Scanner;

public class ethernet implements base {

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n*************************");
            System.out.println("Menu de opciones para Ethernet:");
            System.out.println("1. Conectar");
            System.out.println("2. Escribir");
            System.out.println("3. Leer");
            System.out.println("4. Desconectar");
            System.out.println("*************************\n");
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
        System.out.println("\n------------------------");
        System.out.println("--Conectado a Ethernet--");
        System.out.println("------------------------");
    }

    @Override
    public void Escribir() {
        System.out.println("\n------------------------");
        System.out.println("--Escribir en Ethernet--");
        System.out.println("------------------------");
    }

    @Override
    public void Leer() {
        System.out.println("\n------------------------");
        System.out.println("----Leer en Ethernet----");
        System.out.println("------------------------");
    }

    @Override
    public void Desconectar() {
        System.out.println("\n----------------------------");
        System.out.println("--Desconectado de Ethernet--");
        System.out.println("----------------------------");
    }
}
