package br.senai.sp.jandira.model;

public class Cliente {
	
	private String nome;
	private double peso;
	private double altura;
	private int idade;
	private String genero;
	private String nivelDeAtividade;
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getPeso() {
		return this.peso;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getAltura() {
		return this.altura;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getIdade() {
		return this.idade;
	}
	
	public void setGenero(String genero) {
		if (genero.contentEquals("Masculino") || genero.equals("Feminino")) {
			this.genero = genero;
		}
		else {
			System.out.println("O genero deve ser: Masculino ou Feminino");
		}
	}
	public String getGenero() {
		return this.genero;
	}
	
	public void setNivelDeAtividade(String nivelDeAtividade) {
		if(nivelDeAtividade.contentEquals("leve") || nivelDeAtividade.equals("moderada")) {
			this.nivelDeAtividade = nivelDeAtividade;
		}
		else {
			if(nivelDeAtividade.equals("intensa")) {
				this.nivelDeAtividade = nivelDeAtividade;
			}
			else {
				System.out.println("O nivel de atividade deve ser igual: leve, moderada ou intensa");
			}
		}
	}
}

