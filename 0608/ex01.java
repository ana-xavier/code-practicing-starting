/**
 * Leia uma matriz 4 x 4, conte e escreva quantos valores maiores que 10 ela 
 * possui
 */
import java.util.Random;
public class ex01
{
    public static void main(String[] args){
        Random ran = new Random();
        int matriz [][] = new int [4][4];
        
        for(int lin = 0; lin < matriz.length; lin++){
            for(int col = 0; col < matriz[lin].length; col++){
                //System.out.println("linha: "+lin+"; coluna: "+col);
                matriz[lin][col] = ran.nextInt(20);
            }
        }
        int contador = 0;
        for(int lin = 0; lin < matriz.length; lin++){
            for(int col = 0; col < matriz[lin].length; col++){
                if(matriz[lin][col] > 10){
                    contador++;
                }
            }
        }
        for(int lin = 0; lin < matriz.length; lin++){
            System.out.println();
            for(int col = 0; col < matriz[lin].length; col++){
                System.out.printf("%02d ",matriz[lin][col]);
            }
        }
        
        System.out.println("\n A quantidade de números com valor acima de 10 são: " + contador);
    }
}
