# Aula 09 - Manipulação de Textos em Python

## Fatiamento
Aqui podemos encontrar apenas os comandos utilizados para fatiar os elementos de uma string. Assim podemos dividir o elementos de uma string e buscá-los da maneira que desejarmos.

Esses elementos podem ser acessados, a partir de seu índice, que é o seu menor nível de busca até o maior nível que é a própria string que está sendo trabalhada .

> [!IMPORTANT]
Vale lembrar que na linguagem de programação Python ocorrre a diferenciação entre letras maiúsculas e minúsculas.


Vamos utilizar como exemplo    `frase = ('Curso em Video')` para podermos entender as funcionalidades

- Quando queremos imprimir apenas um elemento, indicamos o índice e utilizamos:

        print(frase[9])

Note que o elemento em si, quando contamos os elementos e os espaço, é o elemento 10, entretanto, colocamos 9. Isso se dá pois a contagem dos elementos começou em 0.

- Caso queira comecar a impressão a partir do segundo elemento,o qual possui índice 1, utilizamos: 
    
        print(frase[15:])

Entretanto, apesar de, dessa maneira, a impressão ser realizada a partir do elemento de índice 1, não é especificado um elemento de de índice final após o sinal `:`.  

Há uma funcionalidade capaz de fazer uma busca em toda a string.

- Nessa funcionalidade é necessário que coloquemos: 

        print(frase[9:21:2])

Uma peculiaridade dessa funcionalidade é que o valor `2` é a quantidade de elementos que será pulado e não será impresso na saída.

- Caso queira omitir apenas o início da busca e informar apenas o final dela, será necessário utilizar o seguinte código:

        print(frase[:5])

- No caso de haver determinados os índices de início e término que serão utilizados, digite:

        print(frase[9:13])

- Para o caso de indicar apenas o início e a quantidade de elementos que serão pulados, digite:

        print(frase[9::13])


|||
|-|-|

## Análise
Este tópico vai tratar de assuntos relacionados a análise da string.

Quando precisarmos saber a quantidade de elementos que há em uma string ou fazer uma busca por determinado elementos presente. 

Para imprimir o tamanho da string, utilize o código:
        
               print(len(frase))

Caso queira que seja impresso o número de vezes que aparece uma letra - tomemos como exemplo a letra 'o' - utilize o código:
  
        print(frase.count('o'))

É possível, inclusive, fazer a contagem de elementos juntamente com o fatiamento, algo que foi apresentado no tópico passado. Para isso utilize o comando:
  
        print(frase.count('o',0,13))

Para visualizar onde o termo buscado começou utilize o código:
  
        print(frase.find('deo'))
- Caso utilize o código acima e o valor não exista na String, será retornado `-1`, o que indica que o termo não existe. 

Caso queira apenas saber se há o elemento na String, utilize:

        print('Curso' in texto)


> [!CAUTION]
Apesar de podermos fazer o fatiamento juntamente com a contagem utilizando a funcionalidade presente nesse tópico, as funções, aqui apresentada, **NÃO REALIZAM** fatiamento, são exclusivas para a análise da string. 

|||
|-|-|
## Transformação
Aqui veremos funcionalidades que dizem respeito à formatação da string desejada.

Caso queira subsitituir um termo em específico, utilize o código: 

        print(frase.replace('python', 'Android'))

Se optar por colocar toda a string em letras maiúsculas utilize o código:

        print(frase.upper())

O mesmo acontece caso queira o texto todo em letras minúsculas, com apenas uma diferença no código. Utilize:

        print(fras.lower())
> [!CAUTION]
Os itens propostos aqui falam apenas de alguns tópicos relacionados à formatação do texto. **NÃO TRATAM DA ESTILIZAÇÃO.**

|||
|-|-|

## Divisão
Tópicos relacionados a divisão da string.
|||
|-|-|
## Junção
Trata sobre algumas funcionalidades relacionada a junção.

Inclusão de texto explicativo.