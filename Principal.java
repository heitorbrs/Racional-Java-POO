import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in); 

        System.out.println("----------------------");
        System.out.print("1º numerador: ");
        int numerador1 = teclado.nextInt();
        System.out.print("1º denominador: ");
        int denominador1 = teclado.nextInt();
        System.out.print("2º numerador: ");
        int numerador2 = teclado.nextInt();
        System.out.print("2º denominador: ");
        int denominador2 = teclado.nextInt();

        teclado.close();

        Racional r1 = new Racional(numerador1, denominador1);
        Racional r2 = new Racional(numerador2, denominador2);

        System.out.println("----------------------");

        Racional somar = Racional.somar(r1, r2);
        System.out.println("SOMA: " + somar + " = " + somar.valorDouble());

        Racional subtrair = Racional.subtrair(r1, r2);
        System.out.println("SUBTRACAO: " + subtrair + " = " + subtrair.valorDouble());

        Racional multiplicar = Racional.multiplicar(r1, r2);
        System.out.println("MULTIPLICACAO: " + multiplicar + " = " + multiplicar.valorDouble());

        Racional dividir = Racional.dividir(r1, r2);
        System.out.println("DIVISAO: " + dividir + " = " + dividir.valorDouble());

        System.out.println("----------------------");
   
    }
}
