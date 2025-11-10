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
