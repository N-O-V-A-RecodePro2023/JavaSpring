package br.com.recode.model;

public class Empresa {

	private int idEmpresa;
	private String razaoSocialEmpresa;
	private String nomeFantasiaEmpresa;
	private String cnpjEmpresa;
	private String telefoneEmpresa;
	private String emailEmpresa;
	private String senhaEmpresa;
	private String seguimentoEmpresa;
	private String descSeguimentoEmpresa;
	private String enderecoEmpresa;
	private String numeroEmpresa;
	private String complementoEmpresa;
	private String bairroEmpresa;
	private String cidadeEmpresa;
	private String estadoEmpresa;
	
	//caso precise, aqui vai um constructor vazio
		public Empresa () {
			super();
		}
	
	public Empresa(int idEmpresa, String razaoSocialEmpresa, String nomeFantasiaEmpresa, String cnpjEmpresa,
			String telefoneEmpresa, String emailEmpresa, String senhaEmpresa, String seguimentoEmpresa,
			String descSeguimentoEmpresa, String enderecoEmpresa, String numeroEmpresa, String complementoEmpresa,
			String bairroEmpresa, String cidadeEmpresa, String estadoEmpresa) {
		super();
		this.idEmpresa = idEmpresa;
		this.razaoSocialEmpresa = razaoSocialEmpresa;
		this.nomeFantasiaEmpresa = nomeFantasiaEmpresa;
		this.cnpjEmpresa = cnpjEmpresa;
		this.telefoneEmpresa = telefoneEmpresa;
		this.emailEmpresa = emailEmpresa;
		this.senhaEmpresa = senhaEmpresa;
		this.seguimentoEmpresa = seguimentoEmpresa;
		this.descSeguimentoEmpresa = descSeguimentoEmpresa;
		this.enderecoEmpresa = enderecoEmpresa;
		this.numeroEmpresa = numeroEmpresa;
		this.complementoEmpresa = complementoEmpresa;
		this.bairroEmpresa = bairroEmpresa;
		this.cidadeEmpresa = cidadeEmpresa;
		this.estadoEmpresa = estadoEmpresa;
	}

	public int getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getRazaoSocialEmpresa() {
		return razaoSocialEmpresa;
	}

	public void setRazaoSocialEmpresa(String razaoSocialEmpresa) {
		this.razaoSocialEmpresa = razaoSocialEmpresa;
	}

	public String getNomeFantasiaEmpresa() {
		return nomeFantasiaEmpresa;
	}

	public void setNomeFantasiaEmpresa(String nomeFantasiaEmpresa) {
		this.nomeFantasiaEmpresa = nomeFantasiaEmpresa;
	}

	public String getCnpjEmpresa() {
		return cnpjEmpresa;
	}

	public void setCnpjEmpresa(String cnpjEmpresa) {
		this.cnpjEmpresa = cnpjEmpresa;
	}

	public String getTelefoneEmpresa() {
		return telefoneEmpresa;
	}

	public void setTelefoneEmpresa(String telefoneEmpresa) {
		this.telefoneEmpresa = telefoneEmpresa;
	}

	public String getEmailEmpresa() {
		return emailEmpresa;
	}

	public void setEmailEmpresa(String emailEmpresa) {
		this.emailEmpresa = emailEmpresa;
	}

	public String getSenhaEmpresa() {
		return senhaEmpresa;
	}

	public void setSenhaEmpresa(String senhaEmpresa) {
		this.senhaEmpresa = senhaEmpresa;
	}

	public String getSeguimentoEmpresa() {
		return seguimentoEmpresa;
	}

	public void setSeguimentoEmpresa(String seguimentoEmpresa) {
		this.seguimentoEmpresa = seguimentoEmpresa;
	}

	public String getDescSeguimentoEmpresa() {
		return descSeguimentoEmpresa;
	}

	public void setDescSeguimentoEmpresa(String descSeguimentoEmpresa) {
		this.descSeguimentoEmpresa = descSeguimentoEmpresa;
	}

	public String getEnderecoEmpresa() {
		return enderecoEmpresa;
	}

	public void setEnderecoEmpresa(String enderecoEmpresa) {
		this.enderecoEmpresa = enderecoEmpresa;
	}

	public String getNumeroEmpresa() {
		return numeroEmpresa;
	}

	public void setNumeroEmpresa(String numeroEmpresa) {
		this.numeroEmpresa = numeroEmpresa;
	}

	public String getComplementoEmpresa() {
		return complementoEmpresa;
	}

	public void setComplementoEmpresa(String complementoEmpresa) {
		this.complementoEmpresa = complementoEmpresa;
	}

	public String getBairroEmpresa() {
		return bairroEmpresa;
	}

	public void setBairroEmpresa(String bairroEmpresa) {
		this.bairroEmpresa = bairroEmpresa;
	}

	public String getCidadeEmpresa() {
		return cidadeEmpresa;
	}

	public void setCidadeEmpresa(String cidadeEmpresa) {
		this.cidadeEmpresa = cidadeEmpresa;
	}

	public String getEstadoEmpresa() {
		return estadoEmpresa;
	}

	public void setEstadoEmpresa(String estadoEmpresa) {
		this.estadoEmpresa = estadoEmpresa;
	}
	
	
	
	
}
