### Desafio: Sistema de Gerenciamento de Biblioteca

#### Objetivo
Desenvolver um sistema simples de gerenciamento de biblioteca que permita adicionar, remover, emprestar e devolver livros, além de gerenciar usuários.

#### Requisitos

1. **Classe `Livro`**:
   - Atributos: título, autor, ISBN, disponibilidade.
   - Métodos: getters e setters, método para emprestar e devolver o livro.

2. **Classe `Usuario`**:
   - Atributos: nome, ID, lista de livros emprestados.
   - Métodos: getters e setters, método para emprestar e devolver livros.

3. **Classe `Biblioteca`**:
   - Atributos: lista de livros, lista de usuários.
   - Métodos: adicionar livro, remover livro, adicionar usuário, remover usuário, emprestar livro, devolver livro, listar livros disponíveis, listar livros emprestados.

4. **Classe `Main`**:
   - Método `main` para testar as funcionalidades do sistema.

#### Funcionalidades

1. **Adicionar Livro**: Permitir adicionar um novo livro à biblioteca.
2. **Remover Livro**: Permitir remover um livro da biblioteca.
3. **Adicionar Usuário**: Permitir adicionar um novo usuário à biblioteca.
4. **Remover Usuário**: Permitir remover um usuário da biblioteca.
5. **Emprestar Livro**: Permitir que um usuário empreste um livro, desde que o livro esteja disponível.
6. **Devolver Livro**: Permitir que um usuário devolva um livro que ele emprestou.
7. **Listar Livros Disponíveis**: Listar todos os livros que estão disponíveis para empréstimo.
8. **Listar Livros Emprestados**: Listar todos os livros que estão emprestados.

#### Dicas

- Utilize conceitos de POO como classes, objetos, encapsulamento, herança e polimorfismo.
- Pense em como você pode organizar suas classes e métodos para que o código seja modular e fácil de entender.
- Considere adicionar validações para garantir que um livro só pode ser emprestado se estiver disponível e que um usuário só pode devolver um livro que ele realmente emprestou. 
