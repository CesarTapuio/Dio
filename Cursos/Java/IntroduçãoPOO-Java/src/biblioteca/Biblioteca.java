package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    //- Atributos: lista de livros, lista de usuários.
    //- Métodos: adicionar livro, remover livro, adicionar usuário, remover usuário, emprestar livro, devolver livro, listar livros disponíveis, listar livros emprestados.

    public List<Livro> livros = new ArrayList<>();
    public List<Usuario> usuarios = new ArrayList<>();


    public void adicionarLivro(String livro, String autor, boolean disponibilidade){
     
        Livro newLivro = new Livro(livro, autor, disponibilidade);
        livros.add(newLivro);
        
    }

    public void adicionarUsuario(String usuario, int ID){
       Usuario newUsuario = new Usuario(usuario, ID);
       usuarios.add(newUsuario);

    }

    public void listarLivros(){
        
        for(Livro livro: livros){
            System.out.println("\nTitulo: " + livro.getTitulo() + " - Autor: " + livro.getAutor());
            
        }
    }
}
