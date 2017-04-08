package step_definitions;

import static org.testng.Assert.assertEquals;

import calculadoraPolonesa.control.Calculadora;
import cucumber.api.java.en.*;

public class CalculadoraPolonesaSteps {
	Calculadora calc;
	String expressao;
	Double resultado;

	@Given("^Eu insiro como entrada \"(.*?)\"$")
	public void eu_insiro_como_entrada(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		expressao = arg1;
	    calc = new Calculadora();
	}

	@When("^Eu quero calcular o resultado dessa expressao$")
	public void eu_quero_calcular_o_resultado_dessa_expressao() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    resultado = calc.avaliaExpressao(expressao);
	}

	@Then("^Eu tenho \"(.*?)\"$")
	public void eu_tenho(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		assertEquals(Double.parseDouble(arg1), this.resultado);
	}
}
