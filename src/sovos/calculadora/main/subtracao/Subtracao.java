package sovos.calculadora.main.subtracao;

public class Subtracao {
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

    public void subtraiValores() {
        setResultado(getValor1() - getValor2());

    }



    public void subtraiValores(int valor1, int valor2){
        setResultado(valor1 - valor2);
    }

    public int subtraiValores(int valor1){
        return valor1 - valor2;
    }


}
