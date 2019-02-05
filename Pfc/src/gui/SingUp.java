package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JProgressBar;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SingUp extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SingUp frame = new SingUp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SingUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 299, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSing = new JLabel("SING UP");
		lblSing.setBounds(0, 65, 283, 22);
		lblSing.setHorizontalAlignment(SwingConstants.CENTER);
		lblSing.setFont(new Font("BankGothic Lt BT", Font.PLAIN, 20));
		contentPane.add(lblSing);
		
		txtName = new JTextField();
		txtName.setHorizontalAlignment(SwingConstants.CENTER);
		txtName.setText("NAME");
		txtName.setBounds(82, 98, 115, 22);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setHorizontalAlignment(SwingConstants.CENTER);
		txtPassword.setText("PASSWORD");
		txtPassword.setBounds(82, 131, 115, 20);
		contentPane.add(txtPassword);
		txtPassword.setColumns(10);
		
		Button button = new Button("CREATE ACCOUNT");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(txtPassword == 5) {
					JOptionPane.showMessageDialog(null, "Successeful login!");
				}
				else {
					JOptionPane.showMessageDialog(null, "Failed login attempt!");
				}
			}
		});
		button.setBounds(82, 190, 115, 22);
		contentPane.add(button);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(0, 287, 283, 14);
		contentPane.add(progressBar);
	}
}
