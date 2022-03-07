package sovos.calculadora.main.divisao;

public class Divisao {
    private int valor1;
    private int valor2;
    private int resultado;

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public void divideValores() {
        setResultado(getValor1() / getValor2());

    }

    public void divideValores(int valor1, int valor2){
        setResultado(valor1 / valor2);
    }

    public int divideValores(int valor1){
        return valor1 / valor2;
    }

}
