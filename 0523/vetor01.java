import java.util.Scanner;
public class vetor01
{
    public static void main(String[] args){
        int[] vetor = new int[5];
        Scanner entrada = new Scanner(System.in);
        
        for(int i = 0; i < vetor.length; i++){
            System.out.print("Informe um valor para ser armazenado: ");
            int valor = entrada.nextInt();
            vetor[i] = valor;
        }
        
        System.out.println("O valor contido no vetor é:");
        for(int i = 0; i < vetor.length; i++){
            System.out.println("  vetor["+i+"]: "+vetor[i]);
        }
    }
}
