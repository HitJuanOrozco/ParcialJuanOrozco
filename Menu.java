import java.util.Scanner;
import java.util.Stack;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();

        Stack<ObjComputador> pilaComputadores = new Stack<>();
        Stack<ObjTablet> pilaTablets = new Stack<>();
        
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Gestionar computadores");
            System.out.println("2. Gestionar tablets");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción:");
            int tipo = sc.nextInt();

            switch (tipo) {
                case 1:
                    menuComputador(m, pilaComputadores, sc);
                    break;
                case 2:
                    menuTablet(m, pilaTablets, sc);
                    break;
                case 3:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                System.out.println("Opción no válida, intente de nuevo.");
            }

        }
    }

    public static void menuComputador(Metodos m, Stack<ObjComputador> pila, Scanner sc) {
        System.out.println("\n--- Computador ---");
        System.out.println("1. Ingresar");
        System.out.println("2. Mostrar");
        System.out.println("3. Devolver");
        System.out.println("4. Modificar");
        System.out.print("Seleccione una opción: ");
        int op = sc.nextInt();
        sc.nextLine();

        switch (op) {
            case 1:
                m.ingresarComputador(pila);
                break;
            case 2:
                m.mostrarComputador(pila);
                break;
            case 3:
                m.devolverComputador(pila, sc);
                break;
            case 4:
                m.modificarComputador(pila, sc);
                break;
            default:
            System.out.println("Opción no válida, intente de nuevo.");
        }
    }

    public static void menuTablet(Metodos m, Stack<ObjTablet> pila, Scanner sc) {
        System.out.println("\n--- Tablet ---");
        System.out.println("1. Ingresar");
        System.out.println("2. Mostrar");
        System.out.println("3. Devolver");
        System.out.println("4. Modificar");
        System.out.print("Seleccione una opción: ");
        int op = sc.nextInt();
        sc.nextLine();

        switch (op) {
            case 1:
                m.ingresarTablet(pila);
                break;
            case 2:
                m.mostrarTablet(pila);
                break;
            case 3:
                m.devolverTablet(pila, sc);
                break;
            case 4:
                m.modificarTablet(pila, sc);
                break;
            default:
            System.out.println("Opción no válida, intente de nuevo.");
        }
    }

}
