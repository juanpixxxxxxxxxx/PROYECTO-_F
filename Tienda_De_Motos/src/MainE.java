

import java.util.Scanner;

public class MainE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("------- Menu -------");
            System.out.println("(1) Añadir nuevo empleado");
            System.out.println("(2) Mostrar datos de los empleados");
            System.out.println("(3) Editar datos de un empleado");
            System.out.println("(4) Eliminar datos de un empleado");
            System.out.println("(5) Salir");
            System.out.print("Ingrese un numero de opcion >> ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("-----------------");
                    empleadoService.crearEmpleado();
                    break;
                case 2:
                    System.out.println("-----------------");
                    empleadoService.listarEmpleados();
                    break;
                case 3:
                    System.out.println("-----------------");
                    empleadoService.editarEmpleado();
                    break;
                case 4:
                    System.out.println("-----------------");
                    empleadoService.borrarEmpleados();
                    break;
                case 5:
                    System.out.println("-----------------");
                    System.out.println("");
                    break;
                default:
                    System.out.println("-----------------");
                    System.out.println("Numero de opcion invalida");
            }
        } while (option != 5);
    }
}

