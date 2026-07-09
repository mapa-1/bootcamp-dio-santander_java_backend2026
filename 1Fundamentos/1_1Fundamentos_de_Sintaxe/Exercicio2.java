import java.util.Scanner;

/*
*Escreva um programa que receba a medida do lado de um quadrado,
* calcule sua area e exiba na tela
*/


public class Exercicio2 {

    public static void main(String[] args) {
    double lado, area;
    Scanner in = new Scanner(System.in);
    
    System.out.println("Informe a medida do lado do quadrado:");
    lado = in.nextDouble();
    area = Math.pow(lado, 2);

    System.out.println("A área do quadrado é: " + area);

    in.close();
    }
    
}