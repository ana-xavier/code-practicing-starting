/*Lhe foi solicitada o desenvolvimento de um programa que auxilie 
 * clientes de uma loja de construção a escolher o piso que irão 
 * adquirir. Para isto, o programa deve receber 3 informações que 
 * são: (a) a área total a ser coberta em m2 (e.g. 100m2), (b) o 
 * tamanho de cada peça do piso em m2 (e.g. 0,5m2) e (c) o valor 
 * unitário de cada peça em reais (e.g. R$ 1,99). Como resultado, o 
 * cliente precisa saber a quantidade de peças que serão necessárias 
 * e o valor total a ser pago.
 */
import java.util.Scanner;
public class questao3
{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double areaTotal, tamPeca, valorUnit;
        double qtdPecas, valorTotal;
        
        System.out.print("Insira a área total: ");
        areaTotal = entrada.nextDouble();
        
        System.out.print("Insira o tamanho de cada peça: ");
        tamPeca = entrada.nextDouble();
        
        System.out.print("Insira o valor unitário de cada peça: ");
        valorUnit = entrada.nextDouble();
        
        qtdPecas = areaTotal/tamPeca;
        valorTotal = qtdPecas*valorUnit;
        
        System.out.printf("A quantidade de peças necessárias será %.2f\n", qtdPecas);
        System.out.printf("O valor total será: %.2f\n", valorTotal);
    }
}
