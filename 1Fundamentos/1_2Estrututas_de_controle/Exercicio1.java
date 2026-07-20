import java.util.Scanner;


//escreva um programa onde o usuario informa um numero
// e eh exibida a tabuada desse numero
public class Exercicio1{
    public static void main(String[] args) {
        int numTab;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o número do qual deseja saber a tabuada: ");
        numTab = in.nextInt();

        System.out.println("A tabuada do nº" + numTab + " é: ");

        for(int i = 1; i <= 10; i++){
            System.out.println(numTab + "x" + i + "=" + numTab*i);
        }

        in.close();
    }
}