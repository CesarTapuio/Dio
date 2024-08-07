package biblioteca;

import java.util.Arrays;

public class Usuario {
    private final String nome;
    private final int ID;
    private String[] livrosEmprestados = new String[10];
    private int i = 0;

    public Usuario(String nome, int ID) {
        this.nome = nome;
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public int getID() {
        return ID;
    }

    public void setLivrosEmprestados(String livroEmprestado) {
        if (i < 10) {
            livrosEmprestados[i] = livroEmprestado;
            i++;
        } else {
            System.out.println("\nAlcançou o número máximo de livros emprestados!\n");
        }
    }

    public void getLivrosEmprestados() {
        System.out.println(Arrays.toString(livrosEmprestados));
    }

    public boolean getLivroEspecifico(String livro) {
        for (int j = 0; j < 10; j++) {
            if (livrosEmprestados[j] != null && livrosEmprestados[j].equals(livro)) {
                return true;
            }
        }
        return false;
    }
}
