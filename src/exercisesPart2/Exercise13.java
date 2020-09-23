package exercisesPart2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Exercise13 extends JFrame {

	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JPasswordField passwordField;
	private JLabel label;

	public Exercise13() {
		super("Testando JTextField e JPasswordField");
		setLayout(new FlowLayout());

		textField1 = new JTextField(10);
		add(textField1);

		textField2 = new JTextField("Digite um texto aqui");
		add(textField2);

		textField3 = new JTextField("TextField desabilitado para edição", 21);
		textField3.setEditable(false);
		add(textField3);

		passwordField = new JPasswordField("Password");
		add(passwordField);

		label = new JLabel("tecle Enter após a digitação em algum TextField");
		add(label);

		TextFieldHandler handler = new TextFieldHandler();
		textField1.addActionListener(handler);
		textField2.addActionListener(handler);
		textField3.addActionListener(handler);
		passwordField.addActionListener(handler);

	}

	private class TextFieldHandler implements ActionListener {

		public void actionPerformed(ActionEvent event) {
			String string = "";
			if (event.getSource() == textField1)
				string = String.format("textField1: %s", event.getActionCommand());

			else if (event.getSource() == textField2)
				string = String.format("textField2: %s", event.getActionCommand());

			else if (event.getSource() == textField3)
				string = String.format("textField3: %s", event.getActionCommand());

			else if (event.getSource() == passwordField)
				string = String.format("passwordField: %s", new String(passwordField.getPassword()));
			
			JOptionPane.showInternalMessageDialog(null, string);

		}

	}
	
	public static void main(String[] args) {
		Exercise13 ex = new Exercise13();
		ex.setLocation(400,200);
		ex.setSize(300, 400);
		ex.setVisible(true);
		ex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
