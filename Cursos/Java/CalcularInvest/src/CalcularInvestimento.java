import java.util.Scanner;

public class CalcularInvestimento{

    public static void main(String[] args) {
        
        float valorInicial;
        float valorMensal;
        float valorFinal;
        float juros;
        int mesesInvest;

        Scanner scanner = new Scanner(System.in);

        

        
            System.out.println("Valor investido:");
            valorInicial = scanner.nextFloat();

            System.out.println("Valor despositado mensalmente:");
            valorMensal = scanner.nextFloat();

            System.out.println("Porcetagem dos juros:");
            juros = scanner.nextFloat()/100;

            System.out.println("Meses investidos:");
            mesesInvest = scanner.nextInt();

            valorFinal = valorInicial;

            for(int i = 0; i < mesesInvest; i++ ){

                valorFinal += valorMensal + (valorFinal*juros);

            }
            System.out.println("\nValor Final: R$ " + valorFinal);


        

        



    }

}