print('{}'.format('\033[7m=\033[m'*8),'\033[7mCHALLENGE036\033[m','{}'.format('\033[7m=\033[m'*8))

valorCasa = float(input('Qual o valor da casa? '))
salarioComprador = float(input('Qual o seu salário? '))
tempoPagamento = int(input('Gostaria de pagar em quantos anos? '))

ano = 12
calcPrestacao = valorCasa / (ano * tempoPagamento)
calcExcedente = (salarioComprador / 100) * 30


if calcPrestacao > calcExcedente:
    print('Empréstimo negado!')
else:
    print('Empréstimo aceito! ')