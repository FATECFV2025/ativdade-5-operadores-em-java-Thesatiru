public class Operadores {
    public float adicao (float n1, float n2){
        return n1+n2;
    }
    public float subtracao(float n1, float n2){
        return n1-n2;
    }
    public float multiplicacao(float n1, float n2){
        return n1*n2;
    }
    public float divisao(float n1, float n2){
        return n1/n2;
    }

    public float operadorAtribuicaoAdi(float n1, float n2){
        return n1+=n2;
    }
    public float operadorAtribuicaoSub(float n1, float n2){
        return n1-=n2;
    }
    public float operadorAtribuicaoMult(float n1, float n2){
        return n1*=n2;
    }
    public float operadorAtribuicaoDiv(float n1, float n2){
        return n1/=n2;
    }

    public boolean operadorLogicoE(boolean v1, boolean v2){
        return v1 && v2;
    }
    public boolean operadorLogicoOr(boolean v1, boolean v2){
        return v1 || v2;
    }
    public boolean operadorLogicoNotV1(boolean v1){
        return !v1;
    }

    public boolean operadorComparacaoMaior(float n1, float n2){
        return n1 > n2;
    }
    public boolean operadorComparacaoMenor(float n1, float n2){
        return n1 < n2;
    }
    public boolean operadorComparacaoIgual(float n1, float n2){
        return n1 == n2;
    }
    public boolean operadorComparacaoDiferente(float n1, float n2){
        return n1 != n2;
    }

}
