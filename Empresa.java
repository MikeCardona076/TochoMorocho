package tochomorocho;

import java.util.ArrayList;
import java.util.Collections;

public class Empresa {
	private ArrayList<Cliente> conjClientes;
	private ArrayList<Cd> conjCds;
	private ArrayList<Venta> conjVentas;
	private ArrayList<Funcionario> conjFuncionarios;
	private String nombre;
	
	public Empresa() {
	this.setNombre("sin nombre");
	conjClientes = new ArrayList<Cliente>();
	conjCds = new ArrayList<Cd>();
	conjVentas = new ArrayList<Venta>();
	conjFuncionarios = new ArrayList<Funcionario>();
	}
	public String getNombre() {
	return nombre;
	}
	
	public void setNombre(String unNombre) {
		nombre = unNombre;
		}
		public void agregarCliente(Cliente unCliente) {
		this.getConjClientes().add(unCliente);
		}
		public ArrayList<Cliente> getConjClientes() {
		return conjClientes;
		}
		public void agregarCd(Cd unCd) {
		this.getConjCds().add(unCd);
		}
		public ArrayList<Cd> getConjCds() {
		return conjCds;
		}
		public void agregarVenta(Venta unaVenta) {
		this.getConjVentas().add(unaVenta);
		unaVenta.getCliente().agregarCd(unaVenta.getCd());
		}
		// C) Lista de Cds de un cliente
		public ArrayList<Cd> listaCdsCliente(Cliente unCliente) {
		return unCliente.getListaCds();
		}
		// D) Devolucion de venta
		public void anularVenta(Venta unaVenta) {
		unaVenta.getCliente().eliminarCd(unaVenta.getCd());
		this.getConjVentas().remove(unaVenta);
		}
		// E) Listado de ventas
		public ArrayList<Venta> getConjVentas() {
		return conjVentas;
		}
		public void agregarFuncionario(Funcionario unFuncionario) {
		this.getConjFuncionarios().add(unFuncionario);
		}
		// F) Lista de Funcionarios
		public ArrayList<Funcionario> getConjFuncionarios() {
		return conjFuncionarios;
		}
		// G) Listado ordenado por día
		public ArrayList<Venta> ventasOrdenadasPorDia() {
		Collections.sort(this.conjVentas, new CriterioVentaPorDia());
		return this.getConjVentas();
		}

}
