/**
 * Faça um programa para gerar números entre 0 e 99 de uma cartela de bingo. Sabendo que cada
 * cartela deverá conter 5 linhas de 5 números, gere estes dados de modo a não ter números
 * repetidos dentro das cartelas. O programa deve exibir na tela a cartela gerada.
 * 
 * VERSÃO DOIS
 */
import java.util.Random;
public class ex06v2
{
    public static void main(String[] args){
        Random ran = new Random();
        int cartelinhaDoBingo[][] = new int [5][5];
        int valoresDisponiveis[] = new int[100];
        int count = 0;
        
        for(int lin = 0; lin < cartelinhaDoBingo.length; lin++){
            for(int col = 0; col < cartelinhaDoBingo[lin].length; col++){
                int valor;
                valor = ran.nextInt(100);
                do{
                    valor = ran.nextInt(100);
                    count++;
                }while(valoresDisponiveis[valor] != 0);
                valoresDisponiveis[valor] = 1;
                cartelinhaDoBingo[lin][col] = valor;
            }
        }
        
        for(int lin = 0; lin < cartelinhaDoBingo.length; lin++){
            System.out.println();
            for(int col = 0; col < cartelinhaDoBingo[lin].length; col++){
                System.out.printf("%02d ", cartelinhaDoBingo[lin][col]);
            }
        }
        System.out.println("\nO número de vezes que o preenchimento rodou foi: " + count);
    }
}
