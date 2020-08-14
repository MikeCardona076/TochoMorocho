package tochomorocho;

public class Funcionario extends Usuario{
	
	private int nroFuncionario;
	public Funcionario() {
	this.setNroFuncionario(0);
	}
	public int getNroFuncionario() {
	return nroFuncionario;
	}
	public void setNroFuncionario(int unNroFuncionario) {
	nroFuncionario = unNroFuncionario;
	}
}
