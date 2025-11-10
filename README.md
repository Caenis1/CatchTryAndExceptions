# Tratamento de Exceções em Java  
### Projeto didático utilizando Try/Catch, Exceptions personalizadas e arquitetura em camadas

Este projeto foi desenvolvido com o objetivo de praticar conceitos fundamentais do **desenvolvimento Java Backend**, especialmente:

- ✅ Tratamento de erros com **try/catch**
- ✅ Criação de **exceções personalizadas**
- ✅ Propagação de exceções com **throws**
- ✅ Lançamento de erros com **throw**
- ✅ Organização do código em camadas (App, Service, DAO)
- ✅ Separação de responsabilidades

---

## 🚀 Objetivo

Simular a consulta de um cliente pelo seu código.  
Caso o cliente não exista, o sistema lança uma exceção personalizada:

**`ClienteNaoEncontradoException`**

A exceção percorre a camada de serviço até ser tratada no `main`, onde é exibida uma mensagem ao usuário.

Esse fluxo reproduz a estrutura usada em sistemas reais, ajudando no entendimento de como erros são tratados em ambientes de produção.

---

## 🧩 Arquitetura do Projeto

src/
└── br/com/exemplo/
├── app/
│ └── App.java
├── service/
│ └── ClienteService.java
├── dao/
│ └── ClienteDAO.java
└── exception/
└── ClienteNaoEncontradoException.java

### 📌 **App**
Responsável pela interação com o usuário e tratamento final da exceção via `try/catch`.

### 📌 **Service**
Camada intermediária que valida regras ou repassa chamadas ao DAO.

### 📌 **DAO**
Simula acesso a dados e lança a exceção caso o cliente não seja encontrado.

### 📌 **Exception**
Define uma exceção personalizada para representar o erro de forma clara e específica.

---

## 📘 Exemplo do Fluxo

1. O usuário digita o código do cliente.  
2. A camada Service chama o DAO.  
3. O DAO verifica se o cliente existe.  
4. Se não existir:  
   - `throw new ClienteNaoEncontradoException(...)`  
5. A exceção sobe até o `main`  
6. O `try/catch` do App trata e exibe a mensagem ao usuário.

---

## ✅ Tecnologias Utilizadas

- Java 8+  
- JOptionPane (para interação simples)  
- Estrutura básica de camadas (DAO, Service, App)  

---

## 📎 Propósito

Este repositório foi criado como exercício de estudo para fortalecer meus conhecimentos sobre:

- Tratamento de erros  
- Estratégias de exceções  
- Boas práticas de arquitetura  
- Escrita de código limpo e organizado  

---

## 👨‍💻 Autor

**Carlos, Estudante de Java Backend**  
Sigo em constante aprendizado e evolução no desenvolvimento de aplicações Java.

Se quiser trocar ideias sobre backend, Java ou tecnologia, fique à vontade para conectar comigo! 🚀

---

## ⭐ Contribuições

Sugestões e melhorias são sempre bem-vindas!  
Sinta-se à vontade para abrir *issues* ou enviar *pull requests*.
