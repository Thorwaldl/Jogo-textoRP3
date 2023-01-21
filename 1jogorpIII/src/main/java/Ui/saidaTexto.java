package Ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import Classes.LeitorBeta1;

public class saidaTexto extends JFrame {

	private JPanel SaidaTexto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					saidaTexto frame = new saidaTexto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public saidaTexto() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 532, 334);
		SaidaTexto = new JPanel();
		SaidaTexto.setBackground(Color.CYAN);
		SaidaTexto.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(SaidaTexto);
		SaidaTexto.setLayout(null);
		
		JButton botaoOp�ao1 = new JButton("New button");
		botaoOp�ao1.setBackground(Color.GREEN);
		botaoOp�ao1.setBounds(10, 211, 90, 30);
		SaidaTexto.add(botaoOp�ao1);
		
		JButton botaoOp�ao2 = new JButton("New button");
		botaoOp�ao2.setBackground(Color.GREEN);
		botaoOp�ao2.setBounds(109, 211, 90, 30);
		SaidaTexto.add(botaoOp�ao2);
		
		JButton botaoOp�ao3 = new JButton("New button");
		botaoOp�ao3.setBackground(Color.GREEN);
		botaoOp�ao3.setBounds(10, 251, 90, 30);
		SaidaTexto.add(botaoOp�ao3);
		
		JButton botaoOp�ao4 = new JButton("New button");
		botaoOp�ao4.setBackground(Color.GREEN);
		botaoOp�ao4.setBounds(109, 251, 90, 30);
		SaidaTexto.add(botaoOp�ao4);
		
		JButton botaoOraculo = new JButton("Or\u00E1culo");
		botaoOraculo.setForeground(Color.BLACK);
		botaoOraculo.setBackground(Color.GREEN);
		botaoOraculo.setBounds(406, 211, 100, 70);
		SaidaTexto.add(botaoOraculo);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Comic Sans MS", Font.ITALIC, 12));
		textPane.setBounds(0, 0, 516, 200);
		LeitorBeta1 lb = new LeitorBeta1();
		textPane.setText(lb.lerArquivo("txteste.txt"));
		SaidaTexto.add(textPane);
	}

}
