package Atividade1;

public abstract class Conta {

	protected double saldo;
	private int numero;
	private int agencia;
	private Cliente titular;

	public Conta(int numero, int agencia, Cliente titular) {
		this.numero = numero;
		this.agencia = agencia;
		this.titular = titular;
		this.saldo = 0;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public abstract boolean sacar(double valor);

	@Override
	public String toString() {
		return "Dados do Cliente e da Conta\n" + this.titular + "\nAgência: " + this.agencia + "\nNúmero da conta: "
				+ this.numero + "\nSaldo atual: " + this.saldo + "\n";
	}

}
