print('{}'.format('='*8),'CHALLENGE029','{}'.format('='*8))

velocidade = int(input('Qual a velocidade do carro? '))

if velocidade > 80.00:
    multa = 7
    calcMulta = (velocidade - 80) * multa
    print('Você foi multado por excesso de velocidade!')
    print('A multa vai custar R${} por cada Km acima do limite'.format(multa))
    print('O valor da multa é {}'.format(calcMulta))
    
print('{}'.format('='*8),' FIM ','{}'.format('='*8))