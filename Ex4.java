package programacao.sequencial.exercicios;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		/*Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e
		calcule a seguinte express�o: D = R+S/2, onde R=(A+B)^2 e S=(B+C)^2*/
		
		int a,b,c,d;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite a: ");
		a=ler.nextInt();
		
		System.out.println("Digite b: ");
		b=ler.nextInt();
		
		System.out.println("Digite c: ");
		c=ler.nextInt();
		
		d=(((a+b)*(a+b))+((b+c)*(b+c)))/2;
		
		System.out.println("O resultado da express�o �: "+d);

	}

}
