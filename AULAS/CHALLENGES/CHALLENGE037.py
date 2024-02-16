print('{}'.format('\033[7m=\033[m'*8),'\033[7mCHALLENGE037\033[m','{}'.format('\033[7m=\033[m'*8))


number = int(input('Digite um número : '))


if number==1:
    print('O número {} em binário fica: {}'.format(number, bin(number)))
elif number==2:
    print('O número {} em octal fica: {}'.format(number,oct(number)))
elif number==3:
    print('O número {} em hexadecimal fica: {}'.format(number, hex(number)))


