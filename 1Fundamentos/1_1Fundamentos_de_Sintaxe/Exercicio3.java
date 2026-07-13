import java.util.Scanner;

class Exercicio3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);        
        double baseB;
        double alturaH;
        
        System.out.println("Informe o valor da base do triângulo:");
        baseB = in.nextDouble();

        System.out.println("Informe o valor da altura do triângulo:");
        alturaH = in.nextDouble();

        double area = (baseB * alturaH) / 2;
        in.close();

        System.out.println("A área do triângulo é: " + area);
    }


}