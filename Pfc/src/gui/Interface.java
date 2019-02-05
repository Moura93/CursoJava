package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.Label;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JInternalFrame;

public class Interface extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface frame = new Interface();
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
	public Interface() {
		
		JLabel lblMenu = new JLabel("MENU");
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 512, 465);
		getContentPane().setLayout(null);
		
		JLabel lblMenuDeSeleo = new JLabel("MENU DE SELE\u00C7\u00C3O");
		lblMenuDeSeleo.setFont(new Font("BankGothic Lt BT", Font.PLAIN, 20));
		lblMenuDeSeleo.setBounds(152, 11, 213, 23);
		getContentPane().add(lblMenuDeSeleo);
		
		JButton btnNewButton = new JButton("DADOS DO CLIENTE");
		btnNewButton.setBounds(152, 45, 213, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnDadosDeLocalizao = new JButton("DADOS DE LOCALIZA\u00C7\u00C3O");
		btnDadosDeLocalizao.setBounds(152, 85, 213, 23);
		getContentPane().add(btnDadosDeLocalizao);
		
		JButton btnHistricoDeConsumo = new JButton("HIST\u00D3RICO DE CONSUMO");
		btnHistricoDeConsumo.setBounds(152, 125, 213, 23);
		getContentPane().add(btnHistricoDeConsumo);
	}
}
