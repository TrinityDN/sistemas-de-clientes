package Atividade2;

import java.util.Scanner;

public class CriarFatura {
	
	public static void main(String []args) {
		
		Cliente cliente = new Cliente();
		
		cliente.fatura("José Carlos", "123.456.789-05", 2, 2500.00);
		
		System.out.println(" ");
		
		cliente.fatura("Maria Silva", "122.455.788-05", 7, 1300.00);
		
		
		System.out.println(" ");
		
		
		cliente.fatura("Marcelo Pires", "133.144.777.05", 7, 8635.53);
		
	}
}
