package tochomorocho;
import java.util.*;

public class Cliente extends Usuario{
	private int ruc;
	private ArrayList<Cd> listaCds;
	public Cliente() {
	this.setRuc(0);
	listaCds = new ArrayList<Cd>();
	}
	public ArrayList<Cd> getListaCds() {
	return listaCds;
	}
	public int getRuc() {
	return ruc;
	}
	public void setRuc(int unRuc) {
	ruc = unRuc;
	}
	public void agregarCd(Cd unCd) {
	this.getListaCds().add(unCd);
	}
	public void eliminarCd(Cd unCd) {
	this.getListaCds().remove(unCd);
	}

}
