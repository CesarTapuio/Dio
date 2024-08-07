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

        //auxiliares:
        int aux;



        while(true){

            System.out.println("\n[1] Adicionar livro na biblioteca\n[2] Adicionar usuario\n[3]Listar livros da Biblioteca\n[4] Emprestar livro para usuario");
            aux = scanner.nextInt();

            //adicionar livros
            if(aux == 1){

                scanner.nextLine();
                System.out.println("\nNome do Livro:");
                livro = scanner.nextLine();

                System.out.println("\nNome do Autor:");
                autor = scanner.nextLine();

                disponibilidade = true;

                biblioteca.adicionarLivro(livro, autor, disponibilidade);
                
                System.out.println("\n[1] Finalizar operacao\n[2] Continuar");
                if(scanner.nextInt() == 1){
                    break;
                }
                

            }

            //adicionar usuarios
            if(aux == 2){

                System.out.println("\nNome do Usuario:");
                nomeUsuario = scanner.next();

                System.out.println("\nNome ID do Usuario:");
                ID = scanner.nextInt();

                biblioteca.adicionarUsuario(nomeUsuario, ID);

                System.out.println("\n[1] Finalizar operacao\n[2] Continuar");
                if(scanner.nextInt() == 1){
                    break;
                }
            }

            //listar livros da biblioteca
            if(aux == 3){

            biblioteca.listarLivros();

            System.out.println("\n[1] Finalizar operacao\n[2] Continuar");
            if(scanner.nextInt() == 1){
                break;
            }

        }


            //emprestar livro
            if(aux == 4){
                
                System.out.println("Digite o Titulo do livro que sera emprestado:");
                livro = scanner.next();
                
                System.out.println("Digite o nome do Usuario que fara o emprestimo:");
                nomeUsuario = scanner.next();

                biblioteca.emprestarLivro(livro, nomeUsuario);
                

                

            }
    }

    scanner.close();
         
    }
}
