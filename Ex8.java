package programacao.sequencial.exercicios;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		/*O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
		percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
		Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
		escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
		consumidor.*/
		
		double custo;
		
		Scanner ler=new Scanner(System.in);
		
		System.out.println("Qual o custo de fábrica de um carro? ");
		custo=ler.nextDouble();
		
		System.out.println("O custo para o consumidor é: "+(custo*1.73));

	}

}
