texto= 'Curso em video python'
frase = '  Aprenda Python  '
#Fatiamento
print(texto[9]) #Imprime apenas o elemento do índice indicado
print(texto[9:13]) ##Imprime os elementos do índice até o índice indicado menos um, ou seja, 13 - 1
print(texto[9:21:2])##Nessa impressão temos o índice inicial,
                          ##onde irá ser interrompida a busca e a quantidade de
                          ##elementos que será pulada entre cada elemento que terá na saída
print(texto[:5]) ##Quando omito o início, a contagem começa de 0
print(texto[15:]) ##Indico o início mas omito o final e ele fatia até o final da string
print(texto[9::3])##Indico o início e quantos elementos irá pular

##Análise
print(len(texto)) ##Imprime o tamanho da string
print(texto.count('o')) ##O programa faz contagem de quantas vezes aparece a letra o minúscula
print(texto.count('o',0,13)) ##Contagem juntamente com o fatiamento
print(texto.find('deo')) ##Indica onde o termo começou
print(texto.find('Android')) ##Retorna um valor -1, o que indica que a expressão não existe
print('Curso' in texto) ##Retorna valor booleano

##Transformação
print(texto.replace('python','Android')) ##Substitui o termo 'python' pelo termo 'Android'
print(texto.upper()) ##Torna o texto todo em letras maiúsculas e mantêm as que já estavam
print(texto.lower()) ##Torna o texto em minúsculo
print(texto.capitalize()) ##Pega a string completa e joga apenas o primeiro caractere para maiúsculo
print(texto.title()) ##Analisa palavra por palavra e torna o primeiro caractere de cada em maiúscula
print(frase.strip()) ##Remove os espaços em branco no início e final da string --> Nesse caso utilizou-es outra string pra exemplificar
print(frase.rstrip())##Remove espaços à direita da string
print(frase.lstrip())##Remove espaços à esquerda


##Divisão
print(texto.split()) ##Divisão dentro da string considerando os espaços entre as palavras

##Junção
teste = texto.split()
print('-'.join(teste)) ##Junta os elementos da string com o elemento colocado 
