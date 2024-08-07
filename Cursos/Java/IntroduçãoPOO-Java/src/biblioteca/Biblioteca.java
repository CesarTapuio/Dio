package biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private List<Usuario> usuarios = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void adicionarLivro(String titulo, String autor, boolean disponibilidade) {
        Livro newLivro = new Livro(titulo, autor, disponibilidade);
        livros.add(newLivro);
        System.out.println("\nOperação realizada com sucesso!\n");
    }

    public void adicionarUsuario(String nome, int ID) {
        Usuario newUsuario = new Usuario(nome, ID);
        usuarios.add(newUsuario);
        System.out.println("\nOperação realizada com sucesso!\n");
    }

    public void listarLivros() {
        for (Livro livro : livros) {
            System.out.println("\nTítulo: " + livro.getTitulo() + " - Autor: " + livro.getAutor());
        }
    }

    public void emprestarLivro(String titulo, String nomeUsuario) {
        for (Livro livro : livros) {
            if (titulo.equals(livro.getTitulo())) {
                for (Usuario usuario : usuarios) {
                    if (nomeUsuario.equals(usuario.getNome())) {
                        usuario.setLivrosEmprestados(titulo);
                        livro.setDisponibilidade(false);
                        System.out.println("\nOperação realizada com sucesso!\n");
                        return;
                    }
                }
            }
        }
        System.out.println("\nLivro ou usuário não encontrado!\n");
    }

    public void listarEmprestimos() {
        System.out.println("[1] Listar todos os livros emprestados\n[2] Listar livros emprestados para um usuário");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            for (Livro livro : livros) {
                if (!livro.getDisponibilidade()) {
                    for (Usuario usuario : usuarios) {
                        if (usuario.getLivroEspecifico(livro.getTitulo())) {
                            System.out.println("\nLivro: " + livro.getTitulo() + " - Usuário: " + usuario.getNome() + "\n");
                        }
                    }
                }
            }
        } else if (opcao == 2) {
            System.out.println("Digite o nome do Usuário: ");
            String nome = scanner.next();

            for (Usuario usuario : usuarios) {
                if (nome.equals(usuario.getNome())) {
                    usuario.getLivrosEmprestados();
                }
            }
        }
    }
}
