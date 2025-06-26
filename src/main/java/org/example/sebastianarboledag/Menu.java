package org.example.sebastianarboledag;

import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        while (true) {
            System.out.println("----Menu Principal----");
            System.out.println("1.Registrar empleado");
            System.out.println("2.Registrar plato");
            System.out.println("3.Ver empleados");
            System.out.println("4.Ver platos");
            System.out.println("5.Salir");
            System.out.print("Seleccione una opción: ");

            option = scanner.nextInt();

            System.out.println();
            break;
        }
        if (option == 1) {
            System.out.println("Has seleccionado: Registrar empleado");
        } else if (option == 2) {
            System.out.println("Has seleccionado: Registrar plato");
        } else if (option == 3) {
            System.out.println("Has seleccionado: Ver Empleados");
        } else if (option == 4) {
            System.out.println("Has seleccionado: Ver Platos");
        } else if (option == 5) {
            System.out.println("Gracias por Utilizar nuestra APP...");
        } else {
            System.out.println("Opcion no válida. Por favor ingrese el numero correcto.");
            }
        }
    }
}