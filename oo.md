## Benefícios do Encapsulamento

Em *Programação* *Orientada* a *Objetos* encapsular é ocultar detalhes da implementação por trás de uma *interface* de programação publica. Observe que interface nesse contexto é o conjunto de métodos que seu códio tornará disponível para outros códigos chamarem - dito de outra forma, a *interface* é a **API** do seu código.

Para desfrutar desse benefício:

- Mantenha suas variáveis de instância protegidas
- crie propriedades (métodos de acesso) públicos e tome medidas para garantir que o código chamador use métodos em vez de acessar diretamente a variável de instância (váriável no escopo da classe e fora de qualquer método).