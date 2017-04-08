package calculadoraPolonesa.model;

import java.util.Stack;
import calculadoraPolonesa.control.OperacaoInterpreter;

public class AdicaoInterpreter extends OperacaoInterpreter{
	
	private Stack<Double> stack;

	public AdicaoInterpreter(Stack<Double> stack) {
		this.stack = stack;
	}
	
	@Override
	public Double operacao() {
		Double result = null;
        if( stack.size() > 1) {
        	Double n1 = stack.pop();
        	Double n2 = stack.pop();
            result = n1 + n2;
        }
        return result;
	}

}
