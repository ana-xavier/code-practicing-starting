import java.util.Random;
public class matrizesIntroducao
{
    public static void main(String[] args){
        Random ran = new Random();
        System.out.println("--> Vetor unidimensional");
        int [] vetor = new int [10];
        for(int pos = 0; pos < vetor.length; pos++){
            vetor[pos] = ran.nextInt(100);
        }
        for(int pos = 0; pos < vetor.length; pos++){
            System.out.println("vet["+pos+"]: "+vetor[pos]);
        }
        
        System.out.println("++++++++++++++++++++++++++++++++++"); 
        System.out.println("--> Vetor multidimensional pré definido");
        int [][] matriz = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        for(int lin = 0; lin < matriz.length; lin++){
            for(int col = 0; col < matriz[lin].length; col++){
                System.out.println("vetor ["+lin+"]["+col+"]: " +matriz[lin][col]);
            }
        }
        
        System.out.println("++++++++++++++++++++++++++++++++++");  
        System.out.println("--> Vetor multidimensional definfido randomicamento");
        int linha = 3;
        int coluna = 4;
        matriz = new int[linha][coluna];
        
        for(int lin = 0; lin < linha; lin++){
            for(int col = 0; col < coluna; col++){
                matriz[lin][col] = ran.nextInt(100);
            }
        }
        for(int lin = 0; lin < linha; lin++){
            for(int col = 0; col < coluna; col++){
                System.out.println("vetor ["+lin+"]["+col+"]: " +matriz[lin][col]);
            }
        }
    }
}
