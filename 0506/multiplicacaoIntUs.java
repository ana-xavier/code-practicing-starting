import java.util.Scanner;
public class multiplicacaoIntUs
{
    public static void main(String[] args){
            Scanner entrada = new Scanner(System.in);
            System.out.print("int a: ");
            int a = entrada.nextInt();
            System.out.print("int b: ");
            int b = entrada.nextInt();
            int res = multInt(a, b);
            
            System.out.println("O resultado da multiplicação é: " + res);
            }
    
    public static int multInt(int a, int b){
        int resultado = 0;
        for(int i =0; i < a; i++){
            resultado = resultado + b;
        }
        return resultado;
    }
}