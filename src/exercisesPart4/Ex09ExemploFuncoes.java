package exercisesPart4;

import java.util.*;

public class Ex09ExemploFuncoes {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		String seuNome;
		System.out.print("Qual o seu nome? ");
		seuNome = ler.nextLine();

		System.out.println("Olá " + seuNome + "\nEu sou o Java!");
		Random rnd = new Random();
		int num1, num2;
		String continua = "SIM";

		while (continua.toUpperCase().equals("SIM")) {
			num1 = rnd.nextInt(100);
			num2 = rnd.nextInt(100);
			System.out.println("Numero 1: " + num1);
			System.out.println("Numero 2: " + num2);

			if (num1 > num2) {
				System.out.println("Maior = " + num1);
			} else {
				System.out.println("Maior = " + num2);
			}
			
			System.out.println("Produto na função = " + produto(num1, num2));
			System.out.print("Deseja executar novamente (Sim ou Não)? ");
			continua = ler.nextLine();
		}
		
		System.out.println("Fim do programa");
		ler.close();

	}

	static int soma(int a, int b) {
		return a + b;
	}

	static int produto(int a, int b) {
		return a * b;
	}
	
	static float dobro(float n) {
		return n * 2;
	}
	
	static int maior(int a, int b) {
		return (a > b ? a : b);
	}

}
