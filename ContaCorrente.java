package Atividade1;

public class ContaCorrente extends Conta {

	public ContaCorrente(int numero, int agencia, Cliente titular) {
		super(numero, agencia, titular);
	}

	@Override
	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor + 0.10;
			return true;
		} else {
			System.out.println("A conta não possui saldo suficiente");
			return false;
		}
	}
	
}
