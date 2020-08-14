package tochomorocho;

public class Usuario {
	
	private String nombre;
	public Usuario() {
	this.setNombre( "Sin nombre");
	}
	public java.lang.String getNombre() {
	return nombre;
	}
	public void setNombre(String unNombre) {
	nombre = unNombre;
	}
	public String toString() {
	return this.getNombre();
	}
	
}
