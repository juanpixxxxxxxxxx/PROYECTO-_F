import java.util.Scanner;

public class ClienteService {
    public static void crearCliente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Añadiendo nuevo cliente >>>");
        System.out.print("Ingrese su nombre: "); String nombre = sc.nextLine();
        System.out.print("Ingrese su primer apellido: "); String apellido1 = sc.nextLine();
        System.out.print("ingrese su segundo apellido: "); String apellido2 = sc.nextLine();
        Cliente cliente = new Cliente();
        cliente.setNombre(nombre);
        cliente.setApellido1(apellido1);
        cliente.setApellido2(apellido2);
        ClienteDAO.crearClienteDB(cliente);
    }

    public static void listarClientes(){
        ClienteDAO.leerCliente();
    }

    public static void borrarClientes(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese ID del usuario para borrar sus datos: ");
        int id_cliente = sc.nextInt();
        ClienteDAO.borrarCliente(id_cliente);
    }

    public static void editarCliente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Editando datos del cliente >>>");
        System.out.print("Ingrese nuevo 'nombre': "); String nombre = sc.nextLine();
        System.out.print("Ingrese nuevo 'primer apellido': "); String apellido1 = sc.nextLine();
        System.out.print("Ingrese nuevo 'segundo apellido': "); String apellido2 = sc.nextLine();
        System.out.println("Ingrese el ID del cliente a modificar: "); int id_cliente = sc.nextInt();
        Cliente acliente = new Cliente();
        acliente.setNombre(nombre);
        acliente.setApellido1(apellido1);
        acliente.setApellido2(apellido2);
        acliente.setId(id_cliente);
        ClienteDAO.actualizarCliente(acliente);
    }
}
