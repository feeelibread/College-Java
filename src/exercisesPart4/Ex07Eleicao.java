package exercisesPart4;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex07Eleicao {
	
	static String nomeEleitor;
	static int idade;
	static int anoNascimento;
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Qual o seu nome? ");
		nomeEleitor = teclado.nextLine();
		System.out.print("Qual o seu ano de nascimento? ");
		anoNascimento = teclado.nextInt();
		idade = calcularIdade(anoNascimento);
		
		if(idade < 16) {
			System.out.println("Você NÃO pode votar!");
		}
		else {
			System.out.println("Você PODE votar!");
		}
		System.out.println("Quem nasceu em 1990, tem " + calcularIdade(1990) + " anos.");
		

	}
	
	static int calcularIdade(int ano) {
		//System.out.println("Ano atual: " + LocalDate.now().getYear());
		return LocalDate.now().getYear() - ano;
	}
	

}
