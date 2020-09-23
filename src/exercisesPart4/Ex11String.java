package exercisesPart4;

import java.util.Scanner;

public class Ex11String {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nome1, nome2;
		
		System.out.print("Digite o primeiro nome: ");
		nome1 = sc.nextLine();
		System.out.print("Digite o segundo nome: ");
		nome2 = sc.nextLine();
		System.out.println("Tamanho do primeiro: " + nome1.length());
		System.out.println("Tamanho do segundo: " + nome2.length());
		String concat1 = nome1.toUpperCase() + " " +  nome2.toUpperCase();
		String concat2 = nome1.toLowerCase() + " " + nome2.toLowerCase();
		System.out.println("Concatenação Maiúscula: " + concat1);
		System.out.println("Concatenação Minúscula: " + concat2);
		sc.close();
		

	}

}
