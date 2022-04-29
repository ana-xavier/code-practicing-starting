import java.util.Scanner;
public class ex4
{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int numero, digito, soma;
        System.out.print("Informe numero: ");
        numero = entrada.nextInt();
        digito = soma = 0;
        
        while(numero>0){
            digito = numero%10;
            if(digito%2 != 0){
                soma = soma + digito;
            }
            numero = numero - digito;
            numero = numero/10;
        }
        System.out.println("O resultado é: " + soma);
    }
}
