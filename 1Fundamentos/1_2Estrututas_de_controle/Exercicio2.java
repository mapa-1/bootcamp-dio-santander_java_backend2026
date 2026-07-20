import java.util.Scanner;

//crie um programa que calcula o imc do usuario -> peso / (alt*alt)

public class Exercicio2{
    public static void main(String[] args) {
        double peso;
        double altura;
        double imc;

        Scanner in = new Scanner(System.in);

        System.out.println("*** Calculadora de IMC ***");

        System.out.println("Digite seu peso: ");
        peso = in.nextDouble();

        System.out.println("Digite sua altura: ");
        altura = in.nextDouble();

        imc = peso / (altura*altura);

        System.out.println("Seu IMC é: " + imc);
        in.close();
    }
}