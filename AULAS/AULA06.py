print('='*7 + 'DESAFIO 004' + '='*7)
n = input('Digite algo: ')
print(type(n))

print('O seu algo digitado é número? ')
print(n.isnumeric())
print('O seu algo digitado é letra? ')
print(n.isalpha())
print('Se for letra, é maiúscula? ')
print(n.isupper())
print('é minúscula? ')
print(n.islower())
