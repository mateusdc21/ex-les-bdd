## 06/04/2017 - O começo

Já dizia o ditado, antes tarde do que nunca. Enfim sentei pra me dedicar aos exercícios ontem à noite e então começar toda aquela configuração trabalhosa para poder trabalhar com o cucumber no eclipse. Algumas horas \(e palavrões fofinhos, e. g. pantufa apertada\) depois, consegui colocar o projeto pronto para usar e começar a escrever os cenários do BDD para os exercícios.

Encontrei materiais interessantes para fazer a configuração, e vou inclusive listá-los aqui caso alguém precise \(ou caso eu mesmo tenha que fazer isso de novo\):

[http://www.seleniumframework.com/cucumber-jvm-first-project/](http://www.seleniumframework.com/cucumber-jvm-first-project/ "Tutorial passo a passo para configurar o ambiente java")

[https://www.youtube.com/watch?v=h1hNPnmMfac](https://www.youtube.com/watch?v=h1hNPnmMfac "Tutorial da equipe Selenium Framework para execução do primeiro projeto com cucumber")

Chegando a parte que interessa, fui escrever os testes. Foi a primeira vez que tentei pra valer codificar o comportamento de um programa e consegui entender melhor todo o funcionamento da coisa, é diferente de ficar só nas leituras. Inclusive consegui enxergar melhor a diferença entre BDD e TDD. No primeiro estamos descrevendo como o sistema deve se comportar diante do caso de uso, na linguagem alto nível Gherkin. Já no caso do TDD, estamos apenas escrevendo testes simples de funções \(pelo menos era isso que eu fazia\), os testes unitários, que pra ser sincero eu não acho que ajuda muita coisa pro desenvolvedor.

Para o exercício do imposto de renda, criei um cenário apenas, descrevendo como dado o salário bruto que a pessoa recebe por mês, e quando ela vai calcular o valor a ser pago de imposto, então validamos se o sistema se comporta de maneira adequada retornando o valor esperado de acordo com a faixa de cálculo que a pessoa se encontra.

Além disso apliquei também o padrão Estratégia conforme o enunciado pedia, para deixar o código mais organizado e com melhor manutenabilidade.





