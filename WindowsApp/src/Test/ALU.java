package Test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ALU {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ALU window = new ALU();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ALU() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 452, 298);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAb = new JLabel("A&B");
		lblAb.setBounds(25, 25, 50, 15);
		frame.getContentPane().add(lblAb);
		
		JLabel lblAb_1 = new JLabel("A|B");
		lblAb_1.setBounds(75, 25, 50, 15);
		frame.getContentPane().add(lblAb_1);
		
		JLabel lblAb_2 = new JLabel("A+B");
		lblAb_2.setBounds(125, 25, 50, 15);
		frame.getContentPane().add(lblAb_2);
		
		JLabel lblAb_3 = new JLabel("(A) & (~B)");
		lblAb_3.setBounds(175, 25, 75, 15);
		frame.getContentPane().add(lblAb_3);
		
		JLabel lblNewLabel = new JLabel("(A)|(~B)");
		lblNewLabel.setBounds(250, 25, 50, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblAb_4 = new JLabel("A-B");
		lblAb_4.setBounds(325, 25, 50, 15);
		frame.getContentPane().add(lblAb_4);
		
		JLabel lblab = new JLabel("(A=B)?");
		lblab.setBounds(375, 25, 50, 15);
		frame.getContentPane().add(lblab);
		
		textField = new JTextField();
		textField.setBounds(25, 50, 24, 15);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(75, 50, 40, 15);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(125, 53, 40, 15);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(185, 50, 40, 15);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(260, 53, 40, 15);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(315, 53, 40, 15);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(368, 50, 40, 15);
		frame.getContentPane().add(textField_6);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(12, 191, 413, 25);
		frame.getContentPane().add(btnNewButton);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(93, 78, 82, 15);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(280, 81, 82, 15);
		frame.getContentPane().add(textField_8);
		
		JLabel lblA = new JLabel("A =");
		lblA.setBounds(25, 78, 56, 16);
		frame.getContentPane().add(lblA);
		
		JLabel lblB = new JLabel("B = ");
		lblB.setBounds(214, 81, 56, 16);
		frame.getContentPane().add(lblB);
	}

}
