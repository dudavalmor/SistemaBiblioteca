# 📚 Biblioteca Virtual

Projeto desenvolvido em Java para praticar lógica de programação e conceitos de Programação Orientada a Objetos (POO).

## 📖 Sobre o projeto

A Biblioteca Virtual é um sistema desenvolvido em Java que simula o funcionamento básico de uma biblioteca.

O sistema permite cadastrar livros e usuários, realizar empréstimos e devoluções, além de consultar livros e empréstimos ativos.

O projeto foi desenvolvido com foco no aprendizado e na prática de conceitos fundamentais de Java.

## 🚀 Funcionalidades

- 📚 Cadastrar livros
- 👤 Cadastrar usuários
- 📖 Listar livros cadastrados
- 🔎 Buscar livros por título
- 🔄 Realizar empréstimos
- ↩️ Devolver livros
- 📋 Listar empréstimos ativos
- ⚠️ Verificar se usuário existe
- ⚠️ Verificar se livro existe
- 🚫 Impedir empréstimo de livro indisponível
- 🔍 Buscar livros por parte do título

## 🛠️ Tecnologias utilizadas

- Java
- Programação Orientada a Objetos (POO)
- Array
- ArrayList
- Scanner
- Tratamento de exceções

## 🧠 Conceitos praticados

Durante o desenvolvimento deste projeto foram praticados conceitos como:

- Classes e objetos
- Encapsulamento
- Construtores
- Métodos
- Getters e setters
- Vetores
- Listas (`List` e `ArrayList`)
- Estruturas condicionais (`if` / `else`)
- Estruturas de repetição (`for` / `while`)
- `switch` / `case`
- `break` e `continue`
- Tratamento de exceções
- Busca em arrays e listas
- Relacionamento entre classes

## 📂 Estrutura do projeto

```text
Biblioteca/
│
├── Main.java
├── Biblioteca.java
├── Livro.java
├── Usuario.java
└── Emprestimo.java
```

## 📌 Classes

### `Livro`

Responsável por armazenar as informações dos livros e controlar sua disponibilidade.

Possui funcionalidades para:

- Emprestar um livro
- Devolver um livro
- Verificar disponibilidade
- Exibir informações do livro

### `Usuario`

Responsável por armazenar os dados dos usuários cadastrados.

Possui informações como:

- Nome
- Matrícula

### `Emprestimo`

Representa um empréstimo realizado na biblioteca.

Relaciona:

- Um usuário
- Um livro
- A data do empréstimo

### `Biblioteca`

Responsável pelo gerenciamento dos usuários, livros e empréstimos.

Também contém as principais regras do sistema, como verificar se um usuário ou livro existe e controlar empréstimos e devoluções.

### `Main`

Contém o menu principal da aplicação e permite que o usuário interaja com o sistema através do terminal.

## ▶️ Como executar

1. Clone o repositório:

```bash
git clone https://github.com/dudavalmor/SistemaBiblioteca
```

2. Abra o projeto em uma IDE compatível com Java.

3. Execute a classe `Main.java`.

4. Utilize o menu apresentado no terminal para interagir com o sistema.

## 📋 Exemplo de funcionamento

Ao iniciar o programa, será apresentado um menu com as opções disponíveis:

```text
*****************************************************
                 BIBLIOTECA VIRTUAL
*****************************************************

       1- Cadastrar livro
       2- Cadastrar usuário
       3- Listar livros
       4- Buscar livro por título
       5- Realizar empréstimo
       6- Devolver livro
       7- Listar empréstimos ativos
       0- Sair

Digite a opção desejada:
```

O usuário pode cadastrar um livro informando:

```text
Título: As Crônicas de Nárnia 1
Autor: C. S. Lewis
ID: L001
Ano de publicação: 1950
```

Também é possível buscar livros pelo título ou por parte dele.

Por exemplo:

```text
Digite o titulo desejado: Nárnia
```

O sistema retorna todos os livros que possuem "Nárnia" no título.

## 🔄 Empréstimos

Para realizar um empréstimo, é necessário informar:

- Matrícula do usuário
- ID do livro
- Data do empréstimo

O sistema verifica se o usuário e o livro existem e se o livro está disponível.

Quando o empréstimo é realizado, o livro passa a ficar indisponível.

Após a devolução, o livro volta a ficar disponível e o empréstimo é removido da lista de empréstimos ativos.

## ⚠️ Validações

O sistema possui algumas validações para evitar operações inválidas, como:

- Cadastrar mais livros ou usuários do que a capacidade permitida
- Cadastrar um livro com ID já existente
- Realizar empréstimo para usuário inexistente
- Realizar empréstimo de livro inexistente
- Realizar empréstimo de livro que já está emprestado
- Devolver um livro que não possui empréstimo ativo
- Informar uma opção inválida no menu

## 🎯 Objetivo

Este projeto foi desenvolvido como parte dos meus estudos de Java, com o objetivo de praticar lógica de programação, Programação Orientada a Objetos e desenvolvimento de aplicações utilizando interação pelo terminal.

Além de colocar em prática conceitos de Java, o projeto também ajudou a desenvolver raciocínio lógico, organização de código e resolução de problemas.

## 📚 Aprendizados

Durante o desenvolvimento do projeto, foram praticados conceitos importantes como a criação e relacionamento entre classes, manipulação de arrays e listas, estruturas de repetição e decisão, tratamento de exceções e organização da lógica de um sistema.

Um dos principais aprendizados foi entender como diferentes classes podem trabalhar juntas para representar as regras de um sistema.

## 🚧 Próximas melhorias

Algumas funcionalidades que podem ser adicionadas futuramente:

- [ ] Aumentar a capacidade de armazenamento
- [ ] Permitir edição de livros e usuários
- [ ] Adicionar remoção de livros e usuários
- [ ] Melhorar o sistema de datas
- [ ] Adicionar persistência de dados
- [ ] Criar uma interface gráfica
- [ ] Adicionar testes automatizados

## 👩‍💻 Desenvolvido por

**Eduarda Valmor**

Projeto desenvolvido para fins de estudo e prática de Java e Programação Orientada a Objetos.
