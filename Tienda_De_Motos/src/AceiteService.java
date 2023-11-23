import java.util.Scanner;

public class AceiteService {

    public static void crearAceite() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Añadiendo nuevo aceite >>>");
        System.out.print("Ingrese el tipo de aceite: "); String tipoAceite = sc.nextLine();
        System.out.print("Ingrese la viscosidad del aceite: "); String viscosidadAceite = sc.nextLine();
        System.out.print("Ingrese el costo del aceite: "); double costoAceite = sc.nextDouble();
        Aceite aceite = new Aceite();
        aceite.setTipoAceite(tipoAceite);
        aceite.setViscosidadAceite(viscosidadAceite);
        aceite.setCostoAceite(costoAceite);
        AceiteDAO.crearAceiteDB(aceite);
    }

    public static void listarAceites() {
        AceiteDAO.leerAceite();
    }

    public static void borrarAceites() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese ID del aceite para borrar sus datos: ");
        int idAceite = sc.nextInt();
        AceiteDAO.borrarAceite(idAceite);
    }

    public static void editarAceite() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Editando datos del aceite >>>");
        System.out.print("Ingrese el nuevo tipo de aceite: "); String tipoAceite = sc.nextLine();
        System.out.print("Ingrese la nueva viscosidad del aceite: "); String viscosidadAceite = sc.nextLine();
        System.out.print("Ingrese el nuevo costo del aceite: "); double costoAceite = sc.nextDouble();
        System.out.println("Ingrese el ID del aceite a modificar: "); int idAceite = sc.nextInt();
        Aceite aAceite = new Aceite();
        aAceite.setTipoAceite(tipoAceite);
        aAceite.setViscosidadAceite(viscosidadAceite);
        aAceite.setCostoAceite(costoAceite);
        aAceite.setIdAceite(idAceite);
        AceiteDAO.actualizarAceite(aAceite);
    }
}

