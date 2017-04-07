$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/calculaImposto.feature");
formatter.feature({
  "line": 1,
  "name": "Calculadora de imposto de renda",
  "description": "",
  "id": "calculadora-de-imposto-de-renda",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "isento de imposto",
  "description": "Given: ate 1710.78 eu sou isento de pagar imposto\r\nAnd: eu ganho 1500 por mes\r\nThen: eu pago 0 imposto",
  "id": "calculadora-de-imposto-de-renda;isento-de-imposto",
  "type": "scenario",
  "keyword": "Scenario"
});
});