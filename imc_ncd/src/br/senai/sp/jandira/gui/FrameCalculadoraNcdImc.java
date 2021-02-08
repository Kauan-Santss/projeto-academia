package br.senai.sp.jandira.gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameCalculadoraNcdImc {
	

	public void criarTela() {
		JFrame telaCliente = new JFrame();
		telaCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaCliente.setSize(500, 300);
		telaCliente.setTitle("Calculos com retângulo");
		telaCliente.setLayout(null);
		telaCliente.setLocationRelativeTo(null);
		
		// *** criando label e text field do nome
		JLabel labelNome = new JLabel();
		labelNome.setText("Nome : ");
		//*** DEFININDO A POSIÇÃO
		labelNome.setBounds(10, 45, 80, 30);
		
		
		telaCliente.setVisible(true);
	}
}

