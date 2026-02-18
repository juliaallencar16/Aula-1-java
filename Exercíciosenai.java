package aulaJPA.aula01;

import java.util.Scanner;

public class Exercíciosenai {

	public static void main(String[] args) {
		String nome;
		// Variáveis
		String idade;
		String identidade;
		try (// instaciar classe Scanner
		Scanner ler = new Scanner(System.in)) {
			// Entrada de dados
			System.out.println("Informe seu nome: ");
			nome = ler.next();

			System.out.println("Informe sua idade: ");
			idade = ler.next();
		}

		// Processamento
		identidade = nome+", "+idade;
		// Saída
		System.out.println("identificação : " + identidade);

	}

}
