import java.util.Scanner;
import java.util.Arrays;

public class Ex07
{
	private static int vectEvens()
	{
		Scanner in = new Scanner(System.in);
		
		int a[] = new int[5];
		int count = 0;
		
		for (int i = 0; i < a.length; i++)
		{
			System.out.print("Valor " + (i+1) + " do vetor: ");
			a[i] = in.nextInt();
		}
		
		for (int i : a)
		{
			if (i % 2 == 0)
			{
				count += 1;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Número de valores pares: " + vectEvens());
	}
}
