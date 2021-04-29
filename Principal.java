import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in); 

        System.out.println("----------------------");
        System.out.print("1º numerador: ");
        int num1 = teclado.nextInt();
        System.out.print("1º denominador: ");
        int den1 = teclado.nextInt();
        System.out.print("2º numerador: ");
        int num2 = teclado.nextInt();
        System.out.print("2º denominador: ");
        int den2 = teclado.nextInt();

        teclado.close();

        Racional r1 = new Racional(num1, den1);
        Racional r2 = new Racional(num2, den2);

        System.out.println("----------------------");

        Racional somar = Racional.somar(r1, r2);
        System.out.print("SOMA: " + somar.getNumerador());
        System.out.print("/" + somar.getDenominador());
        System.out.print(" = " + somar.valorDouble(somar) + "\n");

        Racional subtrair = Racional.subtrair(r1, r2);
        System.out.print("SUBTRACAO: " + subtrair.getNumerador());
        System.out.print("/" + subtrair.getDenominador());
        System.out.print(" = " + subtrair.valorDouble(subtrair) + "\n");

        Racional multiplicar = Racional.multiplicar(r1, r2);
        System.out.print("MULTIPLICACAO: " +  multiplicar.getNumerador());
        System.out.print("/" + multiplicar.getDenominador());
        System.out.print(" = " + multiplicar.valorDouble(multiplicar) + "\n");

        Racional dividir = Racional.dividir(r1, r2);
        System.out.print("DIVISAO: " +  dividir.getNumerador());
        System.out.print("/" + dividir.getDenominador());
        System.out.print(" = " + dividir.valorDouble(dividir) + "\n");

        System.out.println("----------------------");
   
    }
}
