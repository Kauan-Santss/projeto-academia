package vetores;

public class Vetor {

	public static void main(String[] args) {
		
		// *** Criação de vetores (Array)
		double[] notas = {
				7.8, 
				8.4, 
				6.5, 
				9.2
		};
//		String[] alunos = {
//				"Maria",
//				"Pedro",
//				"Ana",
//				"Fabiana",
//				"Fernanda",
//				"William"
//		};
//		
//		System.out.println("Notas: " + notas.length);
//		System.out.println("Alunos: " + alunos.length);
//		
//		System.out.println("Nota 3º Bimestre: " + notas[2]);
//		System.out.println("Nota 4º Bimestre: " + notas[3]);
//		
//		notas[3] = 9.8;
//		
//		System.out.println("Nota 4º Bimestre (correção): " + notas[3]);
		
		
		double soma = 0;
		// For/While/Do-Until
		for(int i = 0; i < 4; i++) {
			soma += notas[i];
		}
		double media = soma/ 4; 
		System.out.println("Média = " + media);
	}
}
