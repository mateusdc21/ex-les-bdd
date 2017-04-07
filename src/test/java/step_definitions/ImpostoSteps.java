package step_definitions;

import static org.testng.AssertJUnit.assertEquals;
import impostoRenda.*;
import cucumber.api.java.en.*;

public class ImpostoSteps {

	double salario;
	double aPagar;
	
	ImpostoRenda impostoRenda;
	
    @Given("^Eu ganho \"(.*?)\" por mes$")
    public void eu_ganho_something_por_mes(String renda) throws Throwable {
        salario = Double.parseDouble(renda);
        impostoRenda = new ImpostoRenda();
    }

    @When("^eu vou declarar o imposto de renda$")
    public void eu_vou_declarar_o_imposto_de_renda() throws Throwable {
    	impostoRenda.calculaImposto(salario);
    }

    @Then("^eu pago \"(.*?)\" de imposto$")
    public void eu_pago_something_imposto(String imposto) throws Throwable {
    	aPagar = impostoRenda.getImpostoAPagar();
    	assertEquals(Double.parseDouble(imposto), aPagar);
    }
}
