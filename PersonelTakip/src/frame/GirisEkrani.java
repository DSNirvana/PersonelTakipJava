package frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GirisEkrani extends JFrame {

	private JPanel contentPane;
	private JTextField txtUser;
	private JPasswordField txtPass;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GirisEkrani frame = new GirisEkrani();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
	}

	
	public GirisEkrani() {
		setTitle("Personel Takip Sistemi");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 412, 255);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PERSONEL TAK\u0130P S\u0130STEM\u0130");
		lblNewLabel.setBounds(82, 5, 224, 27);
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblNewLabel.setForeground(new Color(255, 140, 0));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Kullan\u0131c\u0131 Ad\u0131:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(82, 66, 96, 34);
		panel.add(lblNewLabel_1);
		
		JLabel lblifre = new JLabel("\u015Eifre:");
		lblifre.setForeground(Color.WHITE);
		lblifre.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblifre.setBounds(82, 105, 96, 34);
		panel.add(lblifre);
		
		txtUser = new JTextField();
		txtUser.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtUser.setBounds(188, 76, 118, 20);
		panel.add(txtUser);
		txtUser.setColumns(10);
		
		txtPass = new JPasswordField();
		txtPass.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtPass.setBounds(188, 115, 118, 20);
		panel.add(txtPass);
		
		JButton btnGÝris = new JButton("Giri\u015F");
		
		btnGÝris.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (txtUser.getText().equals("admin")&&txtPass.getText().equals("123")) {	
					JOptionPane.showMessageDialog(null, "Tebrikler Baþarýyla Giriþ Yaptýnýz!");
					AnaForm anaform= new AnaForm();
					anaform.show();
					
					
					
					
				}
			}
		});
		btnGÝris.setForeground(Color.BLACK);
		btnGÝris.setBackground(new Color(255, 140, 0));
		btnGÝris.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		btnGÝris.setBounds(188, 159, 118, 34);
		panel.add(btnGÝris);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 140, 0));
		contentPane.add(panel_1, BorderLayout.EAST);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 140, 0));
		contentPane.add(panel_2, BorderLayout.WEST);
	}
}
