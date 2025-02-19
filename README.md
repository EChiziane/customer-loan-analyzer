# Customer Loan Analyzer 📊

## Descrição
O **Customer Loan Analyzer** é um sistema desenvolvido em **Spring Boot** que permite analisar a elegibilidade de um cliente para diferentes tipos de empréstimos. Com base nas informações do cliente, o sistema determina quais tipos de empréstimos estão disponíveis e suas respectivas taxas de juros.

## 🚀 Funcionalidades
- Análise de elegibilidade para diferentes tipos de empréstimos.
- Cálculo automático das taxas de juros aplicáveis.
- API REST para consulta da disponibilidade de empréstimos.
- Validação de dados usando Jakarta Validation.
- Implementação modular e escalável.

## 🛠️ Tecnologias Utilizadas
- **Java 17+**
- **Spring Boot 3**
- **Spring Web**
- **Jakarta Validation**
- **SLF4J Logger**
- **Maven**

## 📚 Estrutura do Projeto
```
src/
├── main/
│   ├── java/com/api/customerloananalyzer/
│   │   ├── controller/          # Controlador REST
│   │   ├── service/             # Serviço de Análise de Empréstimos
│   │   ├── domain/              # Lógica de Negócio e Modelos
│   │   ├── dto/                 # Objetos de Transferência de Dados
│   │   ├── Application.java     # Classe principal
│   └── resources/
│       ├── application.yml      # Configuração do Spring Boot
```

## 🔧 Como Executar
1. Clone o repositório:
   ```sh
   git clone https://github.com/username/customer-loan-analyzer.git
   cd customer-loan-analyzer
   ```
2. Compile e instale as dependências:
   ```sh
   mvn clean install
   ```
3. Execute a aplicação:
   ```sh
   mvn spring-boot:run
   ```
4. Acesse a API:
   ```
   http://localhost:8080/customer-loans
   ```

## 👀 Endpoints da API
| Método | Endpoint             | Descrição                                      |
|---------|----------------------|----------------------------------------------|
| POST    | `/customer-loans`    | Verifica a disponibilidade de empréstimos   |

### 🔹 Exemplo de Requisição (POST /customer-loans)
```json
{
  "name": "João Silva",
  "age": 28,
  "income": 4000.00,
  "location": "SP"
}
```

### 🔹 Exemplo de Resposta
```json
{
  "customerName": "João Silva",
  "availableLoans": [
    { "type": "PERSONAL", "interestRate": 4.0 },
    { "type": "GUARANTEED", "interestRate": 3.0 }
  ]
}
```

## 💡 Como Contribuir
1. Faça um fork do repositório.
2. Crie um branch para sua feature (`feature/minha-feature`).
3. Commit suas mudanças (`git commit -m "Adicionei uma nova feature"`).
4. Faça um push para o branch (`git push origin feature/minha-feature`).
5. Abra um pull request.

## 🐟 Licença
Este projeto é licenciado sob a MIT License.

## 👨‍💻 Autor
**Ednilson Chiziane**
Apaixonado por desenvolvimento de software e boas práticas de código. 🚀

