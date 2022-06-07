public class vetor02
{
    public static void main(String[] args){
        int[] resultado = {10,9,7,4,5};
        
        System.out.println("O conteudo do vetor é:");
        for(int pos = 0; pos < resultado.length; pos++){
            System.out.println("   v["+pos+"]: " +resultado[pos]);
        }
        
        int[] xuxuzito;
        
        xuxuzito = resultado;
        System.out.println("O conteudo do vetor xuxuzito é:");
        for(int pos = 0; pos < xuxuzito.length; pos++){
            System.out.println("   xxzt["+pos+"]: " +xuxuzito[pos]);
        }
        
        xuxuzito[1] = -135;
        xuxuzito[3] = 1234;
        
        System.out.println("Agora o conteúdo do vetor xuxuzito é:");
        for(int pos = 0; pos < xuxuzito.length; pos++){
            System.out.println("   xxzt["+pos+"]: " +xuxuzito[pos]);
        }
        
        System.out.println("Agora o conteúdo do vetor é:");
        for(int pos = 0; pos < resultado.length; pos++){
            System.out.println("   v["+pos+"]: " +resultado[pos]);
        }
    }
}
