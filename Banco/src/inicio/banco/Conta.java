package inicio.banco;

public class Conta {
	int numero;
	Cliente nome;
	int agencia;
	double saldo;
	
	void deposita(double valorASerDepositado){
		this.saldo += valorASerDepositado;			
	
	}
	void saca(double valorDoSaque) {
		if(this.saldo >= valorDoSaque) {
			this.saldo -= valorDoSaque; 
		}
	}
	
	void transfere(double valor, Conta destino) {
		this.saldo -= valor;
		destino.saldo += valor;
		
	}
}