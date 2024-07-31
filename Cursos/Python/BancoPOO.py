"""""
Classe 'Historico':

Adicionar transação


Interface 'Transação':

Registra transação

Classes filhas 'Deposita' e 'Saque'


Classe 'Conta' :

Variaveis : saldo, numero da conta, agencia
cliente, historico

Mostrar saldo
Criar nova conta
Sacar
Depositar


Classe 'Conta Corrente' :

Estende de Conta e adiciona limites


Classe 'Cliente'

Variaveis: endereco, contas

Realiza transaação
Adiciona conta


Classe 'Pessoa Fisica': 

Variaveis: CPF, nome, nata de nascimento


@property faz mudar um def em uma casse para um numero ou propriedade

"""""


class Conta:

    def __init__(self, saldo_conta, numero_conta, agencia_cliente, historico):
        self._saldo_conta = saldo_conta
        self.numero_conta = numero_conta
        self.agencia_cliente
        pass
        

    def mostrar_saldo(self):
        pass

    def criar_conta(self):
        pass

    def sacar (self):
        pass

    def depositar (self):
        pass
    