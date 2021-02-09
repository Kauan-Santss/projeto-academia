package br.senai.sp.jandira.gui;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class FrameCalculadoraNcdImc {
	

	public void criarTela() {
		JFrame telaCliente = new JFrame();
		telaCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaCliente.setSize(500,600);
		telaCliente.setTitle("Calculos com retângulo");
		telaCliente.setLayout(null);
		telaCliente.setLocationRelativeTo(null);
		
		// *** Criando label e text field do nome
		JLabel labelNome = new JLabel();
		labelNome.setText("Nome");
		labelNome.setBounds(10, 20, 80, 30);
		JTextField textNome = new JTextField();
		textNome.setBounds(10, 45, 150, 30);
		
		// *** Criando label e textField Data de nascimento
		JLabel labelIdade = new JLabel();
		labelIdade.setText("Data de Nascimento");
		labelIdade.setBounds(10, 80, 130, 30);
		
		JLabel labelDia = new JLabel();
		labelDia.setText("Dia");
		labelDia.setBounds(25, 105, 50, 30);
		JTextField textDia = new JTextField();
		textDia.setBounds(10, 130, 50, 30);
		
		JLabel labelMes = new JLabel();
		labelMes.setText("Mês");
		labelMes.setBounds(80, 105, 50, 30);
		JTextField textMes = new JTextField();
		textMes.setBounds(70, 130, 50, 30);
		
		JLabel labelAno = new JLabel();
		labelAno.setText("Ano");
		labelAno.setBounds(145, 105, 50, 30);
		JTextField textAno = new JTextField();
		textAno.setBounds(130, 130, 50, 30);
		
		JRadioButton radioMasculino = new JRadioButton();
		radioMasculino.setText("Masculino");
		radioMasculino.setBounds(10, 170, 120, 30);
		JRadioButton radioFeminino = new JRadioButton();
		radioFeminino.setText("Feminino");
		radioFeminino.setBounds(130, 170, 120, 30);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(radioMasculino);
		buttonGroup.add(radioFeminino);
		
		
		
		// *** Colocar dentro do painel de conteudo
		telaCliente.getContentPane().add(labelNome);
		telaCliente.getContentPane().add(textNome);
		telaCliente.getContentPane().add(labelIdade);
		telaCliente.getContentPane().add(textDia);
		telaCliente.getContentPane().add(labelDia);
		telaCliente.getContentPane().add(labelMes);
		telaCliente.getContentPane().add(textMes);
		telaCliente.getContentPane().add(labelAno);
		telaCliente.getContentPane().add(textAno);
		telaCliente.getContentPane().add(radioMasculino);
		telaCliente.getContentPane().add(radioFeminino);


		telaCliente.setVisible(true);
	}
}

