package Setores;

public abstract class Setor {
	
	private int id;
	private String cargaHoraria;
	
	public Setor(int id, String cargaHoraria) {
		super();
		this.id = id;
		this.cargaHoraria = cargaHoraria;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		return "Setor [id=" + id + ", cargaHoraria=" + cargaHoraria + "]";
	}
	
	
	
}
