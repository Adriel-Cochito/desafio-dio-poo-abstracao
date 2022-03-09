package br.com.dio.desafio.dominio;

public class DevDetalhe {
	private String sobrenome;
	private String email;
	private String telefone;
	private boolean completo = true;
	
	
	public DevDetalhe(String sobrenome, String email, String telefone) {
		super();
		this.sobrenome = sobrenome;
		this.email = email;
		this.telefone = telefone;
	}
	
	@Override
    public String toString() {
        return "Detalhe{" +
                "sobrenome='" + getSobrenome() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", telefone=" + getTelefone() +
                '}';
    }
	
	
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public boolean isCompleto() {
		return completo;
	}

	public void setCompleto(boolean completo) {
		this.completo = completo;
	}
	
	
	
}
