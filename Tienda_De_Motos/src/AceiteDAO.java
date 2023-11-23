import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AceiteDAO {

    public static void crearAceiteDB(Aceite aceite) {
        Conexion db_connect = new Conexion();
        try (Connection conexion = db_connect.get_conConnection()) {
            PreparedStatement ps = null;
            try {
                String query = "INSERT INTO `aceite`(`tipo_aceite`,`viscosidad_aceite`,`costo_aceite`) VALUES(?, ?, ?)";
                ps = conexion.prepareStatement(query);
                ps.setString(1, aceite.getTipoAceite());
                ps.setString(2, aceite.getViscosidadAceite());
                ps.setDouble(3, aceite.getCostoAceite());
                ps.executeUpdate();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void leerAceite() {
        Conexion db_conexion = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try (Connection conexion = db_conexion.get_conConnection()) {
            String query = "SELECT * FROM aceite";
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id_aceite"));
                System.out.println("Tipo de aceite: " + rs.getString("tipo_aceite"));
                System.out.println("Viscosidad del aceite: " + rs.getString("viscosidad_aceite"));
                System.out.println("Costo del aceite: " + rs.getDouble("costo_aceite"));
                System.out.println("- - - - - - - - - ");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void borrarAceite(int id) {
        Conexion db_conexion = new Conexion();
        try (Connection conexion = db_conexion.get_conConnection()) {
            PreparedStatement ps = null;
            try {
                String query = "DELETE FROM aceite WHERE id_aceite = ?";
                ps = conexion.prepareStatement(query);
                ps.setInt(1, id);
                ps.executeUpdate();
                System.out.println("Datos del aceite borrados exitosamente");
            } catch (SQLException e) {
                System.out.println(e);
                System.out.println("No se pudo borrar datos del aceite");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void actualizarAceite(Aceite aceite) {
        Conexion db_conexion = new Conexion();
        try (Connection conexion = db_conexion.get_conConnection()) {
            PreparedStatement ps;
            try {
                String query = "UPDATE aceite SET tipo_aceite=?, viscosidad_aceite=?, costo_aceite=? WHERE id_aceite=?";
                ps = conexion.prepareStatement(query);
                ps.setString(1, aceite.getTipoAceite());
                ps.setString(2, aceite.getViscosidadAceite());
                ps.setDouble(3, aceite.getCostoAceite());
                ps.setInt(4, aceite.getIdAceite());
                ps.executeUpdate();
                System.out.println("Datos del aceite actualizados correctamente");
            } catch (SQLException e) {
                System.out.println(e);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

}

