/**
 *  Ler um vetor com 10 valores, após pedir que o usuário digite um 
 *  número qualquer. Escrever a mensagem “ACHEI”, se o número estiver
 *  armazenado no vetor ou “NÃO ACHEI” caso contrário
 */
import java.util.Scanner;
import java.util.Random;
public class ex04
{
    public static void main(String[] args){
        int vetor [] = new int[10];
        Scanner entrada = new Scanner(System.in);
        Random ran = new Random();
        
        System.out.println("Valores do Vetor");
        for(int pos = 0; pos < vetor.length; pos++){
            vetor[pos] = ran.nextInt(100);
            System.out.println("Vetor["+pos+"]: --> " + vetor[pos]);
        }
        
        System.out.print("Informe um valor: ");
        int valorInf = entrada.nextInt();
        boolean verifica = false; 
        for(int pos = 0; pos < vetor.length; pos++){
            if(vetor[pos] == valorInf)
                verifica = true;
        }
        
        if(verifica == true){
            System.out.println("Achei :)");
        }else{
            System.out.println("Não achei :(");
        }
    }
}
