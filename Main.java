import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        Scanner scanner = new Scanner(System.in);
        int option;
        int value;

        do {
            System.out.println("\n--- Menú Lista Doblemente Enlazada Circular ---");
            System.out.println("1. Insertar un nuevo nodo al final");
            System.out.println("2. Avanzar al siguiente nodo");
            System.out.println("3. Retroceder al nodo anterior");
            System.out.println("4. Imprimir el valor del nodo actual");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Ingrese el valor a insertar: ");
                    value = scanner.nextInt();
                    list.insert(value);
                    System.out.println("Valor insertado correctamente.");
                    break;
                case 2:
                    list.next();
                    list.printCurrent();
                    break;
                case 3:
                    list.previous();
                    list.printCurrent();
                    break;
                case 4:
                    list.printCurrent();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (option != 5);

        scanner.close();
    }
}