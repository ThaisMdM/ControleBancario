package Atividade1;

public class Cliente {
	
	private String nome;
	private String cpf;
	
	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}
	
	@Override
	public String toString() {
		return "Nome do cliente: " + this.nome + "\nNúmero do CPF: " + this.cpf;
	}
	
	
}
