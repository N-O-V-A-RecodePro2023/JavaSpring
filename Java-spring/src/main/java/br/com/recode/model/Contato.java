package br.com.recode.model;

public class Contato {

	private int idContato;
	private String nomeContato;
	private String emailContato;
	private String assuntoContato;
	private String mensagemContato;
	
	//caso precise, aqui vai um constructor vazio
	public Contato () {
		super();
	}
	
	public Contato(int idContato, String nomeContato, String emailContato, String assuntoContato,
			String mensagemContato) {
		super();
		this.idContato = idContato;
		this.nomeContato = nomeContato;
		this.emailContato = emailContato;
		this.assuntoContato = assuntoContato;
		this.mensagemContato = mensagemContato;
	}

	public int getIdContato() {
		return idContato;
	}

	public void setIdContato(int idContato) {
		this.idContato = idContato;
	}

	public String getNomeContato() {
		return nomeContato;
	}

	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}

	public String getEmailContato() {
		return emailContato;
	}

	public void setEmailContato(String emailContato) {
		this.emailContato = emailContato;
	}

	public String getAssuntoContato() {
		return assuntoContato;
	}

	public void setAssuntoContato(String assuntoContato) {
		this.assuntoContato = assuntoContato;
	}

	public String getMensagemContato() {
		return mensagemContato;
	}

	public void setMensagemContato(String mensagemContato) {
		this.mensagemContato = mensagemContato;
	}
	
	
	
}
