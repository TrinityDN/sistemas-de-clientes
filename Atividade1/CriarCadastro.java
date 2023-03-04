package Atividade1;

import java.util.Scanner;

public class CriarCadastro {
	
	public static void main(String [] args) {
		
		Cadastro objeto1 = new Cadastro();
		
		Cadastro objeto2 = new Cadastro();
		
		Cadastro objeto3 = new Cadastro();
		
		objeto1.nome = "Sport Car - LOJA 1";
		objeto1.estado = "São Paulo";
		objeto1.numeroFuncionario = "15";
		objeto1.faturamentoMensal = "650.000";
		
		
		objeto2.nome = "Sport Car - LOJA 2";
		objeto2.estado = "São Paulo";
		objeto2.numeroFuncionario = "20";
		objeto2.faturamentoMensal = "420.000";
		
		objeto3.nome = "Sport Car - LOJA 3";
		objeto3.estado = "São Paulo";
		objeto3.numeroFuncionario = "10";
		objeto3.faturamentoMensal = "180.000";
		
		System.out.println(" ");
		
		System.out.println("Nome: " + objeto1.nome);
		System.out.println("Estado: " + objeto1.estado);
		System.out.println("Número de funcionários: " + objeto1.numeroFuncionario);
		System.out.println("Faturamento: " + objeto1.faturamentoMensal);
		
		System.out.println(" ");
		
		System.out.println("Nome: " + objeto2.nome);
		System.out.println("Estado: " + objeto2.estado);
		System.out.println("Número de funcionários: " + objeto2.numeroFuncionario);
		System.out.println("Faturamento: " + objeto2.faturamentoMensal);
		
		System.out.println(" ");
		
		System.out.println("Nome: " + objeto3.nome);
		System.out.println("Estado: " + objeto3.estado);
		System.out.println("Número de funcionários: " + objeto3.numeroFuncionario);
		System.out.println("Faturamento: " + objeto3.faturamentoMensal);
		
		
		
		
		
	}

}
