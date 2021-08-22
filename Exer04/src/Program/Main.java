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
	 * de um retângulo. Em seguida, mostrar na tela o valor de
	 * sua área, perímetro e diagonal. Usar uma classe como
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
	 * Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
	 * seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
	 * salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
	 * afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
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
	 * Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
	 * (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
	 * ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
	 * para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
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
