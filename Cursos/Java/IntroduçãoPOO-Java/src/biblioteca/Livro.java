package biblioteca;
public class Livro {
    //Atributos: título, autor, ISBN, disponibilidade.
    //- Métodos: getters e setters, método para emprestar e devolver o livro.

    private String titulo;
    private String autor;
    private boolean disponibilidade;

    public Livro(String titulo,String autor, boolean disponibilidade){
        this.titulo = titulo;
        this.autor = autor;
        this.disponibilidade = disponibilidade;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponibilidade() {
        return this.disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
    








}
