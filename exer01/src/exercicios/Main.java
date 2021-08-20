package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* 
		 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
		 * mensagem explicativa, conforme exemplos.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Exercício - 01");
		int x = 0;
		int y = 0;
		
		x = sc.nextInt();
		y = sc.nextInt();
		int som = (x+y);
		System.out.println("SOMA = "+som);
		
		/**
		 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
		 * casas decimais conforme exemplos.
		 * Fórmula da área: area = π . raio2
		 * Considere o valor de π = 3.14159
		 */
		
		System.out.println("Exercício - 02");
		double area = 0.0;
		double r = sc.nextDouble();
		double pi = 3.14159;
		area = pi * (Math.pow(r, 2.0));
		System.out.printf("A = %.4f%n", area);
		
		/**
		 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
		 * de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
		 */
		
		System.out.println("Exercício - 03");
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int d = (A * B - C * D);
		System.out.println("DIFERENCA = "+d);
		
		/*
		 * Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
		 * hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
		 * decimais. 
		 */
		System.out.println("Exercício - 04");
		int numFunc = sc.nextInt();
		int horasTrab = sc.nextInt();
		double valorPorHora = sc.nextDouble();
		
		double salary = horasTrab * valorPorHora;
		System.out.println("NUMBER =  "+numFunc);
		System.out.printf("SALARY = U$ %.2f", salary);
		
		
		/**
		 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
		 * código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago
		 */
		System.out.println("Exercício - 05");
		int codPeca = sc.nextInt();
		int numPecas = sc.nextInt();
		double valorUni = sc.nextDouble();
		
		int codPeca2 = sc.nextInt();
		int numPecas2 = sc.nextInt();
		double valorUni2 = sc.nextDouble();
		
		double total = (numPecas * valorUni + numPecas2 * valorUni2);
		System.out.printf("VALOR A PAGAR: R$\t%.2f",total);
		
		
		
		/**
		 * Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
		 * mostre:
		 * a) a área do triângulo retângulo que tem A por base e C por altura.
		 * b) a área do círculo de raio C. (pi = 3.14159)
		 * c) a área do trapézio que tem A e B por bases e C por altura.
		 * d) a área do quadrado que tem lado B.
		 * e) a área do retângulo que tem lados A e B.
		 */
		System.out.println("Exercício - 06");
		double pi2 = 3.14159;
		double A1 = sc.nextDouble();
		double B1 = sc.nextDouble();
		double C1 = sc.nextDouble();
		
		double tri = (A1 * C1) / 2;
		double cir = pi2 * (Math.pow(C1, 2.0));
		double tra = ((A1 + B1) * C1) / 2;
		double qua = Math.pow(B1, 2.0);
		double ret = (A1 * B1);
		
		System.out.printf("TRIANGULO:\t%.3f%n",tri);
		System.out.printf("CIRCULO:\t%.3f%n",cir);
		System.out.printf("TRAPEZIO:\t%.3f%n",tra);
		System.out.printf("QUADRADO:\t%.3f%n",qua);
		System.out.printf("RETANGULO:\t%.3f%n",ret);
		
		sc.close();
	}

}
