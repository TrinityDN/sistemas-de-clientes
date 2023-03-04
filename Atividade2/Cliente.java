package Atividade2;

public class Cliente {
	
	public String cliente;
	public String cpf;
	public int quantidadeDeProdutos;
	public double totalDaCompra;
	
	public void fatura(String nome, String cpf, int quantidade, double total) {
		
		this.cliente = nome;
		this.cpf = cpf;
		this.quantidadeDeProdutos = quantidade;
		this.totalDaCompra = total;
		
		System.out.println("Cliente: " + cliente);
		System.out.println("Cpf: " + cpf);
		System.out.println("Quantidade: " + quantidade);
		System.out.println("Total: " + total);
		
	}
	
	

}
