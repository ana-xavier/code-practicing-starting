/**
 * Faça um programa que preenche uma matriz 4 x 4 com o produto do valor 
 * da linha e da coluna de cada elemento. Em seguida, imprima na tela a matriz.
 */
import java.util.Random;
public class ex02
{
    public static void main(String[] args){
        Random ran = new Random();
        int matriz [][] = new int [4][4];
        
        for(int lin = 0; lin < matriz.length; lin++){
            for(int col = 0; col < matriz[lin].length; col++){
                matriz[lin][col] = ran.nextInt(20);
            }
        }
        
        for(int lin = 0; lin < matriz.length; lin++){
            for(int col = 0; col < matriz[lin].length; col++){
                matriz[lin][col] = lin*col;
                System.out.println("L["+lin+"]; "+"C["+col+"]; Produto: " + matriz[lin][col]);
            }
        }
    }
}
