#language: en
Feature: Calculadora de notacao polonesa inversa (Reverse Polish Notation)

	Scenario Outline: calculo de uma expressao matematica
	Given Eu insiro como entrada "<expressao>"
	 When Eu quero calcular o resultado dessa expressao
	 Then Eu tenho "<resultado>"
	 
	 Examples:
	 |     expressao      | resultado |
	 |        6 14 +      |     20    |
	 | 5 1 2 + 4 * + 3 -  |     14    |
	