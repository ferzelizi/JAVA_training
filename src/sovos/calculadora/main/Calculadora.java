package sovos.calculadora.main;

import sovos.calculadora.main.soma.Soma;
import sovos.calculadora.main.subtracao.Subtracao;
import sovos.calculadora.main.multiplicacao.Multiplicacao;
import sovos.calculadora.main.divisao.Divisao;

public class Calculadora {

    public int nUm = 1;
    public int nDois = 2;
    public int nTres = 3;
    public int nQuatro = 4;
    private int nCinco = 5;
    private int nSeis = 6;
    private int nSete = 7;
    private int nOito = 8;
    private int nNove = 9;
    private String Resultado = "";

    public Calculadora(){}
    public Calculadora(int nCinco, int nSeis, int nNove){

        this.nCinco = nCinco;
        this.nSeis = nSeis;
        this.nNove = nNove;

    }
    public static void main(String[] args) {



        Calculadora calculadora = new Calculadora();
        System.out.println("Resultado da soma por Atributo: " + calculadora.getSomarAtributo(10,5));
        System.out.println("Resultado da soma por Parametro: " + calculadora.getSomarParametro(15,5));
        System.out.println("Resultado da soma por Atributo e Parametro: " + calculadora.getSomarAtribParam(20,5));


        System.out.println("Resultado da subtracao por Atributo: " + calculadora.getSubtracaoAtributo(10,5));
        System.out.println("Resultado da subtracao por Parametro: " + calculadora.getSubtracaoParametro(15,5));
        System.out.println("Resultado da subtracao por Atributo e Parametro: " + calculadora.getSubtracaoAtribParam(20,5));

        System.out.println("Resultado da multiplicacao por Atributo: " + calculadora.getMultiplicacaoAtributo(10,5));
        System.out.println("Resultado da multiplicacao por Parametro: " + calculadora.getMultiplicacaoParametro(15,5));
        System.out.println("Resultado da multiplicacao por Atributo e Parametro: " + calculadora.getMultiplicacaoAtribParam(20,5));

        System.out.println("Resultado da divisão por Atributo: " + calculadora.getDividirAtributo(10,5));
        System.out.println("Resultado da divisão por Parametro: " + calculadora.getDividirParametro(15,5));
        System.out.println("Resultado da divisão por Atributo e Parametro: " + calculadora.getDividirAtribParam(20,5));



    }

    //soma
    private int getSomarAtributo(int n, int n1) {
        Soma somatoria = new Soma();
        somatoria.setValor1(n);
        somatoria.setValor2(n1);
        somatoria.somaValores();
        return somatoria.getResultado();
    }

    private int getSomarParametro(int n,int n1){
        Soma somatoria = new Soma();
        somatoria.somaValores(n,n1);
        return somatoria.getResultado();
    }

    private int getSomarAtribParam(int n, int n1) {
        Soma somatoria = new Soma();
        somatoria.setValor2(n1);
        return somatoria.somaValores(n);
    }

    // subtrai
    private int getSubtracaoAtributo(int n, int n1) {
        Subtracao subtracao = new Subtracao();
        subtracao.setValor1(n);
        subtracao.setValor2(n1);
        subtracao.subtraiValores();
        return subtracao.getResultado();
    }

    private int getSubtracaoParametro(int n,int n1){
        Subtracao subtracao = new Subtracao();
        subtracao.subtraiValores(n,n1);
        return subtracao.getResultado();
    }

    private int getSubtracaoAtribParam(int n, int n1) {
        Subtracao subtracao = new Subtracao();
        subtracao.setValor2(n1);
        return subtracao.subtraiValores(n);
    }

    //multiplica
    private int getMultiplicacaoAtributo(int n, int n1) {
        Multiplicacao multiplicacao = new Multiplicacao();
        multiplicacao.setValor1(n);
        multiplicacao.setValor2(n1);
        multiplicacao.multiplicaValores();
        return multiplicacao.getResultado();
    }

    private int getMultiplicacaoParametro(int n,int n1){
        Multiplicacao multiplicacao = new Multiplicacao();
        multiplicacao.multiplicaValores(n,n1);
        return multiplicacao.getResultado();
    }

    private int getMultiplicacaoAtribParam(int n, int n1) {
        Multiplicacao multiplicacao = new Multiplicacao();
        multiplicacao.setValor2(n1);
        return multiplicacao.multiplicaValores(n);
    }

    //divide
    private int getDividirAtributo(int n, int n1) {
        Divisao divisao = new Divisao();
        divisao.setValor1(n);
        divisao.setValor2(n1);
        divisao.divideValores();
        return divisao.getResultado();
    }

    private int getDividirParametro(int n,int n1){
        Divisao divisao = new Divisao();
        divisao.divideValores(n,n1);
        return divisao.getResultado();
    }

    private int getDividirAtribParam(int n, int n1) {
        Divisao divisao = new Divisao();
        divisao.setValor2(n1);
        return divisao.divideValores(n);
    }

}


