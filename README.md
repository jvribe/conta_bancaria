**# Projeto Conta Bancária - Java**



 ![img](https://img.shields.io/github/languages/top/jvribe/conta_bancaria?style=flat-square) ![img](https://img.shields.io/github/repo-size/jvribe/conta_bancaria?style=flat-square) ![img](https://img.shields.io/github/languages/count/jvribe/conta_bancaria?style=flat-square) ![img](https://img.shields.io/github/last-commit/jvribe/conta_bancaria?style=flat-square) ![img](https://img.shields.io/github/issues/jvribe/conta_bancaria?style=flat-square) ![img](https://img.shields.io/github/issues-pr/jvribe/conta_bancaria?style=flat-square) ![Status: Concluído](https://img.shields.io/badge/status-conclu%C3%ADdo-brightgreen)



\------



**## 1. Descrição**



O ***\*Projeto Conta Bancária\**** é um sistema de gestão projetado para simular e administrar operações financeiras relacionadas a contas bancárias. Oferece funcionalidades como ***\*cadastro\****, ***\*consulta\****, ***\*atualização\**** e ***\*remoção\**** de contas, além de transações como depósitos, saques e transferências.



O sistema organiza as informações dos clientes — incluindo nome do titular, número da conta, saldo e tipo de conta — garantindo a realização segura das operações. Seu principal objetivo é automatizar e simplificar o gerenciamento de contas bancárias, como Conta Corrente e Conta Poupança, promovendo agilidade e precisão no controle financeiro.



Este projeto, desenvolvido em ***\*Java\****, foca no estudo e aplicação dos conceitos de ***\*Programação Orientada a Objetos (POO)\****, incluindo:



\- Classes e Objetos;

\- Atributos e Métodos;

\- Modificadores de Acesso;

\- Herança e Polimorfismo;

\- Classes Abstratas;

\- Interfaces.



Além de servir como um simulador funcional, o projeto oferece uma base prática para compreender os princípios fundamentais da POO aplicados a um cenário realista.



**## 2. Funcionalidades do Projeto**



1. ***\*Criar Conta:\**** Cria uma nova conta bancária especificando nome do titular, número da agência, saldo inicial e propriedades específicas conforme o tipo da conta. O número da conta é gerado automaticamente.
2. ***\*Listar todas as Contas:\**** Lista todas as contas cadastradas no sistema.
3. ***\*Consultar uma Conta pelo número:\**** Encontra uma conta pelo número.
4. ***\*Consultar uma Conta pelo titular:\**** Encontra uma ou mais contas associadas ao nome do titular.
5. ***\*Editar Conta:\**** Permite atualizar os dados de uma conta existente a partir do número da conta.
6. ***\*Excluir Conta:\**** Remove uma conta específica com base no número da conta.
7. ***\*Sacar:\**** Realiza a retirada de um valor de uma conta, desde que o saldo seja suficiente.
8. ***\*Depositar:\**** Adiciona um valor ao saldo de uma conta existente.
9. ***\*Transferir:\**** Transfere um valor de uma conta para outra, respeitando os respectivos saldos e limites.



**## 3. Diagrama de Classes**



Um ***\*Diagrama de Classes\**** é um modelo visual usado na programação orientada a objetos para representar a estrutura de um sistema. Ele exibe classes, atributos, métodos e os relacionamentos entre elas, como associações, heranças e dependências.



Esse diagrama ajuda a planejar e entender a arquitetura do sistema, mostrando como os componentes interagem e se conectam. É amplamente utilizado nas fases de design e documentação de projetos.



Abaixo, você confere o Diagrama de Classes do Projeto Conta Bancária:



\```mermaid

classDiagram

class Conta {

 \- numero: int

 \- agencia: int

 \- tipo: int

 \- titular: String

 \- saldo: float

 \+ getNumero() int

 \+ getAgencia() int

 \+ getTipo() int

 \+ getTitular() String

 \+ getSaldo() float

 \+ setNumero(numero: int) void

 \+ setAgencia(agencia: int) void

 \+ setTipo(tipo: int) void

 \+ setTitular(titular: String) void

 \+ setSaldo(saldo: float) void

 \+ sacar(valor: float) boolean

 \+ depositar(valor: float) void

 \+ visualizar() void

}

class ContaCorrente {

 \- limite: float

 \+ getLimite() float

 \+ setLimite(limite: float) void

 \+ sacar(valor: float) boolean

 \+ visualizar() void

}

class ContaPoupanca {

 \- aniversario: int

 \+ getAniversario() int

 \+ setAniversario(aniversario: int) void

 \+ visualizar() void

}

ContaCorrente --> Conta

ContaPoupanca --> Conta

\```



**## 4. Tela Inicial do Sistema - Menu**



  ![source: imgur.com](https://i.imgur.com/MFK9yXB.png)



**## 5. Requisitos**



Para executar os códigos localmente, você precisará de:



\- [Java JDK 21+](https://www.oracle.com/java/technologies/downloads/#java21)

\- [Eclipse](https://eclipseide.org/) ou [Eclipse STS](https://spring.io/tools)



**## 6. Como Executar o projeto no Eclipse/STS**



**### 6.1. Importando o Projeto**



1. Clone o repositório do Projeto [Conta Bancária](https://github.com/jvribe/conta_bancaria) dentro da pasta do **Workspace** do Eclipse/STS



\```bash

git clone https://github.com/jvribe/conta_bancaria.git

\```



1. ***\*Abra o Eclipse/STS\**** e selecione a pasta do **Workspace** onde você clonou o repositório do projeto
2. No menu superior do Eclipse/STS, clique na opção: ***\*File** 🡲 **Import...\****
3. Na janela ***\*Import\****, selecione a opção: ***\*General** 🡲 **Existing Projects into Workspace\**** e clique no botão ***\*Next\****
4. Na janela ***\*Import Projects\****, no item ***\*Select root directory\****, clique no botão ***\*Browse...\**** e selecione a pasta do Workspace onde você clonou o repositório do projeto
5. O Eclipse/STS reconhecerá automaticamente o projeto
6. Marque o Projeto Conta Bancária no item ***\*Projects\**** e clique no botão ***\*Finish\**** para concluir a importação



**### 6.2. Executando o projeto**



1. Na guia ***\*Package Explorer\****, localize o Projeto Conta Bancária
2. Abra a ***\*Classe Menu\****
3. Clique no botão ***\*Run\**** ![source: imgur.com](https://i.imgur.com/MtBQjUp.png) para executar a aplicação
4. Caso seja perguntado qual é o tipo do projeto, selecione a opção ***\*Java Application\****
5. O console exibirá o menu do Projeto.



**## 7. Contribuição**



Este repositório é parte de um projeto educacional, mas contribuições são sempre bem-vindas! Caso tenha sugestões, correções ou melhorias, fique à vontade para:



\- Criar uma ***\*issue\****

\- Enviar um ***\*pull request\****

\- Compartilhar com colegas que estejam aprendendo Java!



**## 8. Contato**



Desenvolvido por [***\*João Victor Ribeiro\****](https://github.com/jvribe)

 Para dúvidas, sugestões ou colaborações, entre em contato via GitHub ou abra uma issue!