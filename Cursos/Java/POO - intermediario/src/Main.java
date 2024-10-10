import java.util.Scanner;
/*
- Métodos:
  - `adicionarAluno(Aluno aluno)`: Adiciona um aluno à lista de alunos.
  - `removerAluno(String matricula)`: Remove um aluno da lista de alunos com base na matrícula.
  - `listarAlunos()`: Lista todos os alunos cadastrados.
  - `adicionarAtividade(Atividade atividade)`: Adiciona uma atividade à lista de atividades.
  - `removerAtividade(String nomeAtividade)`: Remove uma atividade da lista de atividades com base no nome.
  - `listarAtividades()`: Lista todas as atividades cadastradas.
  - `associarAtividadeAoAluno(String matricula, String nomeAtividade)`: Associa uma atividade a um aluno.
  - `listarAtividadesDoAluno(String matricula)`: Lista todas as atividades associadas a um aluno específico.
*/

public class  Main{
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        Academia academia = new Academia("SLA");

        while(true){
            
        System.out.println("\n[1] Adicionar Aluno\n[2] Remover Aluno\n[3] Listar Alunos\n[4] Adicionar Atividade\n[5] Remover Atividade\n[6] Listar Atividades\n[7] Associar Atividade ao Aluno\n[8] Listar Atividades do Aluno\n\n[0] Sair");
        int opcao = scanner.nextInt();


        if( opcao == 0){
            break;
        }

        if (opcao == 1){
            academia.adicionarAluno();
        }

    }

       
    }
}
