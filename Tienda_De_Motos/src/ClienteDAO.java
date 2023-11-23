import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteDAO {

    public static void crearClienteDB(Cliente cliente) {
        Conexion db_connect = new Conexion();
        try (Connection conexion = db_connect.get_conConnection()) {
            PreparedStatement ps = null;
            try {
                String query = "INSERT INTO `tienda_de_motos`.`cliente`(`nombre_cliente`,`apellido_paterno`,`apellido_materno`) VALUES(?, ?, ?)";
                ps = conexion.prepareStatement(query);
                ps.setString(1,cliente.getNombre());
                ps.setString(2,cliente.getApellido1());
                ps.setString(3,cliente.getApellido2());
                ps.executeUpdate();
            }catch (SQLException ex){
                System.out.println(ex);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void leerCliente() {
        Conexion db_conexion = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try (Connection conexion = db_conexion.get_conConnection()){
            String query = "SELECT * FROM cliente";
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                System.out.println("ID: "+rs.getInt("id"));
                System.out.println("Nombre: "+rs.getString("nombre"));
                System.out.println("Primer apellido: "+rs.getString("apellido1"));
                System.out.println("Segundo apellido: "+rs.getString("apellido2"));
                System.out.println("- - - - - - - - - ");
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }

    public static void borrarCliente(int id) {
        Conexion db_conexion = new Conexion();
        try (Connection conexion = db_conexion.get_conConnection()){
            PreparedStatement ps = null;
            try {
                String query = "DELETE FROM cliente WHERE id = ?";
                ps = conexion.prepareStatement(query);
                ps.setInt(1,id);
                ps.executeUpdate();
                System.out.println("Datos del cliente borrados exitosamente");
            }catch (SQLException e){
                System.out.println(e);
                System.out.println("No se pudo borrar datos del cliente");
            }
        }catch (SQLException e){
            System.out.println(e);
        }

    }

    public static void actualizarCliente(Cliente cliente) {
        Conexion db_conexion = new Conexion();
        try (Connection conexion = db_conexion.get_conConnection()){
            PreparedStatement ps;
            try {
                String query = "UPDATE cliente SET nombre=?, apellido1=?, apellido2=? WHERE id=?";
                ps = conexion.prepareStatement(query);
                ps.setString(1,cliente.getNombre());
                ps.setString(2,cliente.getApellido1());
                ps.setString(3,cliente.getApellido2());
                ps.setInt(4,cliente.getId());
                ps.executeUpdate();
                System.out.println("Datos del cliente actualizados correctamente");
            }catch (SQLException e){
                System.out.println(e);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }

}

