//- Atributos: número da conta, nome do titular, saldo.
//- Métodos: getters e setters, método para depositar dinheiro, método para sacar dinheiro.
import java.util.Scanner;

//int min = 10;
//int max = 20;

//int randomIntInRange = random.nextInt((max - min) + 1) + min;

//Preciso colocar o random antes de entrar em Cont, pois preciso ver se não existe um numero de conta já existente

public class Conta{

    private String nomeTitular;
    private double saldo;
    private final Scanner scanner = new Scanner(System.in);
    private int numero_conta;
    private final String CPF;
    
    //auxiliares
    int i;

    public Conta (String nomeTitular, int numero_conta, String CPF){
    this.numero_conta = numero_conta;
    this.nomeTitular = nomeTitular;
    this.CPF = CPF;
    }

    public int getNumero_conta() {
        return this.numero_conta;
    }

    public String getNomeTitular() {
        return this.nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        System.out.println("Digite o nome do usuario:");
        this.nomeTitular = scanner.next();
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(int deposito){
        while(true){
            if(deposito > 0){
                saldo += deposito;
                System.out.println("\nDeposito efetuado com sucesso!\n");
                System.out.println("Saldo em conta : R$ " + saldo);
                break;
            }else{
                System.out.println("ERRO");
                System.out.println("[1] Tentar novamente\n[2] Finalizar");
                i = scanner.nextInt();
                if (i == 2){
                    break;
                }
            }
        }
    }

    public void sacar(int saque){
        while(true){
            if(saque > 0 && saque < saldo){
                saldo -= saque;
                System.out.println("\nSaque efetuado com sucesso!\n");
                System.out.println("Saldo em conta : R$ " + saldo);
                break;   
            }else{
                System.out.println("ERRO");
                System.out.println("[1] Tentar novamente\n[2] Finalizar");
                i = scanner.nextInt();
                if (i == 2){
                    break;
                }
                
            }
        }
    }



    
}
