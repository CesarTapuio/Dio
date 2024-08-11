### Desafio: Sistema de Gerenciamento de Contas Bancárias

#### Objetivo
Desenvolver um sistema simples de gerenciamento de contas bancárias que permita adicionar, remover, depositar e sacar dinheiro de contas, além de listar todas as contas e seus saldos.

#### Requisitos

1. **Classe `Conta`**:
   - Atributos: número da conta, nome do titular, saldo.
   - Métodos: getters e setters, método para depositar dinheiro, método para sacar dinheiro.

2. **Classe `Banco`**:
   - Atributos: lista de contas.
   - Métodos: adicionar conta, remover conta, depositar dinheiro em uma conta, sacar dinheiro de uma conta, listar todas as contas e seus saldos.

3. **Classe `Main`**:
   - Método `main` para testar as funcionalidades do sistema.

#### Funcionalidades

1. **Adicionar Conta**: Permitir adicionar uma nova conta ao banco.
2. **Remover Conta**: Permitir remover uma conta do banco.
3. **Depositar Dinheiro**: Permitir depositar dinheiro em uma conta específica.
4. **Sacar Dinheiro**: Permitir sacar dinheiro de uma conta específica, desde que haja saldo suficiente.
5. **Listar Contas**: Listar todas as contas e seus saldos.

#### Dicas

- Utilize conceitos de POO como classes, objetos, encapsulamento, herança e polimorfismo.
- Pense em como você pode organizar suas classes e métodos para que o código seja modular e fácil de entender.
- Considere adicionar validações para garantir que operações como saques não resultem em saldo negativo.
