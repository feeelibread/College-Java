package exercisesPart4;

import java.util.Scanner;

public class Ex10String {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str;
		
		System.out.print("Qual o seu nome? ");
		str = sc.nextLine();
		System.out.println("String: " + str);
		System.out.println("Tamanho: " + str.length());
		System.out.println("toUpperCase: " + str.toUpperCase());
		System.out.println("toLowerCase: " + str.toLowerCase());
		System.out.println("charAt(0): " + str.charAt(0));
		System.out.println("charAt(1): " + str.charAt(1));
		System.out.println("charAt(5): " + str.charAt(5));
		System.out.println("charAt(6): " + str.charAt(6));
		System.out.println("substrin(0, 3): " + str.substring(0,3));
		System.out.println("substring(6, 8): " + str.substring(6, 8));
		System.out.println("IndexOf(\"A\"): " +str.indexOf("A"));
		sc.close();

	}

}
