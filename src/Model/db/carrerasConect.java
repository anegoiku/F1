package Model.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Model.Carreras;



public class carrerasConect {
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

public static ArrayList<Carreras> verCarreras() {
	
	ArrayList<Carreras> carreras = new ArrayList<Carreras>();
	Connection con = conexion();
	Carreras carrera = null;
	try {
		Statement st = con.createStatement();
		String sql = "SELECT * FROM carreras";
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			int id = rs.getInt("id_pista");
			String pista = rs.getString("pista");
			String ganador = rs.getString("ganador");
			String fecha = rs.getString("fecha");
			String equipo = rs.getString("equipo");
			carrera = new Carreras(id, pista, ganador, fecha, equipo);
			carreras.add(carrera);
		}

	}catch (SQLException e) {
		System.err.println("Error en el Statement de verEquipos(). No se ha podido conseguir el ejecutable del sql");
	}
	
	return carreras;
	}


}
