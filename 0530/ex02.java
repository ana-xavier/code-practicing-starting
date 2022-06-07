/**
Ler um vetor de 10 elementos. Crie um segundo vetor, com todos os elementos na ordem
inversa, ou seja, o último elemento passará a ser o primeiro, o penúltimo será o segundo e assim
por diante. Imprima os dois vetores
 */
import java.util.Scanner;
public class ex02
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
            vetorII[(vetor.length-1)-pos] = vetor[pos];
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
        
        System.out.print("\nVetor Inverso    => ");
        for(int pos=0; pos<vetor.length; pos++){
            System.out.printf("%02d, ",vetorII[pos]);
        }
    }
}
