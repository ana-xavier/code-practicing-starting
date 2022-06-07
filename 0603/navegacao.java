import java.util.Scanner;
public class navegacao
{
    public static void main(String[] args){
        int [][] matriz;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe a dimensão da matriz: ");
        int tamMat = entrada.nextInt();
        
        matriz = new int [tamMat][tamMat]; //primeira dimensão armazena vetores e a segunda dimensão armazena os valores dos vetores.
        
        for(int lin=0; lin<matriz.length; lin++)
          for(int col=0; col<matriz[lin].length; col++)
              matriz[lin][col] = lin+col;
        
        for(int lin=0; lin<matriz.length; lin++)
          for(int col=0; col<matriz[lin].length; col++)
                System.out.println("mat["+lin+"]["+col+"]: "+matriz[lin][col]);
    }
}
