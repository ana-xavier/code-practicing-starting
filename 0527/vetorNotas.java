import java.util.Scanner;
import java.util.Random;
public class vetorNotas
{
    public static void main(String[] args){
      Scanner entrada = new Scanner(System.in);
      Random ran = new Random();
        
      System.out.print("Informe a quantidade de alunos avaliados: ");
      int qtAlunos = entrada.nextInt();
        
      double vNotas[] = new double [qtAlunos];
        
      for(int pos = 0; pos < vNotas.length; pos++){
          vNotas[pos] = ran.nextDouble()*10;
       }
       
      double notaTotal = 0;
      for(double notaAtual: vNotas){
          notaTotal = notaAtual + notaTotal;
      }
      double media = notaTotal/qtAlunos;
      int acimaMedia = 0;
      for(double notaObservada: vNotas){
         if(notaObservada > media){
             acimaMedia++;
         }
      }
      
      System.out.println("O número de notas acima da média das notas é " + acimaMedia);
      System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
      System.out.println("A média das notas foi: " + media);
      for(int pos = 0; pos < qtAlunos; pos++){
          if(vNotas[pos] > acimaMedia){
              System.out.print("1 - ");
          }else{
              System.out.print("0 - ");
          }
          System.out.println("vet["+pos+"]: " +vNotas[pos]);
      }
    }
}
