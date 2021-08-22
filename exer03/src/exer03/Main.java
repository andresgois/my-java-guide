package exer03;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/**
		 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os �mpares de 1 at� X, um valor 
		 * por linha, inclusive o X, se for o caso.
		 */
		/*System.out.println("Exerc�cio 01");
		int x = sc.nextInt();
		int y = 0;
		while(x > y) {
			if(y % 2 == 1)	{ System.out.println(y); }
			y++;
		}*/
		
		/**
		 * Leia um valor inteiro N. Este valor ser� a quantidade de valores inteiros X que ser�o lidos em seguida.
		 * Mostre quantos destes valores X est�o dentro do intervalo [10,20] e quantos est�o fora do intervalo, mostrando
		 * essas informa��es conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
		 */
		/*System.out.println("Exerc�cio 02");
		int n = sc.nextInt();
		int in = 0;
		int out = 0;
		int x1;
		System.out.println("----------------");
		for(int i=1;i <= n;i++) {
			x1 = sc.nextInt();
			if(x1 >= 10 && x1 <=20) {
				in += 1;
			}else {
				out += 1;
			}
		}
		System.out.printf("%d in\n",in);
		System.out.printf("%d out\n",out);*/
		
		
		/**
		 * Leia 1 valor inteiro N, que representa o n�mero de casos de teste que vem a seguir. Cada caso de teste consiste
		 * de 3 valores reais, cada um deles com uma casa decimal. Apresente a m�dia ponderada para cada um destes
		 * conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
		 * peso 5.
		 */
		/*System.out.println("Exerc�cio 03");
		int n1 = sc.nextInt();
		double n2;
		double m;
		int[] peso = {2,3,5};
		for(int i=0;i<n1;i++) {
			m=0;
			for(int j=0; j<n1;j++) {
				n2 = sc.nextDouble();
				m = m + (n2 * peso[j]);
			}
			m = m/10;
			System.out.printf("%.1f\n",m);
		}*/
		
		/**
		 * Fazer um programa para ler um n�mero N. Depois leia N pares de n�meros e mostre a divis�o do primeiro pelo
		 * segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
		 */
		/*System.out.println("Exerc�cio 04");
		int n3 = sc.nextInt();
		double d1 = 0.0;
		double d2 = 0.0;
		double soma = 0;
		for(int i = 0; i< n3;i++) {
			for(int j = 0; j< n3;j++) {
				d1 = sc.nextDouble();
				d2 = sc.nextDouble();
				if(!(d2 == 0)) {
					System.out.println(d1/d2);
				}else {
					System.out.println("Divis�o inposs�el");
				}
			}			
		}*/
		
		
		/** 1 * (1-1) = 1| 2 * (1-2)
		 * Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
		 * Lembrando que, por defini��o, fatorial de 0 � 1.
		 */
		/*System.out.println("Exerc�cio 05");
		int N = sc.nextInt();
		int fatorial = 1;
		for(int i=1; i <= N; i++) {
			fatorial = fatorial * i;
		}
		System.out.println(fatorial);*/
		
		
		/**
		 * Ler um n�mero inteiro N e calcular todos os seus divisores.
		 */
		/*System.out.println("Exerc�cio 06");
		int y = sc.nextInt();
		int z = 1;
		while(z <= y) {
			if(y % z == 0) {
				System.out.println(z);
			}
			z++;
		}*/
		
		/**
		 * Fazer um programa para ler um n�mero inteiro positivo N. O programa deve ent�o mostrar na tela N linhas,
		 * come�ando de 1 at� N. Para cada linha, mostrar o n�mero da linha, depois o quadrado e o cubo do valor, conforme
		 * exemplo.
		 */
		System.out.println("Exerc�cio 07");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			System.out.print(i+" ");
			System.out.print((int) Math.pow(i, 2)+" ");
			System.out.print((int) Math.pow(i, 3)+"\n");
			
		}
	}

}
