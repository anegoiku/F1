package Model.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class equiposConect {
public static Connection conexion() {
		
		String URI = "jdbc:mysql://localhost:3306/f1";
		String usuario = "root";
		String contrasena = "";
		Connection con =null;
		
		try {
			con = DriverManager.getConnection(URI, usuario, contrasena);
		}catch (SQLException e) {
			System.err.println("Error al conectarse a la base de datos");
		}
		
		return con;
	}
}
