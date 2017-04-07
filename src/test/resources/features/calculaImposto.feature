#language: en
Feature: Calculadora de imposto de renda

  Scenario Outline: calculo do valor a ser pago no imposto de renda
    Given Eu ganho "<salario>" por mes
     When eu vou declarar o imposto de renda
     Then eu pago "<imposto>" de imposto
     
    Examples:
    |   salario   | imposto |
    |     0       |    0    |
    |    1500     |    0    |
    |    2000     |   150   |
    |    3000     |   450   |
    |    4000     |   900   |
    |  4271.60    | 1174.69 |

