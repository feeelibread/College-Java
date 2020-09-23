package exercises;
import java.awt.*;
import javax.swing.*;

public class Ex10 extends JFrame{
	
	private JButton button1;
	private JRadioButton radio1, radio2, radio3;
	private ButtonGroup radioGroup;
	private JLabel label1;
	private JPanel panel1, panel2, panel3, panel4, panel5;
	
	public Ex10() {
		super("JRadioButton");
		label1 = new JLabel("Usando RadioButton: ");
		panel1 = new JPanel();
		panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel1.add(label1);
		
		button1 = new JButton("OK");
		panel2 = new JPanel();
		panel2.setLayout(new FlowLayout(FlowLayout.CENTER));
		panel2.add(button1);
		
		panel3 = new JPanel();
		panel3.setLayout(new BorderLayout());
		panel3.add(radio1 = new JRadioButton("ITEM 1", false), BorderLayout.NORTH);
		panel3.add(radio2 = new JRadioButton("ITEM 2", true), BorderLayout.CENTER);
		panel3.add(radio3 = new JRadioButton("ITEM 3", false), BorderLayout.SOUTH);
		
		radioGroup = new ButtonGroup();
		radioGroup.add(radio1);
		radioGroup.add(radio2);
		radioGroup.add(radio3);
		
		panel4 = new JPanel();
		panel4.setLayout(new BorderLayout());
		panel4.add(panel1, BorderLayout.NORTH);
		panel4.add(panel2, BorderLayout.SOUTH);
		panel4.add(panel3, BorderLayout.CENTER);
		
		panel5 = new JPanel();
		panel5.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 0));
		panel5.add(panel4);
		add(panel5);
	}
	
	public static void main(String[]args) {
		Ex10 ex = new Ex10();
		ex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ex.setSize(250,180);
		ex.setVisible(true);
	}
	

}
