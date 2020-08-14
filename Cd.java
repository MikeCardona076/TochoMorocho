package tochomorocho;

public class Cd {
	private int numero;
	private Funcionario funcionario;
	public Cd() {
	this.setNumero(0);
	}
	public int getNumero() {
	return numero;
	}
	public void setNumero(int unNumero) {
	numero = unNumero;
	}
	public Funcionario getFuncionario() {
	return funcionario;
	}
	public void setFuncionario(Funcionario unFuncionario) {
	funcionario = unFuncionario;
	}
	public String toString() {
	return "Cd Nro. " + this.getNumero();
	}
}
