/**
 * Faça um programa para gerar números entre 0 e 99 de uma cartela de bingo. Sabendo que cada
 * cartela deverá conter 5 linhas de 5 números, gere estes dados de modo a não ter números
 * repetidos dentro das cartelas. O programa deve exibir na tela a cartela gerada.
 */
import java.util.Random;
public class ex06
{
    public static void main(String[] args){
        Random ran = new Random();
        int cartelinhaDoBingo[][] = new int [5][5];
        int count = 0;
        
        for(int lin = 0; lin < cartelinhaDoBingo.length; lin++){
            for(int col = 0; col < cartelinhaDoBingo[lin].length; col++){
                cartelinhaDoBingo[lin][col] = -1;
            }
        }
        
        for(int lin = 0; lin < cartelinhaDoBingo.length; lin++){
            for(int col = 0; col < cartelinhaDoBingo[lin].length; col++){
                boolean jaExiste;
                int valor = ran.nextInt(100);
                do{
                    jaExiste = false;
                    valor = ran.nextInt(100);
                    for(int linX = 0; linX < cartelinhaDoBingo.length; linX++){
                    for(int colX = 0; colX < cartelinhaDoBingo[linX].length; colX++){
                        count++;
                        if(cartelinhaDoBingo[linX][colX] == valor){
                            jaExiste = true;
                        }
                    }
                }
                }while(jaExiste);
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
