package impostoRenda;

import java.math.BigDecimal;

public class ImpostoRenda {
	
    public ImpostoStrategy impostoStrategy;
    public double impostoAPagar;
    
    public void calculaImposto(double valor){
        if(valor <= 1710.78){
        	this.impostoStrategy = new Faixa1ImpostoStrategy();
        } else if(valor >= 1710.78 && valor <= 2563.91){
            this.impostoStrategy = new Faixa2ImpostoStrategy();
        } else if(valor >= 2563.92 && valor <= 3418.59){
            this.impostoStrategy = new Faixa3ImpostoStrategy(); 
        } else if (valor >= 3418.60 && valor <= 4271.59){
        	this.impostoStrategy = new Faixa4ImpostoStrategy();
		} else if(valor > 4271.59){
            this.impostoStrategy = new Faixa5ImpostoStrategy();
		}
        this.impostoAPagar = impostoStrategy.calculaImposto(valor);
        this.impostoAPagar = arredondaDuasCasas(impostoAPagar);
    }
    
	public double getImpostoAPagar() {
		return impostoAPagar;
	}
	
	public double arredondaDuasCasas(double aPagar){
		BigDecimal bd;
		bd = new BigDecimal(aPagar);
		bd = bd.setScale(2,BigDecimal.ROUND_HALF_UP);
		aPagar = bd.doubleValue();
		return aPagar;
	}
 
}

