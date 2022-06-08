public class Conta {
	
	// Definição dos atributos da classe Conta: 
	
	private double saldo;
	private int agencia;
	private int conta;
	Cliente titular; 
	
	// Definição dos métodos da classe Conta:
	
	public double getSaldo() {
		 return this.saldo;
	}
	
	public void setSaldo(double novoNumero) {
		this.saldo = novoNumero;
	}
	
	public double getAgencia() {
		 return this.agencia;
	}
	
	public void setAgencia(int novaAgencia) {
		this.agencia = novaAgencia;
	}
	
	public int getConta() {
		 return this.conta;
	}
	
	public void setConta(int novoNumero) {
		this.conta = novoNumero;
	}
	
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public boolean sacar(double valor) {
		if(valor <= saldo) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transferir(double valor, Conta destino) {
		
		if(valor <= this.saldo) {
			this.saldo -= valor;
			destino.saldo += valor;
			return true;
		} else {
			return false;
		}
	}	
}
