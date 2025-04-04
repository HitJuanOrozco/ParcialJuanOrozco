import java.util.Scanner;
import java.util.Stack;

public class Metodos {
    Scanner sc = new Scanner(System.in);

    // Metodos Computador

    public void ingresarComputador(Stack<ObjComputador> pilaComputadores) {
        System.out.println("--- Ingresar computador ---");
        System.out.println("Serial: ");
        String serial = sc.nextLine();

        for (ObjComputador pc : pilaComputadores) {
            if (pc.getSerial().equalsIgnoreCase(serial)) {
                System.out.println("El serial ya existe.");
                return;
            }
        }

        System.out.println("Marca: ");
        String marca = sc.nextLine();
        System.out.println("Memoria RAM: ");
        String memoriaRam = sc.nextLine();
        System.out.println("Disco Duro: ");
        String discoDuro = sc.nextLine();
        System.out.println("Precio: ");
        double precio = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nombre del usuario asignado: ");
        String nombreUsuarioAsignado = sc.nextLine();

        System.out.println("¿Está disponible? (1. Sí / 2. No): ");
        int disponibleOpt = sc.nextInt();
        boolean disponible = (disponibleOpt == 1);
        sc.nextLine();

        ObjComputador nuevo = new ObjComputador(serial, marca, memoriaRam, discoDuro, precio, nombreUsuarioAsignado, disponible);
        pilaComputadores.push(nuevo);

        System.out.println("Computador registrado correctamente.");
    }

    public void mostrarComputador(Stack<ObjComputador> pilaComputadores) {
        System.out.println("--- Inventario de Computadores ---");
    
        if (pilaComputadores.isEmpty()) {
            System.out.println("No hay computadores registrados.");
            return;
        }
    
        for (ObjComputador pc : pilaComputadores) {
            System.out.println("Serial: " + pc.getSerial());
            System.out.println("Marca: " + pc.getMarca());
            System.out.println("Memoria RAM: " + pc.getMemoriaRam());
            System.out.println("Disco Duro: " + pc.getDiscoDuro());
            System.out.println("Precio: $" + pc.getPrecio());
            System.out.println("Usuario asignado: " + pc.getNombreUsuarioAsignado());
            System.out.println("¿Disponible?: " + (pc.isDisponible() ? "Sí" : "No"));
            System.out.println("-----------------------------");
        }
    }
    
    public void devolverComputador(Stack<ObjComputador> pilaComputadores, Scanner sc) {
        System.out.println("--- Devolver computador ---");
        System.out.print("Ingrese el serial del computador a devolver: ");
        String serial = sc.nextLine();
        boolean encontrado = false;

        for (ObjComputador pc : pilaComputadores) {
            if (pc.getSerial().equalsIgnoreCase(serial)) {
                if (pc.isDisponible()) {
                    System.out.println("El computador ya está disponible.");
                } else {
                    pc.setDisponible(true);
                    System.out.println("Computador marcado como disponible.");
                }
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró ningún computador con ese serial.");
        }
    }

    
    public void modificarComputador(Stack<ObjComputador> pilaComputadores, Scanner sc) {
        System.out.println("--- Modificar computador ---");
        System.out.print("Ingrese el serial del computador a modificar: ");
        String serial = sc.nextLine();
        boolean encontrado = false;
    
        for (ObjComputador pc : pilaComputadores) {
            if (pc.getSerial().equalsIgnoreCase(serial)) {
                System.out.print("Nuevo precio: ");
                double nuevoPrecio = sc.nextDouble();
                sc.nextLine();
    
                System.out.print("Nuevo nombre de usuario asignado: ");
                String nuevoUsuario = sc.nextLine();
    
                pc.setPrecio(nuevoPrecio);
                pc.setNombreUsuarioAsignado(nuevoUsuario);
    
                System.out.println("Datos actualizados correctamente.");
                encontrado = true;
                break;
            }
        }
    
        if (!encontrado) {
            System.out.println("No se encontró ningún computador con ese serial.");
        }
    }


    // Metodos Tablet

    public void ingresarTablet(Stack<ObjTablet> pilaTablets) {
        System.out.println("--- Ingresar Tablet ---");
        System.out.print("Serial: ");
        String serial = sc.nextLine();
    
        for (ObjTablet tablet : pilaTablets) {
            if (tablet.getSerial().equalsIgnoreCase(serial)) {
                System.out.println("El serial ya existe.");
                return;
            }
        }
    
            System.out.print("Marca: ");
            String marca = sc.nextLine();
            System.out.print("Tamaño: ");
            String tamaño = sc.nextLine();
            System.out.print("Precio: ");
            double precio = sc.nextDouble();
            sc.nextLine();
            System.out.print("Nombre del usuario asignado: ");
            String nombreUsuarioAsignado = sc.nextLine();
    
            System.out.print("¿Está disponible? (1. Sí / 2. No): ");
            int disponibleOpt = sc.nextInt();
            boolean disponible = (disponibleOpt == 1);
            sc.nextLine();
    
        ObjTablet nueva = new ObjTablet(serial, tamaño, marca, precio, nombreUsuarioAsignado, disponible);
        pilaTablets.push(nueva);
    
        System.out.println("Tablet registrada correctamente.");
    }

    public void mostrarTablet(Stack<ObjTablet> pilaTablets) {
        System.out.println("--- Inventario de Computadores ---");
    
        if (pilaTablets.isEmpty()) {
            System.out.println("No hay computadores registrados.");
            return;
        }
    
        for (ObjTablet pc : pilaTablets) {
            System.out.println("Serial: " + pc.getSerial());
            System.out.println("Tamaño: " + pc.getTamaño());
            System.out.println("Marca: " + pc.getMarca());
            System.out.println("Precio: $" + pc.getPrecio());
            System.out.println("Usuario asignado: " + pc.getNombreUsuarioAsignado());
            System.out.println("¿Disponible?: " + (pc.isDisponible() ? "Sí" : "No"));
            System.out.println("-----------------------------");
        }
    }
    
    public void devolverTablet(Stack<ObjTablet> pilaTablets, Scanner sc) {
        System.out.println("--- Devolver tablet ---");
        System.out.print("Ingrese el serial de la tablet a devolver: ");
        String serial = sc.nextLine();
        boolean encontrado = false;

        for (ObjTablet pc : pilaTablets) {
            if (pc.getSerial().equalsIgnoreCase(serial)) {
                if (pc.isDisponible()) {
                    System.out.println("La tablet ya está disponible.");
                } else {
                    pc.setDisponible(true);
                    System.out.println("Tablet marcada como disponible.");
                }
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró ninguna tablet con ese serial.");
        }
    }

    
    public void modificarTablet(Stack<ObjTablet> pilaTablets, Scanner sc) {
        System.out.println("--- Modificar tablet ---");
        System.out.print("Ingrese el serial de la tablet a modificar: ");
        String serial = sc.nextLine();
        boolean encontrado = false;
    
        for (ObjTablet pc : pilaTablets) {
            if (pc.getSerial().equalsIgnoreCase(serial)) {
                System.out.print("Nuevo precio: ");
                double nuevoPrecio = sc.nextDouble();
                sc.nextLine();
    
                System.out.print("Nuevo nombre de usuario asignado: ");
                String nuevoUsuario = sc.nextLine();
    
                pc.setPrecio(nuevoPrecio);
                pc.setNombreUsuarioAsignado(nuevoUsuario);
    
                System.out.println("Datos actualizados correctamente.");
                encontrado = true;
                break;
            }
        }
    
        if (!encontrado) {
            System.out.println("No se encontró ninguna tablet con ese serial.");
        }
    }


}
