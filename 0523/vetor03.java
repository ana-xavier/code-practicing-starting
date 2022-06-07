import java.util.Scanner;
import java.util.Random;
public class vetor03
{
    public static void main(String [] args)
    {
        int vetorOrigem [], vetorDestino [], tamVet;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o tamanho do vetor: ");
        tamVet = entrada.nextInt();
        
        Random rd = new Random();
        
        vetorOrigem = new int[tamVet];
        
        for(int pos=0; pos<vetorOrigem.length; pos++)
            vetorOrigem[pos]=rd.nextInt(10);
            
        System.out.println("Os valores contidos no vetor origem são: ");
        for(int pos=0; pos<vetorOrigem.length; pos++)
            System.out.println("  vo["+pos+"]="+vetorOrigem[pos]);
            
        System.out.println("Clonando os valores contidos no vetor origem são: ");
        vetorDestino = new int[vetorOrigem.length];

        for(int pos=0; pos<vetorDestino.length; pos++)
        {
            System.out.println("  vd["+pos+"] tinha "+vetorDestino[pos]+" --> agora tem "+vetorOrigem[pos]);
            vetorDestino[pos]=vetorOrigem[pos];
        }
            

        System.out.println("Comparando os vetores vo("+vetorOrigem+") e vd("+vetorDestino+"): ");
        for(int pos=0; pos<vetorDestino.length; pos++)
            System.out.println("  vo["+pos+"] tem "+vetorOrigem[pos]+" --> vd["+pos+"] tem"+vetorDestino[pos]);
            
        vetorOrigem[1] = 1234;
 
        System.out.println("Modificando o valor da posição 3 do vo para 1234: ");
        for(int pos=0; pos<vetorDestino.length; pos++)
            System.out.println("  vo["+pos+"] tem "+vetorOrigem[pos]+" --> vd["+pos+"] tem"+vetorDestino[pos]);
    }
}