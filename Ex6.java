package programacao.sequencial.exercicios;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		/*Construa um programa em c que, tendo como dados de entrada dois pontos
		quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles.*/
		
		double x1,x2,y1,y2,d,num=0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Abscissa do 1º ponto: ");
		x1=ler.nextDouble();
		
		System.out.println("Ordenada do 1º ponto: ");
		y1=ler.nextDouble();
		
		System.out.println("Abscissa do 2º ponto: ");
		x2=ler.nextDouble();
		
		System.out.println("Ordenada do 2º ponto: ");
		y2=ler.nextDouble();
		
		d=Math.pow(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2), 0.5);
		
		num=Math.round(d * 100.0)/100.0;
		
		System.out.println("A distância entre esse pontos é: "+num);

	}

}
