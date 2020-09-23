package exercisesPart4;

import java.util.*;

public class Ex06Metodos {

	static int x, y;
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int z;
		x = lerInt("Digite o primeiro numero: ");
		y = lerInt("Digite o segundo numero: ");
		z = lerInt("Digite o terceiro numero: ");
		
		imprima("Soma: " + somar(x, y));
		imprima("Teste: " + somar(20, 10));
		imprima("Produto: " + multiplicar(x, y));
		imprima("Dobro do primeiro: " + dobrar(x));
		imprima("Dobro do segundo: " + dobrar(y));
		imprima("Dobro do terceiro: " + dobrar(z));
		

	}

	public static void imprima(String s) {
		System.out.println(s);
	}

	public static int somar(int a, int b) {
		return a + b;
	}
	
	public static int multiplicar(int a, int b) {
		return a * b;
	}
	
	public static int dobrar(int a) {
		return somar(a, a);
	}
	
	public static int lerInt(String texto) {
		int num;
		System.out.print(texto);
		num = teclado.nextInt();
		return num;
		
	}
}
