package main;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//matriz(sc);
		matrizExer(sc);
	}
	
	public static void matriz(Scanner sc) {
		
		System.out.println("Digite as linhas e colunas");
		int n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		int numNegativo = 0;
		int[] digPrincipal = new int[n];
		
		for(int i=0; i < n; i++) {
			for(int j=0; j < n; j++) {
				mat[i][j] = sc.nextInt();
				if(mat[i][j] < 0) {
					numNegativo++;
				}
				if(i == j) {
					digPrincipal[i] = mat[i][j];
				}
			}
		}
		System.out.println("\nMatriz");
		for(int i=0; i < n; i++) {
			for(int j=0; j < n; j++) {
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("\nMain diagonal:");
		for(int i=0; i < n; i++) {
			System.out.print(digPrincipal[i]+"\t");
		}
		
		System.out.println("\nNegative numbers = "+numNegativo);
	}

	public static void matrizExer(Scanner sc) {
		
		/*System.out.println("Digite as linhas");
		int l = sc.nextInt();
		System.out.println("Digite as colunas");
		int c = sc.nextInt();*/
		int l = 3, c= 4;
		//int[][] mat = new int[l][c];
		int[][] mat = {
				{10,8,15,12},
				{21,11,23,8},
				{14,5,13,19}
		};
		/*		c[0]	c[1]	c[2]	c[3]
		 l[0] 	10		8		15		12
		 l[1]	21		11		23		8
		 l[2]	14		5		13		19
		*/
		
		/*for(int i=0; i < l; i++) {
			for(int j=0; j < c; j++) {
				mat[i][j] = sc.nextInt();
			}
		}*/
		System.out.print("Digite o número a procurar: ");
		int n = sc.nextInt();
		System.out.println();
		
		for(int i=0; i < l; i++) {
			for(int j=0; j < c; j++) {
				if(mat[i][j] == n) {
					System.out.println("Position "+i+","+j+":");
					if(i-1 >= 0) System.out.println("Up: "+mat[i-1][j]);
					if(j-1 >= 0) System.out.println("Left: "+mat[i][j-1]);
					if(j+1 < c) System.out.println("Right: "+mat[i][j+1]);
					if(i+1 < l) System.out.println("Down: "+mat[i+1][j]);
				}				
			}
			System.out.println();
		}
	}

	
}
