import random

print('{}'.format('='*8), 'CHALLENGE028', '{}'.format('='*8))

number = random.randint(0,5)


pergunta = int(input('Qual número o computador está pensando? '))

if pergunta == number:
    print('Parabéns! Você venceu!')
else:
    print('Que pena! Você perdeu!')
    
print('{}'.format('='*8),' FIM ','{}'.format('='*8))