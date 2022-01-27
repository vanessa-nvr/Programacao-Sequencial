package programacao.sequencial.exercicios;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		/*Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
		aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
		respectivamente.*/
		
		double a,b,c;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a 1ª nota: ");
		a=ler.nextDouble();
		
		System.out.println("Digite a 2ª nota: ");
		b=ler.nextDouble();
		
		System.out.println("Digite a 3ª nota: ");
		c=ler.nextDouble();
		
		System.out.println("A média é: "+((2*a+3*b+5*c)/10));
	}

}
