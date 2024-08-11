
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//- Atributos: lista de contas.
//- Métodos: adicionar conta, remover conta, depositar dinheiro em uma conta, sacar dinheiro de uma conta, listar todas as contas e seus saldos.

public class Banco {
    private List <Conta> contas = new ArrayList<>();
    private String nomeTitular;
    private final Scanner scanner = new Scanner(System.in);

    //auxiliares
    private boolean aux = false;
    private boolean aux2 = false;
    private int i;

    //randomizar numero da conta
    private final Random random = new Random();
    int min = 10000;
    int max = 99999;
    private int numero_conta = random.nextInt((max - min) + 1) + min;


    public void adicionarConta (){

        //verificar o numero randomizado da conta
        while(true){
            for(Conta conta : contas){
                if (conta.getNumero_conta() == numero_conta){ 
                    aux = true;
                    numero_conta = random.nextInt((max - min) + 1) + min;
                }
            }
            if (aux != true){
                //criar conta
                System.out.println("Digite o nome do usuario:");
                nomeTitular = scanner.next();
                System.out.println("Digite o CPF: ");
                Conta newConta = new Conta(nomeTitular, numero_conta, scanner.next());
                contas.add(newConta);
                System.out.println("\nSeu numero de conta é: " + numero_conta + ". Nao o perca, use-o para depositar ou sacar\n");
                break;
            }

        }
    }
    
    public void depositar(){

        while(true){
            System.out.println("Numero da conta:");
            i = scanner.nextInt();

            for (Conta conta : contas){

                if (conta.getNumero_conta() == i){
                    System.out.println("Digite o valor do deposito:");
                    conta.depositar(scanner.nextInt());
                    aux2 = true;
                    break;
                }
            }
            if (aux2 == false){
                System.out.println("Numero de conta não encontrado\n[1] Tentar novamente\n[2] Finalizar");
                i = scanner.nextInt();
                if (i == 2){
                    break;
                }
            }
        }
    }

    public void sacar(){


    }
}
