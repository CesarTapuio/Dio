
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

    //random
    private final Random random = new Random();
    int min = 10000;
    int max = 99999;
    private final int numero_conta = random.nextInt((max - min) + 1) + min;


    public void adicionarConta (){
        for(Conta conta : contas){
            if (conta.getNumero_conta() == numero_conta){ 
                aux = true;
            }

        }
    }
    
}
//System.out.println("Digite o nome do usuario:");
//nomeTitular = scanner.next();
//Conta newConta = new Conta(nomeTitular);
//contas.add(newConta);
