
public class vetorOrdem
{
    public static void main(String[] args){
        int vetor[] = {2, 37, 7, 3, 1, 5};
        
        for(int posA = 0; posA < vetor.length -1; posA++){
            for(int posB = 0; posB < vetor.length +1; posB++){
                if(vetor[posA] > vetor[posB]){
                    System.out.println("\n\nTroca de posições: " + posA +" <-> "+posB);
                    for(int val: vetor)
                        System.out.print(val + ", ");
                    int aux = vetor[posA];
                    vetor[posA] = vetor[posB];
                    vetor[posB] = aux;
                    System.out.println();
                    for(int val: vetor)
                        System.out.print(val + ", ");
                }
            }
            //System.out.println("posA["+posA+"] <=> posB["+posB+"]");
        }
    }
}
//insertion sort
//selection sort