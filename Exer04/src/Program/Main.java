package Program;

import java.util.Locale;
import java.util.Scanner;

import Entities.Employee;
import Entities.Retangulo;
import Entities.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Exercicio01(sc);
		//Exercicio02(sc);
		Exercicio03(sc);
		
	}
	
	/**
	 * Fazer um programa para ler os valores da largura e altura
	 * de um ret�ngulo. Em seguida, mostrar na tela o valor de
	 * sua �rea, per�metro e diagonal. Usar uma classe como
	 * mostrado no projeto ao lado.
	 * @param sc
	 */
	public static void Exercicio01(Scanner sc) {
		Retangulo ret = new Retangulo();
		System.out.println("Enter rectangle width and height: ");
		ret.height = sc.nextDouble();
		ret.width = sc.nextDouble();
		
		System.out.println("AREA = "+ret.Area());
		System.out.println("PERIMETER = "+ret.Perimeter());
		System.out.println("DIAGONAL = "+ret.Diagonal());
	}
	
	/**
	 * Fazer um programa para ler os dados de um funcion�rio (nome, sal�rio bruto e imposto). Em
	 * seguida, mostrar os dados do funcion�rio (nome e sal�rio l�quido). Em seguida, aumentar o
	 * sal�rio do funcion�rio com base em uma porcentagem dada (somente o sal�rio bruto �
	 * afetado pela porcentagem) e mostrar novamente os dados do funcion�rio. Use a classe
	 * projetada abaixo.
	 * @param sc
	 */
	public static void Exercicio02(Scanner sc) {
		Employee func = new Employee();
		System.out.println("Enter with data of employee: ");
		System.out.print("Name: ");
		func.name = sc.nextLine();
		System.out.print("Gross salary: ");
		func.gossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		func.tax = sc.nextDouble();
		
		System.out.println("Employee : "+func);
		System.out.print("Which percentage to increase salary? ");
		double perc = sc.nextDouble();
		func.IncreaseSalary(perc);
		System.out.println("Update data : "+func);
	}
	
	/**
	 * Fazer um programa para ler o nome de um aluno e as tr�s notas que ele obteve nos tr�s trimestres do ano
	 * (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
	 * ano. Dizer tamb�m se o aluno est� aprovado (PASS) ou n�o (FAILED) e, em caso negativo, quantos pontos faltam
	 * para o aluno obter o m�nimo para ser aprovado (que � 60% da nota). Voc� deve criar uma classe Student para
	 * resolver este problema.
	 */
	public static void Exercicio03(Scanner sc) {
		Student st = new Student();
		
		System.out.print("Name: ");
		st.name = sc.nextLine();
		System.out.println("Enter with notes: ");
		for(int i=0;i<3;i++) {
			st.notes[i] = sc.nextDouble();
		}
		
		System.out.printf("FINAL GRADE = %.2f\n",st.finalGrade());
		System.out.println(st.PassedOn());
	
	}

}
