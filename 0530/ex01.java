/**
Faça um programa que lê 10 números inteiros do teclado e armazene em um vetor. 
Ao final imprima o vetor armazenado nos dois sentidos.
 */
import java.util.Scanner;
public class ex01
{
    public static void main(String[] args){
        int vetor [] = new int[10];
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Inclusão de elementos no vetor");
        for(int pos = 0; pos < vetor.length; pos++){
            System.out.print("   Informe o valor da posição "+ pos +": ");
            vetor[pos] = entrada.nextInt();
        }
        System.out.println("O vetor foi preenchido :D");
        
        System.out.println("Conteúdo do vetor 0 ->" + (vetor.length -1));
        for(int pos = 0; pos < vetor.length; pos++){
            System.out.println("vetor["+pos+"]: " + vetor[pos]);
        }
        
        System.out.println("\nConteudo do vetor "+(vetor.length -1)+" -> 0");
        for(int pos = vetor.length -1; pos >= 0; pos--){
            System.out.println("vetor["+pos+"]: " + vetor[pos]);
        }
    }
}
