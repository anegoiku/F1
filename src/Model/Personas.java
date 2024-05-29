package Model;

public abstract class Personas {
	private int id;
	private String nombre;
	private String apellido;
	private String dni;
	private String mail;
	private String contrasena;
	
	public Personas(int id, String nombre, String apellido, String dni, String mail, String contrasena) {
		// TODO Auto-generated constructor stub
	}
	
	public Personas(int id, String nombre, String apellido, String dni, String rol, String mail, String contrasena) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.mail = mail;
		this.contrasena = contrasena;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	@Override
	public String toString() {
		return "personas [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", mail=" + mail + ", contrasena=" + contrasena + "]";
	}

	public String toString(int id, String nombre, String apellido, String dni, String mail, String contrasena) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
