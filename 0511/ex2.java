/*
 * Escreva um método que recebe as 3 notas de um aluno por parâmetro e uma letra. Se 
a letra for A o método calcula a média aritmética das notas do aluno, se for P, a sua 
média ponderada (pesos: 5, 3 e 2) e se for H, a sua média harmônica. A média calculada 
também deve retornar por parâmetro.
 */
import java.util.Scanner;
public class ex2
{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double n1, n2, n3;
        
        System.out.print("Informe a primeira nota o aluno: ");
        n1 = entrada.nextDouble();
        System.out.print("Informe a segunda nota o aluno: ");
        n2 = entrada.nextDouble();
        System.out.print("Informe a terceira nota o aluno: ");
        n3 = entrada.nextDouble();
        
        System.out.println("   Selecione uma opção: ");
        System.out.println("      A --> ARITMÉTICA ");
        System.out.println("      P --> PONDERADA (pesos: 5, 3 e 2)");
        System.out.println("      H --> HAMÔNICA ");
        
        System.out.print("   Escolha a média desejada: ");
        char escolha = entrada.next().toUpperCase().charAt(0);
        System.out.println("A escolha de média foi: " + escolha);
        
        double mediaNotas = media(n1, n2, n3, escolha);
        if(mediaNotas < 0){
            System.out.println("A média solicitada é inválida");
        }else{
            System.out.printf("A média das notas é %.2f\n", mediaNotas);
        }
        
        }
    public static double media(double n1, double n2, double n3, char escolha){
        double resultado;
        switch(escolha){
            case 'A':
                resultado = mediaAritmetica(n1,n2,n3);
                break;
            case 'P':
                resultado = mediaPonderada(n1,n2,n3);
                break;
            case 'H':
                resultado = mediaHarmonica(n1,n2,n3);
                break;
            default:
                resultado = -1;
                System.out.println("Média inválida");
        }
        return resultado;
    }
    public static double mediaAritmetica(double n1,double n2,double n3){
        double resultado;
        resultado = (n1+n2+n3)/3;
        return resultado;
    }
    public static double mediaPonderada(double n1,double n2,double n3){
        double resultado;
        resultado = (n1*5 + n2*3 + n3*2)/10;
        return resultado;
    }
    public static double mediaHarmonica(double n1,double n2,double n3){
        double resultado;
        resultado = 3.0/(((1/n1)+(1/n2)+(1/n3)));
        return resultado;
    }
}

