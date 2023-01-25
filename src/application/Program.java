package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
				
		System.out.println("PROGRAMA DO PROFESSOR");
		
		System.out.print("Nome do Aluno: ");
		aluno.nome = sc.nextLine();
		
		System.out.print("Nota do 1º Trimestre: ");
		aluno.nota1 = sc.nextDouble();
		
		System.out.print("Nota do 2º Trimestre: ");
		aluno.nota2 = sc.nextDouble();
		
		System.out.print("Nota do 3º Trimestre: ");
		aluno.nota3 = sc.nextDouble();
		
		System.out.println();
		System.out.printf("NOTA FINAL = %.2f%n", aluno.notaFinal());
		
		if (aluno.notaFinal()> 60) {
			System.out.println("APROVADO");
		}
		else if (aluno.notaFinal() < 60) {
			System.out.println("REPROVADO");
			System.out.printf("FALTARAM %.2f", aluno.notaFaltaram(), " PONTOS");
		}	
		
		sc.close();

	}

}
