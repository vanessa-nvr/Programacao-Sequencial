package programacao.sequencial.exercicios;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		/*Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
		aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
		respectivamente.*/
		
		double a,b,c;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a 1� nota: ");
		a=ler.nextDouble();
		
		System.out.println("Digite a 2� nota: ");
		b=ler.nextDouble();
		
		System.out.println("Digite a 3� nota: ");
		c=ler.nextDouble();
		
		System.out.println("A m�dia �: "+((2*a+3*b+5*c)/10));
	}

}
