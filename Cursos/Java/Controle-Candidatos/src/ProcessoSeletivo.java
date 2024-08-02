
import java.util.Scanner;

public class ProcessoSeletivo {
    @SuppressWarnings("null")
    public static void main(String[] args) throws Exception {

        float salario = 2000;
        int i = 0;
        int j = 0;
        int aux;
        String [] candidatosAptos = new String[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos candidatos serao analisados?");
        aux = scanner.nextInt();
        

        Candidato[] candidatos = new Candidato[aux];

        while(aux > i){

        candidatos[i] = new Candidato();

        candidatos[i].informacoesCandidato();
        boolean aptidao = analisarCandidato(candidatos[i].telefone, candidatos[i].pretencaoSalario, salario);

        if (aptidao == true && j < 5){
            candidatosAptos[j] = "Nome:" + candidatos[i].nome + "----- Telefone:" + candidatos[i].telefone + "\n";
            j++;
        } else if (j >= 5){
            break;
        }
        i++;
        
    }

        i = 0;

        while(i < j){
            System.out.println("Candidatos selecionados:\n");
            System.out.println(candidatosAptos[i]);
            i++;
        }


    }

    static boolean analisarCandidato(String telefone, float pretencaoSalarial, float salario){

        if (pretencaoSalarial > salario){

            System.out.println("\nCandidato nao aprovado!\n");
            return false;

        }
        else if(pretencaoSalarial == salario){

            System.out.println("\nLigar para Candidato com contra proposta. Numero do Candidato: " + telefone + "\n");
            return true;
        }
        else{

            System.out.println("\nAguardando o resultado dos demais candidatos\n");
            return true;

        }



    }
}
