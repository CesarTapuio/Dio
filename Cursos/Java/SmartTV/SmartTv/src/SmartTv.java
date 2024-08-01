
import java.util.Scanner;

public class SmartTv {

    static boolean ligada;
    static int canal;
    static int volume;

    public static void Ligar(){

        Scanner scanner = new Scanner(System.in);

        // int variavel = scanner.nextInt()
        // scanner close()

        System.out.println("\n[1] Ligar\n[2] Desligar");
        int aux = scanner.nextInt();

        if (aux == 1){
            ligada = true;
        }
        else if(aux == 2){
            ligada = false;
        }
    }
    public static void TrocarCanal(){

        System.out.println("Canal:");
        int canal = scanner.nextInt();
    }
    public static void Volume(){
        System.out.println("Volume:");
        int volume = scanner.nextInt();
        

        }
    

}
