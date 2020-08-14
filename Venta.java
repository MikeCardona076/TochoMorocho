package tochomorocho;

public class Venta {
	private Cliente cliente;
	private int dia;
	private Cd cd;
	public Venta(Cliente unCliente, int unDia, Cd unCd) {
	this.setCliente(unCliente);
	this.setDia(unDia);
	this.setCd(unCd);
	}
	public Cliente getCliente() {
	return cliente;
	}
	
	public void setCliente(Cliente unCliente) {
		cliente = unCliente;
		}
		public int getDia() {
		return this.dia;
		}
		public void setDia(int unDia) {
		dia = unDia;
		}
		public Cd getCd() {
		return cd;
		}
		public void setCd(Cd unCd) {
		cd = unCd;
		}
		public String toString() {
		return "Venta " + this.getCd().toString() + " de cliente "
		+ this.getCliente();
		}

}
