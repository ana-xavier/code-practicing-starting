import java.util.Scanner;
public class bhaskara
{
    public static void main(String[] args){
        int a, b, c;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Resolvendo: ax^2 + bx = c");
        System.out.print(" Informe o valor de a: ");
        a = entrada.nextInt();
        System.out.print(" Informe o valor de b: ");
        b = entrada.nextInt();
        System.out.print(" Informe o valor de c: ");
        c = entrada.nextInt();
        
        double x1, x2;
        
        x1 = bhaskaraMais(a,b,c);
        x2 = bhaskaraMenos(a,b,c);
        
        System.out.printf("O valor de x1 é %.2f\n", x1);
        System.out.printf("O valor de x2 é %.2f\n", x2);
    }
    
    public static double bhaskaraMais(int a, int b, int c){
        double resultado = b*b;  // Math.pow(b,2);
        resultado = resultado - 4 * a * c;
        resultado = Math.sqrt(resultado);
        resultado = -(b) + resultado;
        resultado = resultado/(2*a);
        return resultado;
    }
    public static double bhaskaraMenos(int a, int b, int c){
        double resultado = b*b;  // Math.pow(b,2);
        resultado = resultado - 4 * a * c;
        resultado = Math.sqrt(resultado);
        resultado = -(b) - resultado;
        resultado = resultado/(2*a);
        return resultado;
    }
}

//Com o resultado sendo NaN (not a number), significa que a operação não é 
//possível para a representação escolhida.
