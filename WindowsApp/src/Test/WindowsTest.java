package Test;

import java.awt.EventQueue;
import java.awt.Label;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JProgressBar;

public class WindowsTest {

	private JFrame frame;
	private JLabel lblX;
	int i;
	private JButton btnNewButton;
	private JLabel lblX_1;
	private JLabel lblX_2;
	private JLabel lblX_3;
	private JLabel lblX_4;
	private JLabel lblX_5;
	private JTextField textField;
	private String str;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowsTest window = new WindowsTest();
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
	public WindowsTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 158);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		btnNewButton = new JButton("Shift Right");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				str = textField.getText();
				String str1 =lblX.getText();
				String str2 =lblX_1.getText();
				String str3 =lblX_2.getText();
				String str4 =lblX_3.getText();
				String str5 =lblX_4.getText();
				lblX.setText(str);
				lblX_1.setText(str1);
				lblX_2.setText(str2);
				lblX_3.setText(str3);
				lblX_4.setText(str4);
				lblX_5.setText(str5);

			}
		});
		btnNewButton.setBounds(12, 63, 408, 38);
		frame.getContentPane().add(btnNewButton);
		
		lblX = new JLabel("X");
		lblX.setBounds(25, 25, 25, 25);
		frame.getContentPane().add(lblX);
		
		lblX_1 = new JLabel("X");
		lblX_1.setBounds(50, 25, 25, 25);
		frame.getContentPane().add(lblX_1);
		
		lblX_2 = new JLabel("X");
		lblX_2.setBounds(75, 25, 25, 25);
		frame.getContentPane().add(lblX_2);
		
		lblX_3 = new JLabel("X");
		lblX_3.setBounds(100, 25, 25, 25);
		frame.getContentPane().add(lblX_3);
		
		lblX_4 = new JLabel("X");
		lblX_4.setBounds(125, 25, 25, 25);
		frame.getContentPane().add(lblX_4);
		
		lblX_5 = new JLabel("X");
		lblX_5.setBounds(150, 25, 25, 25);
		frame.getContentPane().add(lblX_5);
		
		textField = new JTextField();
		textField.setToolTipText("");
		textField.setBounds(175, 25, 100, 25);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
