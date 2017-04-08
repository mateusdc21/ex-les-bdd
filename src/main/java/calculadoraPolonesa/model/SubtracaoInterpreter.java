package calculadoraPolonesa.model;

import java.util.Stack;

import calculadoraPolonesa.control.OperacaoInterpreter;

public class SubtracaoInterpreter extends OperacaoInterpreter{
	
	private Stack<Double> stack;

	public SubtracaoInterpreter(Stack<Double> stack) {
		this.stack = stack;
	}
	
	@Override
	public Double operacao() {
		Double result = null;
        if( stack.size() > 1) {
        	Double n1 = stack.pop();
        	Double n2 = stack.pop();
            result = n2 - n1;
        }
        return result;
	}

}
