package biblioteca;
public class Usuario {
    //- Atributos: nome, ID, lista de livros emprestados.
    //- Métodos: getters e setters, método para emprestar e devolver livros.

    private String nome;
    private int ID;
    private String [] livrosEmprestados = new String[10];
    //auxiliares:
    int i;

    public Usuario(String nome, int ID){
        this.nome = nome;
        this.ID = ID;
    }


    // getter e setters:

    public String getNome(){

        return this.nome;

    }


    public int getID(){

        return this.ID;

    }

    public void setLivrosEmprestados(String [] livrosEmprestados){

        this.livrosEmprestados = livrosEmprestados;

    }

    public String[] getLivrosEmprestados(){

        return livrosEmprestados;

    }


}
