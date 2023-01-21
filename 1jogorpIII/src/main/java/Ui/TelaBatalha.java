package Ui;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import java.awt.Color;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class TelaBatalha extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaBatalha frame = new TelaBatalha();
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
	public TelaBatalha() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 532, 334);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelInimigo = new JPanel();
		panelInimigo.setBackground(new Color(47, 79, 79));
		panelInimigo.setBounds(10, 11, 197, 101);
		contentPane.add(panelInimigo);
		panelInimigo.setLayout(null);
		
		JLabel label_1 = new JLabel("5/10");
		label_1.setBounds(104, 28, 36, 14);
		panelInimigo.add(label_1);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setValue(50);
		progressBar.setEnabled(false);
		progressBar.setBounds(48, 28, 139, 14);
		panelInimigo.add(progressBar);
		
		JLabel lblVida = new JLabel("Vida:");
		lblVida.setForeground(new Color(255, 255, 255));
		lblVida.setBounds(13, 28, 46, 14);
		panelInimigo.add(lblVida);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(new Color(255, 255, 255));
		lblNome.setBounds(13, 11, 46, 14);
		panelInimigo.add(lblNome);
		
		JLabel lblInimigoXesque = new JLabel("inimigo xesque");
		lblInimigoXesque.setForeground(new Color(255, 255, 255));
		lblInimigoXesque.setBounds(49, 11, 138, 14);
		panelInimigo.add(lblInimigoXesque);
		
		JLabel lblAtaque = new JLabel("Ataque:");
		lblAtaque.setForeground(new Color(255, 255, 255));
		lblAtaque.setBounds(13, 53, 46, 14);
		panelInimigo.add(lblAtaque);
		
		JLabel label = new JLabel("3");
		label.setForeground(new Color(255, 255, 255));
		label.setBounds(59, 53, 46, 14);
		panelInimigo.add(label);
		
		JLabel lblDefesa = new JLabel("Defesa:");
		lblDefesa.setForeground(new Color(255, 255, 255));
		lblDefesa.setBounds(13, 76, 46, 14);
		panelInimigo.add(lblDefesa);
		
		JLabel label_2 = new JLabel("2");
		label_2.setForeground(new Color(255, 255, 255));
		label_2.setBounds(59, 76, 46, 14);
		panelInimigo.add(label_2);
		
		JLabel label_12 = new JLabel("Velocidade:");
		label_12.setForeground(Color.WHITE);
		label_12.setBounds(90, 53, 58, 14);
		panelInimigo.add(label_12);
		
		JLabel label_13 = new JLabel("3");
		label_13.setForeground(Color.WHITE);
		label_13.setBounds(150, 53, 36, 14);
		panelInimigo.add(label_13);
		
		JPanel panelJogador = new JPanel();
		panelJogador.setLayout(null);
		panelJogador.setBackground(new Color(72, 61, 139));
		panelJogador.setBounds(319, 194, 197, 101);
		contentPane.add(panelJogador);
		
		JLabel label_3 = new JLabel("5/10");
		label_3.setBounds(104, 28, 36, 14);
		panelJogador.add(label_3);
		
		JProgressBar progressBar_1 = new JProgressBar();
		progressBar_1.setValue(50);
		progressBar_1.setEnabled(false);
		progressBar_1.setBounds(48, 28, 139, 14);
		panelJogador.add(progressBar_1);
		
		JLabel label_4 = new JLabel("Vida:");
		label_4.setForeground(new Color(255, 255, 255));
		label_4.setBounds(13, 28, 46, 14);
		panelJogador.add(label_4);
		
		JLabel label_5 = new JLabel("Nome:");
		label_5.setForeground(new Color(255, 255, 255));
		label_5.setBounds(13, 11, 46, 14);
		panelJogador.add(label_5);
		
		JLabel lblPlayer = new JLabel("player");
		lblPlayer.setForeground(new Color(255, 255, 255));
		lblPlayer.setBounds(49, 11, 138, 14);
		panelJogador.add(lblPlayer);
		
		JLabel label_7 = new JLabel("Ataque:");
		label_7.setForeground(new Color(255, 255, 255));
		label_7.setBounds(13, 53, 46, 14);
		panelJogador.add(label_7);
		
		JLabel label_8 = new JLabel("3");
		label_8.setForeground(new Color(255, 255, 255));
		label_8.setBounds(58, 53, 29, 14);
		panelJogador.add(label_8);
		
		JLabel label_9 = new JLabel("Defesa:");
		label_9.setForeground(new Color(255, 255, 255));
		label_9.setBounds(13, 76, 46, 14);
		panelJogador.add(label_9);
		
		JLabel label_10 = new JLabel("2");
		label_10.setForeground(new Color(255, 255, 255));
		label_10.setBounds(59, 76, 29, 14);
		panelJogador.add(label_10);
		
		JLabel label_6 = new JLabel("Velocidade:");
		label_6.setForeground(Color.WHITE);
		label_6.setBounds(90, 53, 58, 14);
		panelJogador.add(label_6);
		
		JLabel label_11 = new JLabel("3");
		label_11.setForeground(Color.WHITE);
		label_11.setBounds(150, 53, 36, 14);
		panelJogador.add(label_11);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(64, 224, 208));
		panel_1.setBounds(0, 249, 516, 46);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnAtacar = new JButton("Atacar");
		btnAtacar.setBounds(10, 5, 85, 37);
		panel_1.add(btnAtacar);
		
		JButton btnMagia = new JButton("Magia 1");
		btnMagia.setBounds(117, 5, 85, 37);
		panel_1.add(btnMagia);
		
		JButton btnMagia_1 = new JButton("Magia 2");
		btnMagia_1.setBounds(223, 5, 85, 37);
		panel_1.add(btnMagia_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(0, 189, 283, 64);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 11, 263, 53);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Vez do Jogador!");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setBounds(10, 11, 243, 42);
		panel_2.add(lblNewLabel);
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setForeground(new Color(0, 0, 0));
	}
}
