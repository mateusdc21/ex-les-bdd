package impostoRenda;

public class Faixa5ImpostoStrategy implements ImpostoStrategy {

    public double calculaImposto(double valor) {
        double valorFinal = valor * 0.275;
        return valorFinal;
    }
    
}
