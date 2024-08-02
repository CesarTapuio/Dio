
import java.util.Scanner;


public class Candidato {

    String nome;
    int idade;
    float pretencaoSalario;
    String telefone;

    Scanner scanner = new Scanner(System.in);

    public void informacoesCandidato(){

        System.out.println("Nome do candidato:");

        nome = scanner.next();

        System.out.println("Idade do candidato:");

        idade = scanner.nextInt();

        System.out.println("Pretencao salarial:");

        pretencaoSalario = scanner.nextFloat();

        System.out.println("Telefone do candidato");

        telefone = scanner.next();

    }





    
}
