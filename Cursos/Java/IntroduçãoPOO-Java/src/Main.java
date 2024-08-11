import biblioteca.Biblioteca;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        String livro;
        String autor;
        boolean disponibilidade;
        String nomeUsuario;
        int ID;

        // auxiliares:
        int aux;

        while (true) {
            System.out.println("\n[1] Adicionar livro na biblioteca\n[2] Adicionar usuário\n[3] Listar livros da Biblioteca\n[4] Emprestar livro para usuário");
            System.out.println("[5] Listar livros emprestados");
            aux = scanner.nextInt();

            // adicionar livros
            if (aux == 1) {
                scanner.nextLine(); // Consome a quebra de linha pendente
                System.out.println("\nNome do Livro:");
                livro = scanner.nextLine();

                System.out.println("\nNome do Autor:");
                autor = scanner.nextLine();

                disponibilidade = true;

                biblioteca.adicionarLivro(livro, autor, disponibilidade);

                System.out.println("\n[1] Finalizar operação\n[2] Continuar");
                if (scanner.nextInt() == 1) {
                    break;
                }
            }

            // adicionar usuários
            if (aux == 2) {
                scanner.nextLine(); // Consome a quebra de linha pendente
                System.out.println("\nNome do Usuário:");
                nomeUsuario = scanner.nextLine();

                System.out.println("\nID do Usuário:");
                ID = scanner.nextInt();

                biblioteca.adicionarUsuario(nomeUsuario, ID);

                System.out.println("\n[1] Finalizar operação\n[2] Continuar");
                if (scanner.nextInt() == 1) {
                    break;
                }
            }

            // listar livros da biblioteca
            if (aux == 3) {
                biblioteca.listarLivros();

                System.out.println("\n[1] Finalizar operação\n[2] Continuar");
                if (scanner.nextInt() == 1) {
                    break;
                }
            }

            // emprestar livro
            if (aux == 4) {
                scanner.nextLine(); // Consome a quebra de linha pendente
                System.out.println("Digite o Título do livro que será emprestado:");
                livro = scanner.nextLine();

                System.out.println("Digite o nome do Usuário que fará o empréstimo:");
                nomeUsuario = scanner.nextLine();

                biblioteca.emprestarLivro(livro, nomeUsuario);

                System.out.println("\n[1] Finalizar operação\n[2] Continuar");
                if (scanner.nextInt() == 1) {
                    break;
                }
            }

            // listar livros emprestados
            if (aux == 5) {
                biblioteca.listarEmprestimos();
            }
        }

        scanner.close();
    }
}
