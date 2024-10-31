
# Banco Digital com Java e Orientação a Objetos

## Descrição do Projeto
Este projeto foi desenvolvido para reforçar o conhecimento em **Programação Orientada a Objetos (POO)** com **Java**, implementando um sistema bancário simples com funcionalidades de depósito, saque e transferência. O projeto explora os pilares da POO (abstração, encapsulamento, herança e polimorfismo) para criar um modelo de banco digital.

## Estrutura do Projeto
O projeto é composto pelas seguintes classes e interfaces:

- `Banco`: Responsável por armazenar informações sobre o banco e gerenciar as contas dos clientes.
- `Cliente`: Representa os clientes do banco, contendo informações básicas dos clientes.
- `Conta` (classe abstrata): Classe mãe que define os métodos de depósito, saque e transferência, além de possuir métodos para impressão de extrato.
- `ContaCorrente` (classe concreta): Representa uma conta corrente que herda de `Conta`.
- `ContaPoupanca` (classe concreta): Representa uma conta poupança que herda de `Conta`.
- `IConta` (interface): Define os métodos principais para as contas.
- `Main`: Classe principal para a execução e teste das funcionalidades do sistema bancário.

## Funcionalidades
- **Depósito**: Permite adicionar dinheiro a uma conta.
- **Saque**: Permite retirar dinheiro de uma conta.
- **Transferência**: Permite transferir dinheiro entre contas da mesma instituição.
- **Extrato**: Exibe o saldo atual da conta.

## Tecnologias Utilizadas
- **Java**: Linguagem de programação utilizada para implementar o sistema.
- **POO**: Conceitos de Programação Orientada a Objetos foram aplicados no projeto.

## Como Executar o Projeto
1. Certifique-se de que o **JDK** está instalado e configurado no seu ambiente.
2. Clone o repositório para o seu ambiente local.
3. Abra o projeto em sua IDE de preferência (por exemplo, IntelliJ IDEA ou Eclipse).
4. Execute a classe `Main` para interagir com o sistema bancário.

## Exemplos de Uso
No arquivo `Main.java`, você encontrará exemplos básicos de criação de contas, depósitos, saques e transferências entre contas, bem como a geração de extratos.

## Estrutura do Projeto

```plaintext
BancoDigitalPOO/
├── src/
│   └── com/banco/
│       ├── Banco.java
│       ├── Cliente.java
│       ├── Conta.java
│       ├── ContaCorrente.java
│       ├── ContaPoupanca.java
│       ├── IConta.java
│       └── Main.java
└── README.md
```

## Melhorias Futuras
- Implementar taxas para tipos diferentes de transações, como taxas de transferência na conta corrente.
- Criar métodos para imprimir o histórico completo de transações.
- Adicionar testes unitários para verificar cada operação.

## Conclusão
Este projeto é uma implementação prática dos conceitos de POO no contexto bancário, proporcionando uma oportunidade de fortalecer as habilidades em Java e OOP.
