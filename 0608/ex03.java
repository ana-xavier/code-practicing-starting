
/**
 * Leia uma matriz 4 x 4, imprima a matriz e retorne a localização (linha e a coluna) 
 * do maior valor.
 */
import java.util.Random;
public class ex03
{
    public static void main(String[] args){
        Random ran = new Random();
        int matriz [][] = new int [4][4];
        
        for(int lin = 0; lin < matriz.length; lin++){
            for(int col = 0; col < matriz[lin].length; col++){
                matriz[lin][col] = ran.nextInt(20);
            }
        }
        
        int linMaior = 0;
        int colMaior = 0;
        for(int lin = 0; lin < matriz.length; lin++){
            for(int col = 0; col < matriz[lin].length; col++){
                if(matriz[linMaior][colMaior] < matriz[lin][col]){
                    linMaior = lin;
                    colMaior = col;
                }
            }
        }
        System.out.println("O maior valor é: "+matriz[linMaior][colMaior]+" no qual está na localização linha: "+linMaior+" coluna: "+colMaior);
    }
}

