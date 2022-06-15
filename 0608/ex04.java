/**
 * Leia uma matriz 5 x 5. Leia também um valor X. O programa deverá fazer a busca desse valor 
 * na matriz e, ao final, escrever a localização (linha e coluna) ou uma mensagem 
 * de “NÃO ENCONTRADO"
 */
import java.util.Random;
import java.util.Scanner;
public class ex04
{
    public static void main(String[] args){
        Random ran = new Random();
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int[5][5];
        
        for(int lin = 0; lin < matriz.length; lin++){
            System.out.println();
            for(int col = 0; col < matriz[lin].length; col++){
                matriz[lin][col] = ran.nextInt(20);
                System.out.printf("%02d ", matriz[lin][col]);
            }
        }
        System.out.print("\nInforme um valor no qual deseja ser encontrado: ");
        int x = entrada.nextInt();
        
        boolean aux = false;
        for(int lin = 0; lin < matriz.length; lin++){
            for(int col = 0; col < matriz[lin].length; col++){
                if(matriz[lin][col] == x){
                    System.out.println("L["+lin+"]; C["+col+"]: Valor desejado: " + matriz[lin][col]); //considere qu as linhas e colunas começam em 0
                    aux = true;
                }
            }
        }
        if(aux == false){
            System.out.println("Não encontrado :(");
        }
    }
}