import java.util.Scanner;

public class ContaTerminal{

    public static void main(String[] args) {
        
        int conta;
        int agencia;
        String nomeCliente;
        float saldo;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nomeCliente = scanner.next();

        System.out.println("Numero da conta: ");
        conta = scanner.nextInt();

        System.out.println("Numero da agencia: ");
        agencia = scanner.nextInt();

        System.out.println("Saldo: ");
        saldo = scanner.nextFloat();


        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: " + conta + " e seu saldo: " + saldo + " já está disponível para saque");
       

    }



        

        
}