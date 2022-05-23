/*
 *  Faça um método que recebe por parâmetro o raio de uma esfera e 
 *  calcula o seu volume (v =4/3 * P * R3).
 */
import java.util.Scanner;
public class ex1
{
    public static void main(String[] agrs){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o valor do raio: ");
        double r = entrada.nextDouble();
        
        double v = volume(r);
        
        System.out.printf("O valor do volume da esfera é: %.2f\n", v);
    }
    public static double volume(double r){
        r = Math.pow(r, 3);
        double resultado = (Math.PI * r);
        resultado = 4.0/3.0 * resultado;
        return resultado;
    }
}
