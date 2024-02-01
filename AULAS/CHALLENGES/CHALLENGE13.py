print('{}'.format('='*8),'CHALLENGE13','{}'.format('='*8))
salarioFunc = float(input('Salário do funcionário: R$ '))
aumento = 15
calcAumento = (salarioFunc*aumento)/100
salarioFunc += calcAumento
print('Novo salário com aumento de {}%: R${:.2f}'.format(aumento,salarioFunc))
print('\n')

#VERSÃO 002 COM OPÇÃO PARA DIGITAR A PORCENTAGEM A SER ACRESCIDA
print('{}'.format('='*3),'VERSÃO 2- CHALLENGE13','{}'.format('='*4))

salarioFunc = float(input('Salário do funcionário: R$ '))
aumento = float(input('Porcentagem de aumento salarial: '))
calcAumento = (salarioFunc*aumento)/100
salarioFunc += calcAumento
print('Novo salário com aumento de {:.2f}%: R${:.2f}'.format(aumento,salarioFunc))
print('{}'.format('='*8),'FIM','{}'.format('='*8))
