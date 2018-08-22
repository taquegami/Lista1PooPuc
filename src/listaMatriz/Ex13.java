import java.util.Scanner;

	public class Ex13 {
	    
	    public static void main(String[] args) {
	        int[][] matriz = new int[6][6];
	        int menor = 0;

	        Scanner entrada = new Scanner(System.in);
	        System.out.println("Matriz 6 x 6\n");

	        for(int linha = 0; linha < 6; linha++){
	            for(int coluna = 0; coluna < 6; coluna++){
	                System.out.printf("Digite o elemento para a Matriz[%d][%d]: ", linha+1,coluna+1);
	                matriz[linha][coluna] = entrada.nextInt();
	            }
	        }
	        for(int linha = 0; linha < 6; linha++){
	            for(int coluna = 0; coluna < 6; coluna++){
	                System.out.printf("\t %d \t", matriz[linha][coluna]);
	            }
	            System.out.println();
	        }
	    }
}
