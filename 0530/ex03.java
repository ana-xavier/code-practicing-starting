/**
 * Ler um vetor de 10 elementos inteiros e positivos. 
 * Criar um segundo vetor da seguinte forma:
       os elementos de índice par receberão os respectivos elementos 
       divididos por 2; 
       os elementos de índice ímpar receberão os respectivos elementos 
       multiplicados por 3. 
   Imprima os dois vetores.
 */
import java.util.Scanner;
public class ex03
{
    public static void main(String[] args){
        int vetor [] = new int[10];
        int vetorII [] = new int[10];
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Inserindo valores no vetor");
        for(int pos = 0; pos < vetor.length; pos++){
            System.out.print("   Informe o valor da posição " + pos + ": ");
            vetor[pos] = entrada.nextInt();
        }
        System.out.println("Vetor prenchido :D");
        
        for(int pos = 0; pos < vetor.length; pos++){
            int val = 0;
            if(pos % 2 == 0){
                val = vetor[pos]/2;
            }else{
                val = vetor[pos]*3;
            }
            vetorII[pos] = val;
        }
        System.out.println("Valores do vetor");
        System.out.print("\n                    ");
        for(int pos = 0; pos < vetor.length; pos++){
            System.out.printf("%02d, ",pos);
        }
        
        System.out.print("\nVetor Preenchido => ");
        for(int pos=0; pos<vetor.length; pos++){
            System.out.printf("%02d, ",vetor[pos]);
        }
        
        System.out.print("\nVetor Resultado  => ");
        for(int pos=0; pos<vetor.length; pos++){
            System.out.printf("%02d, ",vetorII[pos]);
        }
    }
}
