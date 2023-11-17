package br.com.recode.model;

public class Candidato {

	private int idCandidato;
	private String nomeCandidato;
	private String cpfCandidato;
	private String telefoneCandidato;
	private String emailCandidato;
	private String senhaCandidato;
	private String tipoDeficienciaCandidato;
	private String descDeficienciaCandidato;
	private String formacaoAcademicaCandidato;
	private String enderecoCandidato;
	private String numeroResidenciaCandidato;
	private String complementoResidenciaCandidato;
	private String bairroCandidato;
	private String cidadeCandidato;
	private String estadoCandidato;
	
	//caso precise, aqui vai um constructor vazio
	public Candidato () {
		super();
	}
	
	public Candidato(int idCandidato, String nomeCandidato, String cpfCandidato, String telefoneCandidato,
			String emailCandidato, String senhaCandidato, String tipoDeficienciaCandidato,
			String descDeficienciaCandidato, String formacaoAcademicaCandidato, String enderecoCandidato,
			String numeroResidenciaCandidato, String complementoResidenciaCandidato, String bairroCandidato,
			String cidadeCandidato, String estadoCandidato) {
		super();
		
		this.idCandidato = idCandidato;
		this.nomeCandidato = nomeCandidato;
		this.cpfCandidato = cpfCandidato;
		this.telefoneCandidato = telefoneCandidato;
		this.emailCandidato = emailCandidato;
		this.senhaCandidato = senhaCandidato;
		this.tipoDeficienciaCandidato = tipoDeficienciaCandidato;
		this.descDeficienciaCandidato = descDeficienciaCandidato;
		this.formacaoAcademicaCandidato = formacaoAcademicaCandidato;
		this.enderecoCandidato = enderecoCandidato;
		this.numeroResidenciaCandidato = numeroResidenciaCandidato;
		this.complementoResidenciaCandidato = complementoResidenciaCandidato;
		this.bairroCandidato = bairroCandidato;
		this.cidadeCandidato = cidadeCandidato;
		this.estadoCandidato = estadoCandidato;
	}

	public int getIdCandidato() {
		return idCandidato;
	}

	public void setIdCandidato(int idCandidato) {
		this.idCandidato = idCandidato;
	}

	public String getNomeCandidato() {
		return nomeCandidato;
	}

	public void setNomeCandidato(String nomeCandidato) {
		this.nomeCandidato = nomeCandidato;
	}

	public String getCpfCandidato() {
		return cpfCandidato;
	}

	public void setCpfCandidato(String cpfCandidato) {
		this.cpfCandidato = cpfCandidato;
	}

	public String getTelefoneCandidato() {
		return telefoneCandidato;
	}

	public void setTelefoneCandidato(String telefoneCandidato) {
		this.telefoneCandidato = telefoneCandidato;
	}

	public String getEmailCandidato() {
		return emailCandidato;
	}

	public void setEmailCandidato(String emailCandidato) {
		this.emailCandidato = emailCandidato;
	}

	public String getSenhaCandidato() {
		return senhaCandidato;
	}

	public void setSenhaCandidato(String senhaCandidato) {
		this.senhaCandidato = senhaCandidato;
	}

	public String getTipoDeficienciaCandidato() {
		return tipoDeficienciaCandidato;
	}

	public void setTipoDeficienciaCandidato(String tipoDeficienciaCandidato) {
		this.tipoDeficienciaCandidato = tipoDeficienciaCandidato;
	}

	public String getDescDeficienciaCandidato() {
		return descDeficienciaCandidato;
	}

	public void setDescDeficienciaCandidato(String descDeficienciaCandidato) {
		this.descDeficienciaCandidato = descDeficienciaCandidato;
	}

	public String getFormacaoAcademicaCandidato() {
		return formacaoAcademicaCandidato;
	}

	public void setFormacaoAcademicaCandidato(String formacaoAcademicaCandidato) {
		this.formacaoAcademicaCandidato = formacaoAcademicaCandidato;
	}

	public String getEnderecoCandidato() {
		return enderecoCandidato;
	}

	public void setEnderecoCandidato(String enderecoCandidato) {
		this.enderecoCandidato = enderecoCandidato;
	}

	public String getNumeroResidenciaCandidato() {
		return numeroResidenciaCandidato;
	}

	public void setNumeroResidenciaCandidato(String numeroResidenciaCandidato) {
		this.numeroResidenciaCandidato = numeroResidenciaCandidato;
	}

	public String getComplementoResidenciaCandidato() {
		return complementoResidenciaCandidato;
	}

	public void setComplementoResidenciaCandidato(String complementoResidenciaCandidato) {
		this.complementoResidenciaCandidato = complementoResidenciaCandidato;
	}

	public String getBairroCandidato() {
		return bairroCandidato;
	}

	public void setBairroCandidato(String bairroCandidato) {
		this.bairroCandidato = bairroCandidato;
	}

	public String getCidadeCandidato() {
		return cidadeCandidato;
	}

	public void setCidadeCandidato(String cidadeCandidato) {
		this.cidadeCandidato = cidadeCandidato;
	}

	public String getEstadoCandidato() {
		return estadoCandidato;
	}

	public void setEstadoCandidato(String estadoCandidato) {
		this.estadoCandidato = estadoCandidato;
	}
	
	
	
}
