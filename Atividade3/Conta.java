package Atividade3;

public class Conta {
	
	public int agencia;
	public int conta;
	public String titular;
	public double saldo;
	
	static int totalConta = 1234;

	public Conta(int agencia, String titular) {
		
		this.agencia = agencia;
		this.titular = titular;
		this.conta = totalConta + 1;
		this.totalConta++;
		
		System.out.println("Voc� acaba de criar uma conta para: " + titular);
		System.out.println("Ag�ncia: " + agencia);
		System.out.println("Conta: " + totalConta);
		
		
		
		
		
	}
	

}
