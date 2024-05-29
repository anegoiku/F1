package Model;


public class Carreras {
private int id;
private String pista;
private String ganador;
private String fecha;
private String equipo;

public Carreras() {
	super();
}

public Carreras(int id, String pista, String ganador, String fecha, String equipo) {
	super();
	this.id = id;
	this.pista = pista;
	this.ganador = ganador;
	this.fecha = fecha;
	this.equipo = equipo;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getPista() {
	return pista;
}

public void setPista(String pista) {
	this.pista = pista;
}

public String getGanador() {
	return ganador;
}

public void setGanador(String ganador) {
	this.ganador = ganador;
}

public String getFecha() {
	return fecha;
}

public void setFecha(String fecha) {
	this.fecha = fecha;
}

public String getEquipo() {
	return equipo;
}

public void setEquipo(String equipo) {
	this.equipo = equipo;
}

@Override
public String toString() {
	return "carreras [id=" + id + ", pista=" + pista + ", ganador=" + ganador + ", fecha=" + fecha + ", equipo="
			+ equipo + "]";
}

}
