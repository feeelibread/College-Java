package exercises;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex08 extends JFrame {
	private JCheckBox jCheckBox1, jCheckBox2;
	private JButton jButton_OK;
	private JPanel checkJPanel, buttonJPanel;
	private JPanel fieldJPanel;

	public Ex08() {
		super("Exemplo JCheckBox");
		jCheckBox1 = new JCheckBox("ITEM 1");
		jCheckBox2 = new JCheckBox("ITEM 2");
		checkJPanel = new JPanel();
		checkJPanel.setLayout(new GridLayout( 2, 1 ));
		checkJPanel.add(jCheckBox1);
		checkJPanel.add(jCheckBox2);

		fieldJPanel = new JPanel();
		fieldJPanel.setLayout(new BorderLayout());

		jButton_OK = new JButton("Ok");

		buttonJPanel = new JPanel();

		buttonJPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
		buttonJPanel.add(jButton_OK);

		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 30));
		add(checkJPanel);
		add(buttonJPanel);

	}

	public static void main(String[] args) {
		Ex08 teste = new Ex08();
		teste.setDefaultCloseOperation(EXIT_ON_CLOSE);
		teste.setVisible(true);
		teste.setSize(350, 150);
	}

}
