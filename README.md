# Consulta de CEP - Spring Boot

Projeto desenvolvido como desafio **"Design Patterns com Java: Dos Clássicos (GoF) ao Spring Framework"** da [DIO](https://web.dio.me).

Este projeto explora na prática a utilização de **Padrões de Projeto** (Design Patterns) com **Java** e **Spring Boot**, integrando a API pública do [ViaCEP](https://viacep.com.br/) para consulta de endereços através do CEP.

## 🛠 Padrões de Projeto Aplicados

- **Singleton:**  
  Implementado para instanciar um único `RestTemplate`, gerenciado pelo Spring.

- **Strategy:**  
  Interface `CepServiceStrategy` para definir uma estratégia de busca de CEP. Implementada pela classe `ViaCepService`.

- **Facade:**  
  Classe `AddressService` atua como fachada simplificando o acesso à busca de endereço.

## 🔥 Tecnologias Utilizadas

- Java 17+
- Spring Boot 3+
- Maven
- API REST ViaCEP
- IntelliJ IDEA (IDE utilizada)

## 📚 Como Executar o Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/rafafdx/DesafioDio-PadroesDeProjetos.git
    ```

2. Navegue até o diretório do projeto:
   ```bash
   cd DesafioDio-PadroesDeProjetos/cep-consulta
    ```
3. Abra no IntelliJ IDEA ou outra IDE de sua preferência.
    
4. Rode a aplicação (classe ```bash CepConsultaApplication```).

5. Acesse no navegador:
   ```bash
   http://localhost:8080/api/address/{cep}
    ```
    Exemplo:
    ```bash
   http://localhost:8080/api/address/01001000
    ```

## ✅ Exemplo de Retorno
     
    {
    "cep": "01001-000",
    "logradouro": "Praça da Sé",
    "bairro": "Sé",
    "localidade": "São Paulo",
    "uf": "SP"
    }

Feito com 💻 por rafafdx
