Claro! Vamos criar um desafio diferente. Que tal um sistema de gerenciamento de uma academia de ginástica? O sistema deve permitir adicionar, remover, listar e gerenciar alunos e suas atividades. Aqui está o desafio:

### Desafio: Sistema de Gerenciamento de Academia de Ginástica


1. **Classe `Aluno`**:
   - Atributos: `nome`, `idade`, `peso`, `altura`, `matricula`.
   - Métodos: Construtor, getters e setters.

2. **Classe `Atividade`**:
   - Atributos: `nome`, `duracao` (em minutos), `caloriasGastas`.
   - Métodos: Construtor, getters e setters.

3. **Classe `Academia`**:
   - Atributos: `nome`, `listaDeAlunos` (uma lista de objetos `Aluno`), `listaDeAtividades` (uma lista de objetos `Atividade`).
   - Métodos:
     - `adicionarAluno(Aluno aluno)`: Adiciona um aluno à lista de alunos.
     - `removerAluno(String matricula)`: Remove um aluno da lista de alunos com base na matrícula.
     - `listarAlunos()`: Lista todos os alunos cadastrados.
     - `adicionarAtividade(Atividade atividade)`: Adiciona uma atividade à lista de atividades.
     - `removerAtividade(String nomeAtividade)`: Remove uma atividade da lista de atividades com base no nome.
     - `listarAtividades()`: Lista todas as atividades cadastradas.
     - `associarAtividadeAoAluno(String matricula, String nomeAtividade)`: Associa uma atividade a um aluno.
     - `listarAtividadesDoAluno(String matricula)`: Lista todas as atividades associadas a um aluno específico.

4. **Classe `Main`**:
   - Menu interativo que permite ao usuário realizar as seguintes operações:
     - Adicionar um aluno.
     - Remover um aluno.
     - Listar todos os alunos.
     - Adicionar uma atividade.
     - Remover uma atividade.
     - Listar todas as atividades.
     - Associar uma atividade a um aluno.
     - Listar todas as atividades de um aluno específico.
