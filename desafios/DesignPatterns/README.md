
# Design Patterns API with Spring Boot

Este projeto demonstra o uso de vários **padrões de design (Design Patterns)** em uma arquitetura modular e escalável utilizando **Spring Boot**. Ele fornece uma API RESTful para gerenciar **Produtos** e **Usuários**, incluindo operações básicas de CRUD.

---

## **Funcionalidades**

- **Operações CRUD**: Criar, Consultar, Atualizar, Excluir para Produtos e Usuários.
- **Padrões de Design**:
    - Singleton (`LogManager`): Garante uma única instância para logs em toda a aplicação.
    - Facade (`ProductFacade`): Simplifica as interações entre o controlador e as camadas de serviço.
- **Tratamento Global de Exceções**: Manipula erros com respostas HTTP apropriadas.
- **Validações**: Garante a integridade dos dados (e.g., preço > 0, nome é obrigatório).
- **Documentação da API**: Disponível via Swagger.

---

## **Tecnologias Utilizadas**

- **Java 17**
- **Spring Boot 3.3.5**
- **Spring Data JPA**
- **PostgreSQL** para o banco de dados.
- **Swagger** para a documentação da API.
- **Lombok** para reduzir código boilerplate.

---

## **Como Configurar e Executar**

### **Pré-requisitos**

1. **Java 17** ou superior instalado.
2. **PostgreSQL** instalado e em execução.
3. **Maven** instalado para gerenciamento de dependências.

### **Passos**

1. Clone o repositório:
   ```bash
   git clone https://github.com/jojoabs/design-patterns-api.git
   cd design-patterns-api
   ```

2. Crie o banco de dados no PostgreSQL:
   ```sql
   CREATE DATABASE designpatternsdb;
   ```

3. Atualize as credenciais no arquivo `application.properties`:
   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/designpatternsdb
   spring.datasource.username=YOUR_USERNAME
   spring.datasource.password=YOUR_PASSWORD
   ```

4. Compile e execute a aplicação:
   ```bash
   mvn spring-boot:run
   ```

5. A API estará disponível em `http://localhost:8080`.

---

## **Exemplo Prático**

Abaixo, explicamos passo a passo como usar os principais endpoints da API:

### **1. Listar Todos os Produtos**
- **Método:** `GET`
- **Endpoint:** `/products`
- **Descrição:** Retorna uma lista de todos os produtos cadastrados.
- **Exemplo de Resposta (quando não há produtos):**
  ```json
  []
  ```

---

### **2. Criar um Novo Produto**
- **Método:** `POST`
- **Endpoint:** `/products`
- **Descrição:** Cria um novo produto com as informações fornecidas.
- **Corpo da Requisição:**
  ```json
  {
    "name": "Notebook Gamer",
    "price": 3500.0
  }
  ```
- **Resposta Esperada:**
  ```json
  {
    "id": 1,
    "name": "Notebook Gamer",
    "price": 3500.0
  }
  ```

---

### **3. Atualizar um Produto**
- **Método:** `PUT`
- **Endpoint:** `/products/{id}`
- **Descrição:** Atualiza as informações de um produto existente.
- **Exemplo de Requisição:**
    - **ID do Produto:** `1`
    - **Corpo:**
      ```json
      {
        "name": "Notebook Gamer Atualizado",
        "price": 3800.0
      }
      ```
- **Resposta Esperada:**
  ```json
  {
    "id": 1,
    "name": "Notebook Gamer Atualizado",
    "price": 3800.0
  }
  ```

---

### **4. Deletar um Produto**
- **Método:** `DELETE`
- **Endpoint:** `/products/{id}`
- **Descrição:** Exclui um produto existente pelo ID.
- **Exemplo:**
    - **ID do Produto:** `1`
    - **Resposta Esperada:** Status HTTP `204 No Content` (sem corpo de resposta).

---

## **Testando Cenários de Erro**

### **1. Criar Produto com Dados Inválidos**
- **Método:** `POST`
- **Corpo da Requisição:**
  ```json
  {
    "name": "",
    "price": -10.0
  }
  ```
- **Resposta Esperada:**
  ```json
  {
    "message": "O preço do produto deve ser maior que zero."
  }
  ```

### **2. Buscar Produto com ID Inexistente**
- **Método:** `GET`
- **Endpoint:** `/products/999`
- **Resposta Esperada:**
  ```json
  {
    "message": "Produto com ID 999 não encontrado!"
  }
  ```

---

## **Documentação Swagger**

A documentação da API está disponível em:
- URL: `http://localhost:8080/swagger-ui.html`

Nela, você pode explorar e testar os endpoints diretamente pela interface gráfica.

---

## **Próximos Passos**

- Adicionar autenticação via **Spring Security**.
- Implementar paginação e filtros para listagem de produtos.
- Desenvolver uma interface frontend usando **React** ou **Angular**.
- Melhorar os testes unitários e de integração.

---

## **Licença**

Este projeto é licenciado sob a **MIT License**. Sinta-se à vontade para usá-lo e modificá-lo.

