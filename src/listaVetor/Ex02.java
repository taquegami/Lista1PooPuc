/* Disciplina: Programação Orientada a Objetos 
 * Aluno: João Pedro Lima
 */

public class Ex02 
{
	private static double f(double x)
	{
		return Math.pow(x, 4);
	}
	
	private static double simpson(double a, double b)
	{
		int n = 9;
		double h = (b-a)/(n-1);
		
		double intValue = 1/3 * (f(a) + f(b));
		
		for (int i = 1; i < n - 1; i += 2)
		{
			double x = (a + h) * i;
			intValue += 4/3 * f(x);			
		}
		
		for (int i = 2; i < n - 1; i += 2)
		{
			double x = (a + h) * i;
			intValue += 2/3 * f(x);
		}
		
		return intValue * h;	
	}
	
	public static void main(String[] args)
	{
		double a = 1;
		double b = 9;
		System.out.println("Valor aproximado: " + simpson(a, b));
	}
}