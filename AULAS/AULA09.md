# Aula 09 - Manipulação de Textos em Python

## Fatiamento
Aqui podemos encontrar apenas os comandos utilizados para fatiar os elementos de uma string. Assim podemos dividir o elementos de uma string e buscá-los da maneira que desejarmos.

Esses elementos podem ser acessados, a partir de seu índice, que é o seu menor nível de busca até o maior nível que é a própria string que está sendo trabalhada .

> [!IMPORTANT]
Vale lembrar que na linguagem de programação Python ocorrre a diferenciação entre letras maiúsculas e minúsculas.


Vamos utilizar como exemplo `frase = ('Curso em Video')` para podermos entender as funcionalidades

- Quando queremos imprimir apenas um elemento, indicamos o índice e utilizamos:

    `print(frase[9])`

Note que o elemento em si, quando contamos os elementos e os espaço, é o elemento 10, entretanto, colocamos 9. Isso se dá pois a contagem dos elementos começou em 0.

- Caso queira comecar a impressão a partir do segundo elemento,o qual possui índice 1, utilizamos:

    `print(frase[1:])`

Entretanto, apesar de, dessa maneira, a impressão ser realizada a partir do elemento de índice 1, não é especificado um elemento de de índice final após o sinal `:`.  

|||
|-|-|

## Análise
Este tópico vai tratar de assuntos relacionados a análise da string.

Quando precisarmos saber a quantidade de elementos que há em uma string ou fazer uma busca por determinado elementos presente. 

É possível, inclusive, fazer a contagem de elementos juntamente com o fatiamento, algo que foi apresentado no tópico passado.

> [!CAUTION]
Apesar de podermos fazer o fatiamento juntamente com a contagem utilizando a funcionalidade presente nesse tópico, as funções, aqui apresentada, **NÃO REALIZAM** fatiamento, são exclusivas para a análise da string. 

|||
|-|-|
## Transformação
Aqui veremos funcionalidades que dizem respeito à formatação da string desejada.

> [!CAUTION]
Os itens propostos aqui falam apenas de alguns tópicos relacionados à formatação do texto. **NÃO TRATAM DA ESTILIZAÇÃO.**

|||
|-|-|

## Divisão
Tópicos relacionados a divisão da string.
|||
|-|-|
## Junção
Trata sobre algumas funcionalidades relacionada a junção 