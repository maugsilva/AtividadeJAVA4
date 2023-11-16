package atividade4_java;

import java.util.Scanner;

public class atividade4 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		int idade;
		int soma = 0 , media = 0;
		System.out.println("Degite um numero");
		idade = leitura.nextInt();
		
		for(int i = 0; i < 5 ; i++ ) {
			System.out.println("digite sua idade");
			idade = leitura.nextInt();
			
			soma = soma + idade;
			media = soma / 5;
			
		}
		System.out.println("A soma das idades" + soma);
		System.out.println("A media das idade " + media);
	}

}