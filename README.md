Consulta de CEP - Spring Boot
Projeto desenvolvido como desafio "Design Patterns com Java: Dos Clássicos (GoF) ao Spring Framework" da DIO.

Este projeto explora na prática a utilização de Padrões de Projeto (Design Patterns) com Java e Spring Boot, integrando a API pública do ViaCEP para consulta de endereços através do CEP.

🛠 Padrões de Projeto Aplicados
Singleton:
Implementado para instanciar um único RestTemplate, gerenciado pelo Spring.

Strategy:
Interface CepServiceStrategy para definir uma estratégia de busca de CEP. Implementada pela classe ViaCepService.

Facade:
Classe AddressService atua como fachada simplificando o acesso à busca de endereço.

🔥 Tecnologias Utilizadas
Java 17+
Spring Boot 3+
Maven
API REST ViaCEP
IntelliJ IDEA (IDE utilizada)
📚 Como Executar o Projeto
Clone o repositório:

git clone https://github.com/rafafdx/DesafioDio-PadroesDeProjetos.git
Navegue até o diretório do projeto:

cd DesafioDio-PadroesDeProjetos/cep-consulta
Abra no IntelliJ IDEA ou outra IDE de sua preferência.

Rode a aplicação (classe bash CepConsultaApplication).

Acesse no navegador:

http://localhost:8080/api/address/{cep}
Exemplo:

http://localhost:8080/api/address/01001000
✅ Exemplo de Retorno
{
"cep": "01001-000",
"logradouro": "Praça da Sé",
"bairro": "Sé",
"localidade": "São Paulo",
"uf": "SP"
}
Feito com 💻 por rafafdx
