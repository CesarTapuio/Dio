
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();
        

        //auxiliares
        int i;

        System.out.println("[1] Criar conta\n[2] Depositar");
        i = scanner.nextInt();

        if (i == 1){
            banco.adicionarConta();
        }

        

        
    }
}
