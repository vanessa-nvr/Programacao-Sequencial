package programacao.sequencial.exercicios;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		/*Faça um sistema que leia o tempo de duração de um evento em uma fábrica
		expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/
		
		int s, h, m, seg;

		Scanner ler = new Scanner(System.in);
		System.out.println("Qual o tempo de duração em segundos? ");
		s = ler.nextInt();
				
		h = s/3600;
		m=(s-(h*3600))/60;
		seg=s-(h*3600)-(m*60);
		
		System.out.println("O tempo é: "+h+":"+m+":"+seg);
				
			
		
	}

}
