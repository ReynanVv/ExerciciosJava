package entities;

public class Conta {
	private int numConta;
	private String nomeTitular;
	private double valor;
	
	public Conta(int numConta, String nomeTitular) {		
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
		
	}
	
	public Conta(int numConta, String nomeTitular, double valorInicial) {		
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
		deposito(valorInicial);
	}

	public int getNumConta() {
		return numConta;
	}


	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getValor() {
		return valor;
	}
	
	public void deposito(double quant) {
		valor += quant;
	}
	
	public void saque(double quant) {
		valor -= quant + 5.0;
	}
	public String toString() {
		return "Account "
				+ numConta
				+ ", Holder:"
				+ nomeTitular
				+ ", Balance: $ "
				+ String.format("%.2f", valor);
	}
}
