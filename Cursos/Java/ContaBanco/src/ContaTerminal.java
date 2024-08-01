import java.util.Scanner;

public class ContaTerminal{

    public static void main(String[] args) {
        
        int conta;
        int agencia;
        String nomeCliente;
        float saldo;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome completo: ");
        nomeCliente = scanner.next();

        System.out.println("Numero da conta: ");
        conta = scanner.nextInt();

        System.out.println("Numero da agencia: ");
        agencia = scanner.nextInt();

        System.out.println("Saldo: ");
        saldo = scanner.nextFloat();


        System.out.println("Nome: "+ nomeCliente);
        System.out.println("Numero da conta: "+ conta);
        System.out.println("Numero da agencia: "+ agencia);
        System.out.println("Saldo: "+ saldo);
    }

        



        

        
}