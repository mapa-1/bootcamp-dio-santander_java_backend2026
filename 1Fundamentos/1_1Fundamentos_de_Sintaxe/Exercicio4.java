import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        String nome1;
        String nome2;
        int idade1;
        int idade2;
        
        
        System.out.println("Informe o nome da primeira pessoa: ");
        nome1 = in.nextLine();
        System.out.println("Informe a idade da primeira pessoa");
        idade1 = in.nextInt();

        System.out.println("Informe o nome da segunda pessoa: ");
        nome2 = in.next();
        //in.nextLine(); //correcao de ScannerBug (prox linha)
        System.out.println("Informe a idade da segunda pessoa");
        idade2 = in.nextInt();
        
        int difIdade;

        /*verificacao do caso da segunda pessoa ter 
        *idadade maior que a primeira
        */
        if(idade1 > idade2){
            difIdade = idade1 - idade2;
            System.out.println(nome1  + " é mais velho(a) por " + difIdade + " anos.");            
        }else if(idade2 > idade1){
            difIdade = idade2 - idade1;
            System.out.println(nome2 + " é mais velho(a) por " + difIdade + " anos.");
        }

        in.close();
    }
}
