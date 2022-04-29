import java.util.Scanner;
public class ex1
{
    public static void main(String[] args){
        double TC, TF;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe a temperatura em C°: ");
        TC = entrada.nextDouble();
        TF = (9*TC/5)+32;
        
        System.out.println("A temperatura em F° é: " + TF);
    }
}
