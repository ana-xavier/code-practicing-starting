/**
 * Gerar e imprimir uma matriz de tamanho 10 x 10, onde seus elementos são da forma:
 * A[i][j] = 2i + 7j − 2 se i < j;
 * A[i][j] = 3i2 − 1 se i = j;
 * A[i][j] = 4i3 − 5j2 + 1 se i > j.
 */
import java.util.Random;
public class ex07
{
    public static void main(String[] args){
        Random ran = new Random();
        int matriz [][] = new int[10][10];
        
        for(int lin = 0; lin < matriz.length; lin++){
            System.out.println();
            for(int col = 0; col < matriz[lin].length; col++){
                matriz[lin][col] = ran.nextInt(100);
                System.out.printf("%02d ", matriz[lin][col]);
            }
        }
        System.out.println("\n+++++++++++++++++++++++++++++");
        for(int lin = 0; lin < matriz.length; lin++){
            for(int col = 0; col < matriz[lin].length; col++){
                if(lin < col){
                    matriz[lin][col] = 2*lin + 7*col - 2;
                }else if(lin == col){
                    matriz[lin][col] = 3*lin*2 - 1;
                }else if(lin > col){
                    matriz[lin][col] = 4*lin*3 - 5*col*2 + 1;
                }
            }
        }
        for(int lin = 0; lin < matriz.length; lin++){
            System.out.println();
            for(int col = 0; col < matriz[lin].length; col++){
                System.out.printf("%02d ", matriz[lin][col]);
            }
        }
    }
}
