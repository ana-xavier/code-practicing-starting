public class multiplicacaoInt
{
    public static void main(String[] args){
        System.out.println("O resultado da multiplicação é: " + multInt(2, 10));
    }
    
    public static int multInt(int a, int b){
        int resultado = 0;
        for(int i =0; i < a; i++){
            resultado = resultado + b;
        }
        return resultado;
    }
}