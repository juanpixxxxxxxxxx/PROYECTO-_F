import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public Connection get_conConnection(){
        Connection connection = null;
        try{
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/tienda_de_motos","root","");
        }catch(SQLException e) {
            System.out.println("Error: " + e);
        }
        return connection;
    }
}
