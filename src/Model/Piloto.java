package Model;

public class Piloto extends Personas {
	private String equipo;

	public Piloto(int id, String nombre, String apellido, String dni, String mail, String contrasena, String equipo) {
		super(id, nombre, apellido, dni, mail, contrasena, equipo);
		this.equipo = equipo;
	}

	public Piloto(int id, String nombre, String apellido, String dni, String mail, String contrasena) {
		super(id, nombre, apellido, dni, mail, contrasena);
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	@Override
	public String toString(int id, String nombre, String apellido, String dni, String mail, String contrasena) {
		return "piloto [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", mail=" + mail
				+ ", contrasena=" + contrasena + ", equipo=" + equipo + "]";
	}

}
