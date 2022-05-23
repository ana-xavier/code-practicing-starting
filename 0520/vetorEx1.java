import java.util.Scanner;
public class vetorEx1
{
   public static void main(String[] ags){
       Scanner entrada = new Scanner(System.in);
       
       int [] vetor;
       vetor = new int [10];
       
       do{
           System.out.println("Menu de opções:");
           System.out.println("--> 0 - Sair do programa");
           System.out.println("--> 1 - Ler uma posição");
           System.out.println("--> 2 - Escrever em uma posição");
           System.out.print("Informe a opção: ");
           int opcao = entrada.nextInt();
           
           int pos;
           
           switch(opcao){
               case 1:
                   System.out.print("Informe a posição a ser lida: ");
                   pos = entrada.nextInt();
                   if(pos>=0 && pos < vetor.length){
                       System.out.println("O vetor da posição "+pos+" é "+vetor[pos]);
                   }else{
                       System.out.println("A posição "+pos+" não é válida"); 
                   }
                   break;
               case 2:
                   System.out.print("Informe a posição a ser escrita: ");
                   pos = entrada.nextInt();
                   if(pos>=0 && pos < vetor.length){
                       System.out.println("O vetor da posição "+pos+" é "+vetor[pos]);
                       System.out.print("Informe o valor a ser escrito: ");
                       
                   }
                   
                   break;
               default:
                   opcao = 0;
                   break;
           }
       }while(true);
       
       System.out.println("Saindo do programa");
   }
}
