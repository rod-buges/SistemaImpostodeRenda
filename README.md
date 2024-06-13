## Sistema de Cálculo de Imposto de Renda - (Prof. Lucas Alberto Schlestein)

Cansado de conferir os descontos em sua folha de pagamento manualmente, João da Silva lhe
contratou para escrever um aplicativo que faça o cálculo do valor de imposto de renda a ser
recolhido de seu salário. A tabela de descontos do IRPF 2024 é a seguinte:

![image](https://github.com/rod-buges/SistemaImpostodeRenda/assets/99702723/289d4648-756b-4af8-8c68-bea4e3020b20)

A tabela abaixo mostra um exemplo de cálculo para um salário de R$ 4.000,00:

![image](https://github.com/rod-buges/SistemaImpostodeRenda/assets/99702723/c24a2cec-a1bf-4b95-b82b-f75a16147097)

Sabendo disso escreva uma classe Pessoa deve receber via construtor os atributos nome(String)
e salário (double);

Em seguida crie uma classe FaixaImpostoDeRenda. Essa classe retorna um inteiro conforme a
faixa da tabela-1. Crie outra classe ImpostoDeRenda que receberá como parâmetro um objeto da
classe Pessoa, em seu construtor. A classe ImpostoDeRenda deverá ter um método calcular( ),
calculando o IR a pagar e definindo a faixa de IR da pessoa e também o método imprimir( ), que
deverá imprimir as informações na tela.

Após na classe principal crie alguns objetos do tipo Pessoa e ImpostoDeRenda e imprima no
console.

Ex.:

Lucas seu salário é R$ 5700,00 sua faixa de imposto é 5 e o valor do imposto de renda a ser pago
é: R$ 682,54

Bônus.
Adquira as informações de nome e salário da classe Pessoa via console, utilizando a classe
Scanner;

Ex.:

![image](https://github.com/rod-buges/SistemaImpostodeRenda/assets/99702723/1ee278e2-66dd-4d3a-b613-c32fc6819076)

