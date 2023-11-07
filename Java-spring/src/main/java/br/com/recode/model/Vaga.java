package br.com.recode.model;

public class Vaga {

	private int idVaga;
	private String codVaga;
	private String nomeVaga;
	private String descVaga;
	private Empresa empresa;
	
	//caso precise, aqui vai um constructor vazio
		public Vaga () {
			super();
		}
	
	public Vaga(int idVaga, String codVaga, String nomeVaga, String descVaga, Empresa empresa) {
		super();
		this.idVaga = idVaga;
		this.codVaga = codVaga;
		this.nomeVaga = nomeVaga;
		this.descVaga = descVaga;
		this.empresa = empresa;
	}

	public int getIdVaga() {
		return idVaga;
	}

	public void setIdVaga(int idVaga) {
		this.idVaga = idVaga;
	}

	public String getCodVaga() {
		return codVaga;
	}

	public void setCodVaga(String codVaga) {
		this.codVaga = codVaga;
	}

	public String getNomeVaga() {
		return nomeVaga;
	}

	public void setNomeVaga(String nomeVaga) {
		this.nomeVaga = nomeVaga;
	}

	public String getDescVaga() {
		return descVaga;
	}

	public void setDescVaga(String descVaga) {
		this.descVaga = descVaga;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
	
}
