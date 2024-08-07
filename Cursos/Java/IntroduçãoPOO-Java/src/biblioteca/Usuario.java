package biblioteca;
public class Usuario {
    //- Atributos: nome, ID, lista de livros emprestados.
    //- Métodos: getters e setters, método para emprestar e devolver livros.

    private final String nome;
    private final int ID;
    private String [] livrosEmprestados = new String[10];
    //auxiliares:
    int i = 0;

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

    public void setLivrosEmprestados(String livroEmprestados){

        do{
            if (this.livrosEmprestados[i] == null){
                this.livrosEmprestados[i] = livroEmprestados;
                i = 0;
                break;
            }
            else if(i>= 10){
                System.out.println("\nAlcancou o numero maximo de livros emprestados!\n");
                break;
            }
            i++;
        }while(this.livrosEmprestados[i]!=null);

    }

    public String[] getLivrosEmprestados(){

        return livrosEmprestados;

    }


}
