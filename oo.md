## Objeto

Em Desenvolvimento de software *objetos* representam *entidades* do mundo real
que serão referenciadas em sua aplicação. Essas *entidades* interagem entre si para resolver problemas do mundo reais em um mundo computacional.  
Imagine que uma  `Pessoa` é uma *entidade* e `Carro` também é uma *entidade*.  
Essa `Pessoa` dirige o carro para ir de um ponto `a`(*casa*) a um ponto `b`(*parque*).

## Classes

As classes ajudam os desenvolvedores de sistema de informação e represetar as *entidades* do mundo real na forma de *objetos*. As classe são como *templates* ou *projetos* que, portanto, podem ser facilmente reutilizadas.
 
## Variáveis de referência

Conforme Luciano Ramalho nos ensina, as variáveis não são caixas. Essas variáveis, das quais Ramalho se refere, são as *variáveis de referência*.
Segundo o autor de Python Fluente, as variáveis são como rótulos ou etiquetas associados a objetos (p. 259). Para entender melhor esse conceito tão presente em liguagens de programação orientadas a objetos como Python e Java, pensemos na atribuição então:

```Python3
p = Pessoa
```

```Java
Pessoa p = new Pessoa();
``` 

É comum dizermos que `Pessoa` foi atribuído a `p`. Mas, faz mais sentido dizer que a variável de referência `p` foi atribuída ao objeto `Pessoa`.

Aplique esse exemplo com [`Python`](testa_atribuicao/endereco.py) no *shell* do Python 3 para verificar. Como saída será possível perceber que, para o código:
```python
e = Endereco()
class Endereco: id 140493286359784
x = Endereco() * 10
Traceback (most recent call last):
  File "/home/tmenegaz/.virtualenvs/clearEnvironment_venv/lib/python3.5/site-packages/IPython/core/interactiveshell.py", line 2862, in run_code
    exec(code_obj, self.user_global_ns, self.user_ns)
  File "<ipython-input-5-71f4aeffabe9>", line 1, in <module>
    x = Endereco() * 10
TypeError: unsupported operand type(s) for *: 'Endereco' and 'int'
class Endereco: id 140493294873400
```
ocorre a atribuição da direita para a esquerda, pois o *id* `140493294873400` é gerado antes da exceção ocasionada pela tentativa de multiplicar `Endereco()` por *10*.

Vaja que em [`Java`](testa_atribuicao/Endereco.java) a saída gera a mensagem informando um erro de compilação:
```Java
Information:java: Errors occurred while compiling module 'OO_java'
Information:javac 1.8.0_144 was used to compile java sources
Information:10/09/17 07:51 - Compilation completed with 1 error and 0 warnings in 831ms
/home/tmenegaz/IdeaProjects/OO_java/src/oo/Main.java
Error:(14, 37) java: bad operand types for binary operator '*'
  first type:  oo.Endereco
  second type: int
```
não atribuindo nada ao objeto. Esse erro ocorre devido a tentativa de declarar uma operação inválida (declarar um operador binário para multiplicar o objeto 10 vezes). Quando removermos o operador binário e seu operador `* 10`, os *ids* dos objetos são gerados conforme a regra explicada acima: *a variável de referência é atribuida ao objeto*, apresentando os seus *ids* `356573597` e 
`1735600054`.
Kathy Sierra e Bert Bates (p. 29), afirmam que as variávesi de referência são usadas para acessar um objeto. Dito de outra forma uma vez que a varável de referência é atribuida ao objeto ela sabe o meio para acessar esse objeto.


## Benefícios do Encapsulamento

Em *Programação* *Orientada* a *Objetos* encapsular é ocultar detalhes da implementação por trás de uma *interface* de programação publica. Observe que interface nesse contexto é o conjunto de métodos que seu códio tornará disponível para outros códigos chamarem - dito de outra forma, a *interface* é a **API** do seu código.

Para desfrutar desse benefício:

- mantenha suas variáveis de instância protegidas
- crie propriedades (métodos de acesso) públicos e tome medidas para garantir que o código chamador use métodos em vez de acessar diretamente a variável de instância (váriável no escopo da classe e fora de qualquer método).
- prime pela *coesão* e o *desacoplamento*.

Veja esse [exemplo](exmplos/py/coesao_desacoplamento/) em Python para saber mais sobre os aspectos envolvendo encapsulamento e variáveis de referência, coesão e desacoplamento com `Python 3`.
[Exemplo](exmplos/java/coesao_desacoplamento/) similar pode ser visto em `Java` também. 
