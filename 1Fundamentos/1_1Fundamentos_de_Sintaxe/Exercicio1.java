import java.util.Scanner;

//escreva um programa que receba o noma e o ano de nascimento de alguém
//e imprima na tela a seguinte mensagem: 
//"Olá, Fulano. você tem X anos!"

public class Exercicio1 {
    public static void main(String[] args) {
        String nome;
        int idade;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = in.nextLine();

        System.out.println("Digite sua idade: ");
        idade = in.nextInt();

        System.out.println
        ("Olá, " + nome + ". Você tem " + idade + " anos!");

        in.close();
    }
}
