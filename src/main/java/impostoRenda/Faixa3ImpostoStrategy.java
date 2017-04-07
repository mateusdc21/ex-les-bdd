package impostoRenda;

public class Faixa3ImpostoStrategy implements ImpostoStrategy {

    public double calculaImposto(double valor) {
        double valorFinal = valor * 0.15;
        return valorFinal;
    }
    
    
}
