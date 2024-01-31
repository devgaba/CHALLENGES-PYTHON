print('{}'.format('='*8),'CHALLENGE12','{}'.format('='*8))
precoProduto = float(input('Qual o valor do produto? '))
desconto = 5
calcDesconto = (precoProduto/100)*5
precoProduto -= calcDesconto
print('O preço do produto com desconto de {}% é R${:.2f}'.format(desconto,precoProduto))
print('{}'.format('='*10),' FIM ','{}'.format('='*10))
