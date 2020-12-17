package pe.edu.upeu.exa3backendsebastianllata.entity;

public class Rol_acceso {

	private int idrol;
	private int Idacceso;
	
	
	
	public Rol_acceso() {
		super();
	}



	public Rol_acceso(int idrol, int idacceso) {
		super();
		this.idrol = idrol;
		Idacceso = idacceso;
	}



	public int getIdrol() {
		return idrol;
	}



	public void setIdrol(int idrol) {
		this.idrol = idrol;
	}



	public int getIdacceso() {
		return Idacceso;
	}



	public void setIdacceso(int idacceso) {
		Idacceso = idacceso;
	}
	
	
}
