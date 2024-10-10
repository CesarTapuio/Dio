import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
- Atributos: `nome`, `listaDeAlunos` (uma lista de objetos `Aluno`), `listaDeAtividades` (uma lista de objetos `Atividade`).
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
public class Academia {

    Scanner scanner = new Scanner(System.in);

    private String nomeAcademia;
    private List<Aluno> listaAlunos = new ArrayList<>();
    private List<Atividade> listaAtividade = new ArrayList<>();

    public Academia(String nomeAcademia){
        this.nomeAcademia = nomeAcademia;
        
    }

    public void adicionarAluno(){

    String matricula;
    int ano = 2022;
    Aluno aluno = new Aluno();

    System.out.println("\nDigite o nome do aluno:");
    aluno.setNome(scanner.next());
    System.out.println("\nDigite a idade do aluno:");
    aluno.setIdade(scanner.nextInt());
    System.out.println("\nDigite o peso do aluno em numero inteiro:");
    aluno.setPeso(scanner.nextInt());
    System.out.println("\nDigite a altura do aluno:");
    aluno.setAltura(scanner.nextFloat());

    matricula = Integer.toString(ano) + Integer.toString(listaAlunos.size() + 1);
    aluno.setMatricula(matricula);
    System.out.println("\nA matricula do aluno é:" + aluno.getMatricula());

    aluno.setMatriculaAtiva(true);

    listaAlunos.add(aluno);
    
    }
    
    //Não remove, apenas coloca o aluno com matricula desativada
    public void removerAluno(){
        String matriculaDesativada;

        System.out.println("\nDigite o numero da matricula que será desativada:");
        matriculaDesativada = scanner.next();

        for(Aluno aluno : listaAlunos){
            if(aluno.getMatricula().equals(matriculaDesativada)){
                aluno.setMatriculaAtiva(false);
                break;

            }
        }

    }

    public void listarAlunos(){

        for(Aluno aluno : listaAlunos){
            System.out.println("\nAluno: "+ aluno.getNome() + " - Matricula: " + aluno.getMatricula());
        }
    }

    public void adicionarAtividade(){

    Atividade atividade = new Atividade();

    System.out.println("\nDigite o nome da atividade:");
    atividade.setNome(scanner.next());
    System.out.println("\nDigite a duração da atividade(MINUTOS):");
    atividade.setDuracao(scanner.nextInt());
    System.out.println("\nDigite as calorias gastas:");
    atividade.setCaloriasGastas(scanner.nextFloat());

    listaAtividade.add(atividade);

    }

    public void removerAtividade(){

        String nomeAtividadeRemovida;
    
        System.out.println("\nDigite o nome da atividade que será removida:");
        nomeAtividadeRemovida = scanner.next();
        
        for(Atividade atividade : listaAtividade){
            if (atividade.getNome().equals(nomeAtividadeRemovida)){
                listaAtividade.remove(atividade);
                break;
            }
        }
    }
    
    public void listarAtividade(){

        for(Atividade atividade : listaAtividade){
            System.out.println("\nAtividade: "+ atividade.getNome());
        }
    }

    public void associarAtividadeAoAluno(){

        String atividadeAdicionada;
        String alunoDaAtividade;

        System.out.println("\nDigite o nome da atividade:");
        atividadeAdicionada = scanner.next();
        System.out.println("\n Digite o nome do Aluno:");
        alunoDaAtividade = scanner.next();

        for (Atividade atividade : listaAtividade){
            if (atividade.getNome().equals(atividadeAdicionada)){
                for (Aluno aluno : listaAlunos){
                    if (aluno.getNome().equals(alunoDaAtividade)){
                        aluno.adicionarAtividade(atividade);
                        break;
                        
                    }
                }
                break;
            }
        }


    }

    public void listarAtividadesDoAluno(){

        String nomeAluno;

        System.out.println("\nDigite a matricula do Aluno:");
        nomeAluno = scanner.next();

        for(Aluno aluno : listaAlunos){
            if(aluno.getNome().equals(nomeAluno)){
                aluno.listarAtividade();
                break;
            }
        }
    }
    

}


