# Desafio de Projeto: Aprendendo na Prática Programação Orientada a Objetos com Java

## 📝 Descrição do Projeto
Este projeto foi desenvolvido como parte de um desafio para praticar e fortalecer os conceitos de **Programação Orientada a Objetos (POO)** em Java. O domínio do projeto é um **Bootcamp**, onde participantes (Devs) podem se inscrever, progredir em **Cursos** e **Mentorias** e acumular **XP** (pontos de experiência) com base nos conteúdos concluídos.

## 🛠 Estrutura de Classes do Projeto
O projeto utiliza os principais pilares da POO: **Abstração**, **Encapsulamento**, **Herança** e **Polimorfismo** para organizar o domínio do Bootcamp. Veja abaixo as classes e suas descrições:

### Classes

- **`Conteudo` (Classe Abstrata)**: Classe base que define a estrutura de um conteúdo do Bootcamp, com atributos `titulo`, `descricao` e o método abstrato `calcularXp()`, usado para calcular os pontos de experiência (XP) de cada conteúdo.

- **`Curso` (Subclasse de Conteudo)**: Representa cursos específicos com o atributo `cargaHoraria` e uma implementação personalizada do método `calcularXp()`.

- **`Mentoria` (Subclasse de Conteudo)**: Representa uma mentoria, incluindo o atributo `data`, que indica a data de realização da mentoria. O método `calcularXp()` calcula pontos de experiência específicos para uma mentoria.

- **`Bootcamp`**: O núcleo do domínio, contendo listas de conteúdos e desenvolvedores inscritos. Possui métodos para adicionar conteúdos e inscrever novos desenvolvedores.

- **`Dev`**: Representa um desenvolvedor inscrito no Bootcamp. Gerencia listas de conteúdos inscritos e concluídos e oferece métodos para calcular o XP acumulado e avançar no progresso dos conteúdos.

## 🚀 Pilares da Orientação a Objetos Aplicados
- **Abstração**: O domínio é representado por um modelo abstrato de um Bootcamp, com conteúdos essenciais (Curso e Mentoria).
- **Encapsulamento**: Cada classe possui seus próprios atributos e métodos, encapsulando a lógica interna e protegendo a integridade dos dados.
- **Herança**: `Curso` e `Mentoria` herdam de `Conteudo`, compartilhando atributos e métodos comuns.
- **Polimorfismo**: A classe `Dev` pode manipular objetos `Curso` e `Mentoria` através de uma referência genérica `Conteudo`, tornando o código mais flexível.

## 💻 Como Executar o Projeto
1. Certifique-se de que o **JDK** está instalado e configurado em seu ambiente.
2. Clone o repositório para o seu ambiente local.
3. Abra o projeto em uma IDE como **IntelliJ IDEA** ou **Eclipse**.
4. Execute a classe `Main` para simular as interações entre desenvolvedores e conteúdos do Bootcamp.

## 📋 Exemplo de Saída Esperada
Após executar o código, a saída esperada será semelhante ao exemplo abaixo:

```plaintext
Conteúdos Inscritos Jhonatas: [Curso Java, Mentoria Java]
Conteúdos Inscritos Jhonatas: [Mentoria Java]
Conteúdos Concluídos Jhonatas: [Curso Java]
XP: 80.0
```

## 📂 Estrutura de Pastas do Projeto

```plaintext
src
└── br
    └── com
        └── dio
            └── desafio
                └── dominio
                    ├── Bootcamp.java
                    ├── Conteudo.java
                    ├── Curso.java
                    ├── Dev.java
                    ├── Mentoria.java
                    └── Main.java
```

## 🔮 Melhorias Futuras
Algumas ideias para evoluir o projeto:

Adicionar novos tipos de conteúdo, como desafios de código.
Implementar um sistema de certificação para os Devs ao concluir o Bootcamp.
Criar uma interface gráfica para melhor interação com o Bootcamp.

## 🏆 Conclusão
Este projeto representa uma implementação prática dos conceitos de POO em um domínio específico e fornece uma base sólida para extensões e novas funcionalidades. Com ele, é possível desenvolver uma compreensão mais profunda dos pilares da orientação a objetos e da organização de classes em Java.
