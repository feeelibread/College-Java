package exercisesPart4;

import javax.swing.JOptionPane;

public class Ex08MaiorNumero {

	public static void main(String[] args) {
		int n1, n2 , n3;
		
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: "));
		n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo numero: ", "Entrada de dados"));
		n3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o terceiro numero: ", "Entrada de dados"));
		
		if(n1 < n2 && n1<n3) {
			if(n2 < n3) {
				JOptionPane.showMessageDialog(null, "Numeros ordenados: \n" + n1 + "\n" + n2 + "\n" + n3);
			} 
			else {
				JOptionPane.showMessageDialog(null, "Numeros ordenados: \n" + n1 + "\n" + n3 + "\n" + n2);
			}
		} 
		else if(n2 < n1 && n2 < n3) {
			if(n1 < n3) {
				JOptionPane.showMessageDialog(null, "Numeros ordenados: \n" + n2 + "\n" + n1 + "\n" + n3);
			}
			else {
				JOptionPane.showMessageDialog(null, "Numeros ordenados: \n" + n2 + "\n" + n3 + "\n" + n1);
			}
		} 
		else if(n1 < n2) {
			JOptionPane.showMessageDialog(null, "Numeros ordenados: \n" + n3 + "\n" + n1 + "\n" + n2);
		}
		else {
			JOptionPane.showMessageDialog(null, "Numeros ordenados: \n" + n3 + "\n" + n2 + "\n" + n1);
		}

	}

}
