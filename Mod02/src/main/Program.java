package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//matriz(sc);
		//matrizExer(sc);
		
		//datas();
		usandoCalendar();
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

	public static void datas() throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date y1 = sdf1.parse("05/09/2021");
		Date y2 = sdf2.parse("05/09/2021 09:48:07");
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
		Date x4 = new Date(1000L * 60L * 60L * 5L);
		
		System.out.println("y1 sem format: "+y1);
		System.out.println("y2 sem format: "+y2);
		
		System.out.println("y1 format: "+sdf2.format(y1));
		System.out.println("y2 format: "+sdf2.format(y2));
		
		System.out.println("X1 - Hora Atual: "+sdf2.format(x1));
		System.out.println("X2 - Hora Atual currentTimeMillis: "+sdf2.format(x2));
		System.out.println("X3 - Horário inicial: "+sdf2.format(x3));
		System.out.println("X4 - Horário inicial: "+sdf2.format(x4));
		System.out.println("y2 format: "+sdf2.format(y3));
		
		System.out.println("-------------------------------------------");
		/*
		 * System.out.println("y1 sem format: "+y1);
		 * System.out.println("y2 sem format: "+y2);
		 */
		
		System.out.println("y1 format: "+sdf3.format(y1));
		System.out.println("y2 format: "+sdf3.format(y2));
		
		System.out.println("X1 - Hora Atual: "+sdf3.format(x1));
		System.out.println("X2 - Hora Atual currentTimeMillis: "+sdf3.format(x2));
		System.out.println("X3 - Horário inicial: "+sdf3.format(x3));
		System.out.println("X4 - Horário inicial: "+sdf3.format(x4));
		System.out.println("y2 format: "+sdf3.format(y3));
		
		System.out.println("-------------------------------------------");
	}

	public static void usandoCalendar(){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		Calendar cal = Calendar.getInstance();
		
		
		System.out.println(sdf.format(d));
		
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH);
		
		System.out.println(sdf.format(d));
		System.out.println("Minutes: "+minutes);
		System.out.println("Month: "+month);
	}
}
