import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Operadores conta = new Operadores();

        System.out.println("O resultado é: "+conta.adicao(5,10));
        System.out.println("O resultado é: "+ conta.subtracao(5,10));
        System.out.println("O resultado é: "+conta.multiplicacao(5,10));
        System.out.println("O resultado é: "+conta.divisao(5,10));

        System.out.println("O resultado da atribuição é: "+ conta.operadorAtribuicaoAdi(5,20));
        System.out.println("O resultado da atribuição é: "+ conta.operadorAtribuicaoSub(5,20));
        System.out.println("O resultado da atribuição é: "+ conta.operadorAtribuicaoMult(5,20));
        System.out.println("O resultado da atribuição é: "+ conta.operadorAtribuicaoDiv(5,20));

        System.out.println("O resultado lógico é: "+ conta.operadorLogicoE(true,false));
        System.out.println("O resultado lógico é: "+ conta.operadorLogicoOr(true,true));
        System.out.println("O resultado lógico é: "+ conta.operadorLogicoNotV1(false));

        System.out.println("O resultado da comparação é: "+conta.operadorComparacaoMaior(20,30));
        System.out.println("O resultado da comparação é: "+conta.operadorComparacaoMenor(20,30));
        System.out.println("O resultado da comparação é: "+conta.operadorComparacaoIgual(20,20));
        System.out.println("O resultado da comparação é: "+conta.operadorComparacaoDiferente(20,30));
        }
    }

