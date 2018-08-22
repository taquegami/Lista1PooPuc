/*
 * Disciplina: Programação Orientada a Objetos
 * Aluno: Hassan Fidelis
 */

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        Scanner bb = new Scanner(System.in);
        int s = 20;
        int v1[] = new int[s];
        int a = 43;
        int i;    
        for (i = 0; i < s; i++) {
            v1[i] = (i+10)*(100-(i*10));
        }
        
        int v3[] = new int[s];
        for (i = 0; i < s; i++) {
            v3[i] = a * v1[i];
        }
        System.out.printf("A soma é:");
        for (i = 0; i < s; i++) {
        System.out.printf("A posição é %d, e o valor é %2d\n", i, v3[i]);
        }

    }    
}