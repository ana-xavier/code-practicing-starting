
/**
 * Leia duas matrizes 4 x 4 e escreva uma terceira com os maiores valores de cada posição das matrizes lidas.
 */
import java.util.Random;
public class ex05
{
    public static void main(String[] args){
        Random ran = new Random();
        int matrizI [][] = new int[4][4];
        int matrizII [][] = new int[4][4];
        int matrizIII [][] = new int[4][4];
        
        for(int lin = 0; lin < matrizI.length; lin++){
            System.out.println();
            for(int col = 0; col < matrizI[lin].length; col++){
                matrizI[lin][col] = ran.nextInt(20);
                System.out.printf("%02d ",matrizI[lin][col]);
                
            }
        }
        System.out.println();
        for(int lin = 0; lin < matrizII.length; lin++){
            System.out.println();
            for(int col = 0; col < matrizII[lin].length; col++){
                matrizII[lin][col] = ran.nextInt(20);
                System.out.printf("%02d ",matrizII[lin][col]);
            }
        }
        System.out.println();
        for(int lin = 0; lin < matrizIII.length; lin++){
            for(int col = 0; col < matrizII[lin].length; col++){
                if(matrizI[lin][col] < matrizII[lin][col]){
                    matrizIII[lin][col] = matrizII[lin][col];
                }else{
                    matrizIII[lin][col] = matrizI[lin][col];
                }
            }
        }
        for(int lin = 0; lin < matrizIII.length; lin++){
            System.out.println();
            for(int col = 0; col < matrizIII[lin].length; col++){
                System.out.printf("%02d ",matrizIII[lin][col]);
            }
        }
    }
}
