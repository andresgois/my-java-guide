package exer02;

import java.util.Locale;
import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*System.out.println("Exercício 1");		
		int n = sc.nextInt();
		if(n > 0) {
			System.out.println("POSITIVO");
		}else {
			System.out.println("NEGATIVO");
		}*/
		
		// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
		/*System.out.println("Exercício 2");
		int n1 = sc.nextInt();
		if(n1 % 2 == 0) {
			System.out.println("PAR");
		}else {
			System.out.println("ÍMPAR");
		}*/
		
		/*
		 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
		 * Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
		 * ordem crescente ou decrescente.
		 * */
		/*System.out.println("Exercício 3");
		int A = sc.nextInt();
		int B = sc.nextInt();
		if(A > B) {
			if(A % B == 0) {
				System.out.println("Sao Multiplos");
			}else {
				System.out.println("Nao sao Multiplos");
			}			
		}else {
			if(B % A == 0) {
				System.out.println("Sao Multiplos");
			}else {
				System.out.println("Nao sao Multiplos");
			}
		}*/
		
		/**
		 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
		 * começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
		 */
		/*System.out.println("Exercício 4");
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		
		int duracao;
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");*/
		
		/**
		 * Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
		 * seguir, calcule e mostre o valor da conta a pagar.
		 */
		/*System.out.println("Exercício 5");
		int cod = sc.nextInt();
		int qtd = sc.nextInt();
		if(cod == 1) {		System.out.println("Total: R$ "+(4.00 * qtd ));		}
		if(cod == 2) {		System.out.println("Total: R$ "+(4.50 * qtd ));		}
		if(cod == 3) {		System.out.println("Total: R$ "+(5.00 * qtd ));		}
		if(cod == 4) {		System.out.println("Total: R$ "+(5.50 * qtd ));		}
		if(cod == 5) {		System.out.println("Total: R$ "+(1.50 * qtd ));		}*/
		
		/**
		 * Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
		 * seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
		 * nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
		 */
		/*System.out.println("Exercício 6");
		double v = sc.nextDouble();
		if(v >= 0 && v <= 25) {  
			System.out.println("Intervalo (0,25]");  	
		}else if(v > 25 && v <= 25) {  
			System.out.println("Intervalo (25,50]");  			
		}else if(v > 25 && v <= 50) {  
			System.out.println("Intervalo (50,75]");  			
		}else if(v > 50 && v < 75) {  
			System.out.println("Intervalo (75,100]");  	
		}else {
			System.out.println("Fora do intervalo");
		}*/
		
		/**
		 * Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
		 * de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
		 * ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
		 * Se o ponto estiver na origem, escreva a mensagem “Origem”.
		 * Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
		 */
		/*System.out.println("Exercício 7");
		double y = sc.nextDouble();
		double x = sc.nextDouble();
		if (x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		}
		else if (x == 0.0) {
			System.out.println("Eixo Y");
		}
		else if (y == 0.0) {
			System.out.println("Eixo X");
		}
		else if (x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		}
		else if (x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		}
		else if (x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		}
		else {
			System.out.println("Q4");
		}*/
		
		/**
		 * Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
		 * que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
		 * qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
		 * Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
		 * mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
		 * Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
		 * salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
		 * de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
		 * duas casas decimais.
		 */
		System.out.println("Exercício 8");
		double salario = sc.nextDouble();
		
		double imposto;
		if (salario <= 2000.0) {
			imposto = 0.0;
		}
		else if (salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
		}
		else if (salario <= 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

		if (imposto == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", imposto);
		}
		
		sc.close();
		
	}

}
