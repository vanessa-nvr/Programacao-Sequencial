package programacao.sequencial.exercicios;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		/*O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
		percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
		Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
		escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
		consumidor.*/
		
		double custo;
		
		Scanner ler=new Scanner(System.in);
		
		System.out.println("Qual o custo de f�brica de um carro? ");
		custo=ler.nextDouble();
		
		System.out.println("O custo para o consumidor �: "+(custo*1.73));

	}

}
