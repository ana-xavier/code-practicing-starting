/**
 * "Calculadora para operações: fatorial, verificação se é primo e somatório"
 * 
 * @param informando o valor igual a alguma das opções disponiveis
 * @return retorna o valor final da operação selecionada
 */

import java.util.Scanner;
public class calculadoraOp
{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int escolha, resultado, valor;
        do{
            //Mostrar opções
            escolha = todasOpcoes();
            // Caso a opção for válida:
            if(escolha != 0){
                System.out.print("Informe um valor: ");
                valor = entrada.nextInt();
                switch(escolha){
                    case 1: //fatorial
                        resultado = fatorial(valor);
                        System.out.println("Fatorial de "+valor+" é "+resultado);
                        break;
                    case 2: //primo
                        System.out.print("O valor "+valor);
                        if(ehPrimo(valor)){
                            System.out.println(" é primo");
                        }else{
                            System.out.println(" não é primo");
                        }
                        break;
                    case 3: //somatorio
                        resultado = somatorio(valor);
                        System.out.println("Somatório de "+valor+" é "+resultado);
                        break;
                    default:
                    System.out.println("A opção "+escolha+" não é válida");
                }
            }
        }while(escolha != 0);
        
    }
    
    public static int todasOpcoes(){
        Scanner localUsr = new Scanner(System.in);
        int usrOpcao;
        
        do{
        System.out.println("*****************");
        System.out.println("*     Opções    *");
        System.out.println("* 1 - Fatorial  *");
        System.out.println("* 2 - É primo?  *");
        System.out.println("* 3 - Somatório *");
        System.out.println("* 0 - Sair      *");
        System.out.println("*****************");
        System.out.println("Qual sua opção desejada? ");
        
        usrOpcao = localUsr.nextInt();
        
        if((usrOpcao >= 0) && (usrOpcao <= 3)){
            return usrOpcao;
        } else {
            System.out.println("VOCÊ SELECIONOU UMA OPÇÃO INVALIDA");
        }
    }while(true); // ((usrOpcao<0) || (usrOpcao > 3)); //  !(usrOpcao >= 0) && (usrOpcao <= 3);
    }
    
    public static int fatorial(int este){
        int calculo = 1;
        while(este > 1){
            calculo = calculo*este;
            este--;
        }
        return calculo;
    }
    
    public static boolean ehPrimo(int este){
        int valorInvestigado = este;
        int divisor = 1, nroDivisores = 0;
        boolean resultado = false;
        
        while(divisor <= valorInvestigado || divisor <= 0){
            if((valorInvestigado%divisor) == 0){
                nroDivisores++;
            }
            divisor++;
        }
        if(nroDivisores == 2){
            resultado = true;
        }else{
            resultado = false;
        }return resultado;
    }
    
    public static int somatorio(int este){
        int calculo = 0;
        while(este > 0){
            calculo += este;
            este--;
        }
        return calculo;
    }
}
