import java.util.Scanner;

public class empleadoService {

    public static void crearEmpleado() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Añadiendo nuevo empleado >>>");
        System.out.print("Ingrese su nombre: "); String nombre = sc.nextLine();
        System.out.print("Ingrese su primer apellido: "); String apellido1 = sc.nextLine();
        System.out.print("Ingrese su segundo apellido: "); String apellido2 = sc.nextLine();
        Empleado empleado = new Empleado();
        empleado.setNombreEmpleado(nombre);
        empleado.setApellidoPaternoEmpleado(apellido1);
        empleado.setApellidoMaternoEmpleado(apellido2);
        empleadoDAO.crearEmpleadoDB(empleado);
    }

    public static void listarEmpleados() {
        empleadoDAO.leerEmpleado();
    }

    public static void borrarEmpleados() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese ID del empleado para borrar sus datos: ");
        int id_empleado = sc.nextInt();
        empleadoDAO.borrarEmpleado(id_empleado);
    }

    public static void editarEmpleado() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Editando datos del empleado >>>");
        System.out.print("Ingrese nuevo 'nombre': "); String nombre = sc.nextLine();
        System.out.print("Ingrese nuevo 'primer apellido': "); String apellido1 = sc.nextLine();
        System.out.print("Ingrese nuevo 'segundo apellido': "); String apellido2 = sc.nextLine();
        System.out.println("Ingrese el ID del empleado a modificar: "); int id_empleado = sc.nextInt();
        Empleado aempleado = new Empleado();
        aempleado.setNombreEmpleado(nombre);
        aempleado.setApellidoPaternoEmpleado(apellido1);
        aempleado.setApellidoMaternoEmpleado(apellido2);
        aempleado.setIdEmpleado(id_empleado);
        empleadoDAO.actualizarEmpleado(aempleado);
    }
}
