package programacao.sequencial.exercicios;

import java.util.Scanner;

public class EX2 {

	public static void main(String[] args) {
		/*Fa�a um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
		expressa em anos, meses e dias.*/
		
		int ano,mes,dia,dias;

		Scanner leia=new Scanner(System.in);
		System.out.println("Quantos dias de vida voc� tem? ");
		dias=leia.nextInt();
		
		ano=dias/365;
	
		mes=(dias-(365*ano))/31;

		dia=dias-(365*ano)-(mes*31);
		System.out.println(ano+" anos, "+mes+" meses e "+dia+" dias.");		
		
	}

}
