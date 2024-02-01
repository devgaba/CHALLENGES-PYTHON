print('{}'.format('='*8),'Notas e Moedas - Contador','{}'.format('='*8))
numero = float(input('Digite o valor que será contabilizado R$ '))
print('\n')

notasCem = numero // 100
numero = numero - notasCem*100
notasCinq = numero // 50
numero = numero - notasCinq*50
notasVinte = numero // 20
numero -= notasVinte*20
notasDez = numero//10
numero -= notasDez*10
notasCinc = numero//5
numero -= notasCinc*5
notasDois = numero//2
numero -= notasDois*2
notasUm = numero//1
numero -= notasUm*1

moedasCinq = numero//0.5
numero -= moedasCinq*0.5
moedasVin = numero//0.25
numero -= moedasVin*0.25
moedasDez = numero//0.10
numero -= moedasDez*0.10
moedasCinc = numero//0.05
numero -= moedasCinc*0.05
cent = numero//0.01
numero -= cent*0.01

print('NOTAS:\n'
    '{:.0f} nota (s) de R$ 100.00\n'.format(notasCem),
    '{:.0f} nota (s) de R$ 50.00\n'.format(notasCinq),
    '{:.0f} nota (s) de R$ 20.00\n'.format(notasVinte),
    '{:.0f} nota (s) de R$ 10.00\n'.format(notasDez),
    '{:.0f} nota (s) de R$ 5.00\n'.format(notasCinc),
    '{:.0f} nota (s) de R$ 2.00\n'.format(notasDois)
      )
print('MOEDAS:\n'
      '{:.0f} moeda (s) de R$ 1.00\n'.format(notasUm),
      '{:.0f} moeda (s) de R$ 0.50\n'.format(moedasCinq),
      '{:.0f} moeda (s) de R$ 0.25\n'.format(moedasVin),
      '{:.0f} moeda (s) de R$ 0.10\n'.format(moedasDez),
      '{:.0f} moeda (s) de R$ 0.05\n'.format(moedasCinc),
      '{:.0f} moeda (s) de R$ 0.01\n'.format(cent)
      )

print('{}'.format('='*8),' FIM ','{}'.format('='*8))
