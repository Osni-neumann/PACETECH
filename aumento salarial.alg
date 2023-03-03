algoritmo "Aumento Salarial"


var
  Valor_salario:real
  Porcentagem_aumento:real
  Valor_final:real

inicio

Escreval(" digite o valor do salario que deseja dar o aumento: ")
  leia(valor_salario)
Escreval(" digite a porcentagem do aumento que deseja dar: ")
  leia( porcentagem_aumento)
// fazendo o cálculo do aumento
 Valor_final <- valor_salario*( 1+porcentagem_aumento/100 )
//Exibir na tela o resultado
Escreval("o valor final do salario com o aumento de:  ", Porcentagem_aumento , "% é de R$ ",valor_final :1:2)


fimalgoritmo
