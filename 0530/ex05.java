/*
 *  Faça um programa que leia e monte dois vetores de números inteiros com 
 *  20 números cada. Depois de montados gere um terceiro vetor formado pela 
 *  diferença dos dois vetores lidos, um quarto vetor formado pela soma dos 
 *  dois vetores lidos e por último um quinto vetor formado pela multiplicação 
 *  dos dois vetores lidos
 */
import java.util.Random;
public class ex05
{
    public static void main(String[] args){
        Random ran = new Random();
        int vetor [] = new int[20];
        int vetorII [] = new int[20];
        
        int vetorSub [] = new int[20];
        int vetorMais [] = new int[20];
        int vetorMult [] = new int[20];
        
        System.out.println("Valores do primeiro vetor:");
        for(int pos = 0; pos < vetor.length; pos++){
            vetor[pos] = ran.nextInt(20);
            System.out.print(vetor[pos] + ", ");
        }
        System.out.println("\nValores do segundo vetor:");
        for(int pos = 0; pos < vetorII.length; pos++){
            vetorII[pos] = ran.nextInt(20);
            System.out.print(vetorII[pos] + ", ");
        }
        System.out.print("\n\nDiferença     --> ");
        for(int pos = 0; pos < vetor.length; pos++){
            vetorSub[pos] = vetor[pos] - vetorII[pos];
            System.out.print(vetorSub[pos] + ", ");
        }
        System.out.print("\nAdição        --> ");
        for(int pos = 0; pos < vetor.length; pos++){
            vetorMais[pos] = vetor[pos] + vetorII[pos];
            System.out.print(vetorMais[pos] + ", ");
        }
        System.out.print("\nMultiplicação --> ");
        for(int pos = 0; pos < vetor.length; pos++){
            vetorMult[pos] = vetor[pos] * vetorII[pos];
            System.out.print(vetorMult[pos] + ", ");
        }
    }
}
