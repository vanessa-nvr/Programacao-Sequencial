package programacao.sequencial.exercicios;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
		dias e mostre-a expressa apenas em dias.*/
		
		int dias;
		
		Scanner ler = new Scanner(System.in); //cria a classe Scanner que lê do input bytes
		
		System.out.println("Digite o ano do seu nascimento. [4 dígitos] ");
		int ano=ler.nextInt(); //Lê o ano digitado no console
		
		System.out.println("Digite o mês do seu nascimento. [2 dígitos] ");
		int mes=ler.nextInt();
		
		System.out.println("Digite o dia do seu nascimento. [2 dígitos] ");
		int dia=ler.nextInt();
		
		//Fazendo com o dia atual 26/01/2022
		
		dias=(2022-ano)*365+(1-mes)*30+26-(dia);
		

		System.out.println("A sua idade em dia é: "+dias);
	}

}
