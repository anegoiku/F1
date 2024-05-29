package Model;

public class equipos {
private int id;
private String nombre;

public equipos() {
	super();
}

public equipos(int id, String nombre) {
	super();
	this.id = id;
	this.nombre = nombre;
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

@Override
public String toString() {
	return "equipos [id=" + id + ", nombre=" + nombre + "]";
}

}
