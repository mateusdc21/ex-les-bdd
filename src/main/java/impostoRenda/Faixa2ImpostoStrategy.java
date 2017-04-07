package impostoRenda;

public class Faixa2ImpostoStrategy implements ImpostoStrategy {

    public double calculaImposto(double valor) {
        double valorFinal = valor * 0.075;
        return valorFinal;
    }
    
}
