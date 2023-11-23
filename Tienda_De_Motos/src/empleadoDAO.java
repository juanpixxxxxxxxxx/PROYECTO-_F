import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class empleadoDAO {

    public static void crearEmpleadoDB(Empleado empleado) {
        Conexion db_connect = new Conexion();
        try (Connection conexion = db_connect.get_conConnection()) {
            PreparedStatement ps = null;
            try {
                String query = "INSERT INTO `empleado`(`nombre_empleado`,`apellido_paterno_empleado`,`apellido_materno_empleado`) VALUES(?, ?, ?)";
                ps = conexion.prepareStatement(query);
                ps.setString(1, empleado.getNombreEmpleado());
                ps.setString(2, empleado.getApellidoPaternoEmpleado());
                ps.setString(3, empleado.getApellidoMaternoEmpleado());
                ps.executeUpdate();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void leerEmpleado() {
        Conexion db_conexion = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try (Connection conexion = db_conexion.get_conConnection()) {
            String query = "SELECT * FROM empleado";
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id_empleado"));
                System.out.println("Nombre: " + rs.getString("nombre_empleado"));
                System.out.println("Primer apellido: " + rs.getString("apellido_paterno_empleado"));
                System.out.println("Segundo apellido: " + rs.getString("apellido_materno_empleado"));
                System.out.println("- - - - - - - - - ");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void borrarEmpleado(int id) {
        Conexion db_conexion = new Conexion();
        try (Connection conexion = db_conexion.get_conConnection()) {
            PreparedStatement ps = null;
            try {
                String query = "DELETE FROM empleado WHERE id_empleado = ?";
                ps = conexion.prepareStatement(query);
                ps.setInt(1, id);
                ps.executeUpdate();
                System.out.println("Datos del empleado borrados exitosamente");
            } catch (SQLException e) {
                System.out.println(e);
                System.out.println("No se pudo borrar datos del empleado");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void actualizarEmpleado(Empleado empleado) {
        Conexion db_conexion = new Conexion();
        try (Connection conexion = db_conexion.get_conConnection()) {
            PreparedStatement ps;
            try {
                String query = "UPDATE empleado SET nombre_empleado=?, apellido_paterno_empleado=?, apellido_materno_empleado=? WHERE id_empleado=?";
                ps = conexion.prepareStatement(query);
                ps.setString(1, empleado.getNombreEmpleado());
                ps.setString(2, empleado.getApellidoPaternoEmpleado());
                ps.setString(3, empleado.getApellidoMaternoEmpleado());
                ps.setInt(4, empleado.getIdEmpleado());
                ps.executeUpdate();
                System.out.println("Datos del empleado actualizados correctamente");
            } catch (SQLException e) {
                System.out.println(e);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

}


