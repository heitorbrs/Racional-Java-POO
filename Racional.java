public class Racional {

    private int numerador;
    private int denominador;
    private double resultado;

    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    //métodos getters
    public int getNumerador() {
        return numerador;
    }
    public int getDenominador() {
        return denominador;
    }
    public double getResultado() {
        return resultado;
    }

    //métodos setters
    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }
    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    Racional n1, n2;

    public static Racional somar(Racional n1, Racional n2) {
        int numerador = (n1.numerador * n2.denominador + n2.numerador * n1.denominador);
        int denominador = (n1.denominador * n2.denominador);
        return new Racional(numerador, denominador);
    }

    public static Racional subtrair(Racional n1, Racional n2) {
        int numerador = (n1.numerador * n2.denominador - n2.numerador * n1.denominador);
        int denominador = (n1.denominador * n2.denominador);
        return new Racional(numerador, denominador);
    }

    public static Racional multiplicar(Racional n1, Racional n2) {
        int numerador = (n1.numerador * n2.numerador);
        int denominador = (n1.denominador * n2.denominador);
        return new Racional(numerador, denominador);
    }

    public static Racional dividir(Racional n1, Racional n2) {
        int numerador = (n1.numerador * n2.denominador);
        int denominador = (n1.denominador * n2.numerador);
        return new Racional(numerador, denominador);
    }

    public String toString(){
        return this.numerador + "/" + this.denominador;
    }

    public double valorDouble() {
        int numerador = this.numerador;
        int denominador = this.denominador;
        this.resultado = (double) numerador / denominador;
        return resultado;
    }

}
