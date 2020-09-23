package exercises;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ex5 extends JFrame {

	private JLabel labelNome, labelEnd;
	private JTextField tFNome, tFEndereco;
	private JButton btOk;

	public Ex5() {
		super("Exemplo FlowLayout");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		labelNome = new JLabel("Nome: ");
		tFNome = new JTextField(15);
		labelEnd = new JLabel("\nEndereço: ");
		tFEndereco = new JTextField(20);
		btOk = new JButton("OK");
		
		Container janela;
		janela = getContentPane();
		janela.setLayout(new FlowLayout());
		
		janela.add(labelNome);
		janela.add(tFNome);
		janela.add(labelEnd);
		janela.add(tFEndereco);
		janela.add(btOk);
		
		setSize(400, 200);
	}
	
	public static void main(String[] args) {
		Ex5 ex = new Ex5();
		ex.setVisible(true);
		
	}

}
