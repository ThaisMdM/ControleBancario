package Atividade1;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int numero, int agencia, Cliente titular) {
		super(numero, agencia, titular);
	}

	@Override
	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
}
