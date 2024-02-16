print('{}'.format('\033[7m=\033[m'*8),'\033[7mCHALLENGE039\033[m','{}'.format('\033[7m=\033[m'*8))

anoNascimento = int(input('Digite o ano de nascimento: '))
anoBase = 2000
anoAtual = 2024
calc = (anoNascimento - anoBase)
if anoNascimento <=2000 or anoNascimento<=2005:
    calcIdade = anoAtual - anoNascimento
    print('O jovem possui {} anos em {}'.format(calcIdade, anoAtual))
    print('Expirado prazo de alistamento!')
elif anoNascimento ==2006:
        print('Hora de fazer o alistamento!')
elif anoNascimento > 2006:
    calcIdade = anoAtual - anoNascimento
    print('O jovem possui {} ano em {}'.format(calcIdade, anoAtual))
    print('Ainda vai se alistar!')