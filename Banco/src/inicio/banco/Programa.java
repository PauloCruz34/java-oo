package inicio.banco;

public class Programa {
	
	public static void main(String[] args) {
		Conta paulo = new Conta();
		paulo.numero = 123;
		paulo.saldo = 1235.00;
		paulo.agencia = 321;
		paulo.nome = new Cliente();
		paulo.nome.nome = "Paulo Afonso";
		paulo.nome.cpf = "09149828690";
		paulo.nome.dataNascimento = "28/01/1989";
		
		
		
			
		
		paulo.deposita(100);
		paulo.saca(300);
		
		Conta pedro = new Conta();
		pedro.numero = 123;
		pedro.saldo = 1235.00;
		pedro.nome= new Cliente();
		pedro.nome.nome = "Pedro";
		pedro.nome.cpf = "12345678910";
		pedro.nome.dataNascimento = "10/12/1254";
		
		pedro.transfere(500,paulo);
		
		System.out.println(paulo.nome.dataNascimento);
		System.out.println(pedro.saldo);
		
	}
}
