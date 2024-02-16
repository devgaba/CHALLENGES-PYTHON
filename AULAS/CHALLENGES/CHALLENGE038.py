print('{}'.format('\033[7m=\033[m'*8),'\033[7mCHALLENGE038\033[m','{}'.format('\033[7m=\033[m'*8))

numberOne = int(input('Digite o primeiro número: '))
numberTwo = int(input('Digite o segundo número: '))

if numberOne > numberTwo:
    print('O número {} é maior que o número {}'.format(numberOne, numberTwo))
elif numberTwo > numberOne:
    print('O número {} é maior que o número {}'.format(numberTwo, numberOne))
else:
    print('Não existe valor maior, os dois são iguais')