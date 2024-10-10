import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//- Atributos: `nome`, `idade`, `peso`, `altura`, `matricula`.

public class Aluno {

    Scanner scanner = new Scanner(System.in);
    private String nome;
    private int idade;
    private int peso;
    private float altura;
    private String matricula;
    private Boolean matriculaAtiva;
    private List<Atividade> atividadesAluno = new ArrayList<>();

    public Boolean getMatriculaAtiva() {
        return this.matriculaAtiva;
    }

    public void setMatriculaAtiva(Boolean matriculaAtiva) {
        this.matriculaAtiva = matriculaAtiva;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getPeso() {
        return this.peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void adicionarAtividade(Atividade atividade){
        this.atividadesAluno.add(atividade);
    }

    public void listarAtividade(){

        for(Atividade atividades : atividadesAluno){
        System.out.println("\n" + atividades.getNome());
    }

}
   


    
}
