/*
 * Usando a linguagem de programação Java, codifique 
 * a expressão que segue (delta). Lembrese que cada variável 
 * pertencente a formulação deve ser informada pelo usuário 
 * e que somente valores inteiros
 * devem ser informados.
 */
import java.util.Scanner;
public class questao1
{
   public static void main(String[] args){
       Scanner entrada = new Scanner(System.in);
       int x, a, b, c;
       
       System.out.print("Informe o valor de a: ");
       a = entrada.nextInt();
       
       System.out.print("Informe o valor de b: ");
       b = entrada.nextInt();
       
       System.out.print("Informe o valor de c: ");
       c = entrada.nextInt();
       
       x = (b*b)-4*(a*c);
       
       System.out.println("O valor de x é: " + x);
   }
}
