public class Racional {

    private int numerador;
    private int denominador;

    public Racional() {

    }

    public Racional(int n, int d) {
        this.numerador = n;
        this.denominador = d;
    }

    public int getNumerador() {
        return this.numerador;
    }
    public int getDenominador() {
        return this.denominador;
    }

    public static Racional somar(Racional n1, Racional n2) {
        int somaNum = (n1.numerador * n2.denominador + n2.numerador * n1.denominador);
        int somaDen = (n1.denominador * n2.denominador);
        return new Racional(somaNum, somaDen);
    }

    public static Racional subtrair(Racional n1, Racional n2) {
        int subNum = (n1.numerador * n2.denominador - n2.numerador * n1.denominador);
        int subDen = (n1.denominador * n2.denominador);
        return new Racional(subNum, subDen);
    }

    public static Racional multiplicar(Racional n1, Racional n2) {
        int multNum = (n1.numerador * n2.numerador);
        int multDen = (n1.denominador * n2.denominador);
        return new Racional(multNum, multDen);
    }

    public static Racional dividir(Racional n1, Racional n2) {
        int divNum = (n1.numerador * n2.denominador);
        int divDen = (n1.denominador * n2.numerador);
        return new Racional(divNum, divDen);
    }

    public double valorDouble(Racional n) {
        double num = (double) n.getNumerador() / (double) n.getDenominador();
        return num;
    }

}
