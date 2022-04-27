/*
 * Desenvolva um sistema que permite somar uma quantidade solicitada 
 * de números NÃO primos. Sendo assim, caso o usuário informe o número 
 * 10, deverão ser encontrados e somados ao total 10 números não primos.
 * A busca pelos números NÃO primos deve ser feita de forma incremental 
 * de um em um) a partir de um segundo valor informado pelo usuário. 
 * Cabe lembrar que um número primo é definido como um número natural 
 * (conjunto de números não negativos, isto é de 0 até o +∞) e que tem 
 * como divisores apenas o valor 1 e o próprio valor em avaliação 
 * resultando em resto zero.
 */
import java.util.Scanner;
public class questao4
{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int unPrimo, usValor;
        int nPrimo = 0, contador = 0;
        int nDivisores = 0;
        
        System.out.print("Informe o número de não primos: ");
        unPrimo = entrada.nextInt();
        
        System.out.print("Informe o valor base: ");
        usValor = entrada.nextInt();
        
        while(nPrimo < unPrimo){
            for(int i = 1; i < usValor; i++){
                if((unPrimo%i)==0){
                    nDivisores++;
                }
            }
            if(nDivisores > 2){
                contador = contador + usValor;
                nPrimo++;
        }
            usValor++;
        }
        System.out.println("O valor acumulado foi " + contador);
    }
}
