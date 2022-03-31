package pratica3_oo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CPF extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField txtCPF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CPF frame = new CPF();
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
	public CPF() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NOME");
		lblNewLabel.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 14));
		lblNewLabel.setBounds(36, 42, 46, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CPF");
		lblNewLabel_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(47, 97, 35, 31);
		contentPane.add(lblNewLabel_1);
		
		textNome = new JTextField();
		textNome.setBounds(86, 39, 307, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		txtCPF = new JTextField();
		txtCPF.setBounds(86, 99, 307, 20);
		contentPane.add(txtCPF);
		txtCPF.setColumns(10);
		
		JButton btnNewButton = new JButton("Validar CPF");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String CPF = txtCPF.getText();
				if(ValidaCPF.isCPF(CPF)==true)
					JOptionPane.showMessageDialog(null, "CPF Válido: "+CPF);
				else
					JOptionPane.showMessageDialog(null,  "CPF Inválido");
			}
		});
		btnNewButton.setBounds(166, 160, 116, 46);
		contentPane.add(btnNewButton);
	}
}
