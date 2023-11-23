import java.util.Scanner;

public class MainA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("------- Menu -------");
            System.out.println("(1) Añadir nuevo aceite");
            System.out.println("(2) Mostrar datos de los aceites");
            System.out.println("(3) Editar datos de un aceite");
            System.out.println("(4) Eliminar datos de un aceite");
            System.out.println("(5) Salir");
            System.out.print("Ingrese un numero de opcion >> ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("-----------------");
                    AceiteService.crearAceite();
                    break;
                case 2:
                    System.out.println("-----------------");
                    AceiteService.listarAceites();
                    break;
                case 3:
                    System.out.println("-----------------");
                    AceiteService.editarAceite();
                    break;
                case 4:
                    System.out.println("-----------------");
                    AceiteService.borrarAceites();
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
