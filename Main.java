package Pilas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        operacionesDePila();
    }

    //Historial de un motor de busqueda
    public static void operacionesDePila() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la capacidad de busquedas: ");
        int capacidad = scanner.nextInt();
        scanner.nextLine();
        Pila pila = new Pila(capacidad);

        int opcion;
        do {
            System.out.println("\nOperaciones:");
            System.out.println("1. Ingresar Busqueda");
            System.out.println("2. Eliminar Busqueda");
            System.out.println("3. Ver cima (peek)");
            System.out.println("4. Ver Historial");
            System.out.println("5. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese Su Busqueda: ");
                    String elemento = scanner.next();
                    pila.push(elemento);
                    break;
                case 2:
                    pila.pop();
                    break;
                case 3:
                    pila.peek();
                    break;
                case 4:
                    pila.mostrarPila();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);

        scanner.close();

    }
}
