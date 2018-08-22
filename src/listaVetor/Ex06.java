/*
 * Disciplina: Programação Orientada a Objetos
 * Aluno: Hassan Fidelis
 */

import java.util.Scanner;
import java.util.Arrays;

public class Ex06 {
	private static int vectProd()
	{
		Scanner in = new Scanner(System.in);
		
		int f[] = new int[20];
		int g[] = new int[20];
		int prodf = 1;
		int prodg = 1;
		
		for (int i = 0; i < 20; i++)
		{
			System.out.print("Valor " + (i+1) + " do vetor F: ");
			f[i] = in.nextInt();
		}
		
		for (int i = 0; i < 20; i++)
		{
			System.out.print("Valor " + (i+1) + " do vetor G: ");
			g[i] = in.nextInt();
		}
		
		for (int i : f)
		{
			prodf *= i;
		}
		
		for (int i : g)
		{
			prodg *= i;
		}
		
		int prodfg = prodf * prodg;
		
		return prodfg;	
	}
	
	public static void main(String[] args)
	{
		System.out.println("O resultado dos Produtos dos valores é:" + vectProd());
	}
}