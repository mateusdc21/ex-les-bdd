package impostoRenda;

public class Faixa4ImpostoStrategy implements ImpostoStrategy {

    public double calculaImposto(double valor) {
        double valorFinal = valor * 0.225;
        return valorFinal;
    }
    
}
