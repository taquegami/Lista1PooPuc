/*
 * Disciplina: Programação Orientada a Objetos
 * Aluno: Hassan Fidelis
 */

import java.util.Scanner;

public class Ex12 {
    
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
       
    
        Scanner entrada = new Scanner(System.in);
        System.out.println("Matriz 10 x 10\n");

        
       for(int linha = 0; linha < 10 ; linha++){  
            for(int coluna = 0; coluna < 10 ; coluna++){  
                    matriz[linha][coluna] = (int)(Math.random()*10);
            }
        }        
       int menor = matriz [0][0]; //maior valor do vetor
    for (int linha=0; linha< 10; linha++) 
        for (int coluna=0; coluna<10; coluna++) {
      if (matriz[linha][coluna] < menor)
         menor = matriz[linha][coluna]; //Atribuindo o maior valor a vairÃ¡vel
    }    
          
            
        
        for(int linha = 0; linha < 10; linha++){
            for(int coluna = 0; coluna < 10; coluna++){
                System.out.printf("\t %d \t", matriz[linha][coluna]);
            }
            System.out.println();
        }
     System.out.printf("\n");
      
     System.out.println("O MENOR VALOR É " + menor);
           
               }
 
    }