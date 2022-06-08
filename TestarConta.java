public class TestarConta {

	public static void main(String[] args) {
		
		//Criação de Contas e Clientes
		
		Conta conta1 = new Conta();
		Cliente fulano1 = new Cliente();
		
		Conta conta2 = new Conta();
		Cliente fulano2 = new Cliente();
		
		fulano1.nome = "Fulano1";
		fulano2.nome = "fulano2";
		
		
		// Realiza método de deposito:
		
		conta1.depositar(0);	
		conta2.depositar(0);
				
		
		
		//Realiza método de saque e retona ao cliente se a operação não foi completada:
	
		boolean alertaSaque1 = conta1.sacar(0);
			if(alertaSaque1 == true) {
				System.out.println();
			} else {
				System.out.println("Nao foi possivel realizar o saque, saldo insuficiente");
			}
			
		boolean alertaSaque2 = conta2.sacar(0);
		if(alertaSaque2 == true) {
			System.out.println();
		} else {
			System.out.println("Nao foi possivel realizar o saque, saldo insuficiente");
		}
						
		
		// Realiza método de transferencia e retorna ao cliente se a operação não foi completada:
		
		boolean alertaTransferencia1 = conta1.transferir(0, conta2);
			if(alertaTransferencia1 == true) {
				System.out.println();
			} else { 
				System.out.println("Não foi possivel realizar a transferencia, saldo insuficiente");
			}
				
		boolean alertaTransferencia2 = conta2.transferir(0, conta1);
			if(alertaTransferencia2 == true) {
				System.out.println();
			} else { 
				System.out.println("Não foi possivel realizar a transferencia, saldo insuficiente");
			}
				
		// Imprime para o cliente o saldo das contas: 
			
		System.out.println(fulano1.nome + "(Saldo): " + conta1.getSaldo());
		System.out.println(fulano2.nome + "(Saldo): " + conta2.getSaldo());
		
	}
	
}
