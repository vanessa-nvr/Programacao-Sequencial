package programacao.sequencial.exercicios;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		/*1. Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e
		dias e mostre-a expressa apenas em dias.*/
		
		int dias;
		
		Scanner ler = new Scanner(System.in); //cria a classe Scanner que l� do input bytes
		
		System.out.println("Digite o ano do seu nascimento. [4 d�gitos] ");
		int ano=ler.nextInt(); //L� o ano digitado no console
		
		System.out.println("Digite o m�s do seu nascimento. [2 d�gitos] ");
		int mes=ler.nextInt();
		
		System.out.println("Digite o dia do seu nascimento. [2 d�gitos] ");
		int dia=ler.nextInt();
		
		//Fazendo com o dia atual 26/01/2022
		
		dias=(2022-ano)*365+(1-mes)*30+26-(dia);
		

		System.out.println("A sua idade em dia �: "+dias);
	}

}
