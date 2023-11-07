package br.com.recode.model;

public class Candidatura {

	private int idCandidatura;
	private Vaga vaga;
	private Candidato candidato;
	private String statusCandidatura;
	
	//caso precise, aqui vai um constructor vazio
			public Candidatura () {
				super();
			}
	
	public Candidatura(int idCandidatura, Vaga vaga, Candidato candidato, String statusCandidatura) {
		super();
		this.idCandidatura = idCandidatura;
		this.vaga = vaga;
		this.candidato = candidato;
		this.statusCandidatura = statusCandidatura;
	}

	public int getIdCandidatura() {
		return idCandidatura;
	}

	public void setIdCandidatura(int idCandidatura) {
		this.idCandidatura = idCandidatura;
	}

	public Vaga getVaga() {
		return vaga;
	}

	public void setVaga(Vaga vaga) {
		this.vaga = vaga;
	}

	public Candidato getCandidato() {
		return candidato;
	}

	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}

	public String getStatusCandidatura() {
		return statusCandidatura;
	}

	public void setStatusCandidatura(String statusCandidatura) {
		this.statusCandidatura = statusCandidatura;
	}
	
	
}
