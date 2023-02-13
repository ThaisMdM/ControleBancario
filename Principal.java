package Atividade1;

public class Principal {

	public static void main(String[] args) {

		Conta cc = new ContaCorrente(0, 220, new Cliente("Reginaldo", "111.1"));
		Conta cp = new ContaPoupanca(230, 450, new Cliente("Marcela", "222.2"));

		cc.deposita(500);
		cp.deposita(200);
		cc.sacar(200);
		cp.sacar(100);

		if(cc.getNumero() > 0 && cc.getAgencia() > 0) {
			System.out.println(cc);
		}else {
			System.out.println("Os dados da conta são invalidos, a agência e a conta devem ser maiores que 0");
		}
		
		if(cp.getNumero() > 0 && cp.getAgencia() > 0) {
			System.out.println(cp);
		}else {
			System.out.println("Os dados da conta são invalidos");
		}

	}

}
