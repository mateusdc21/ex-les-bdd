package calculadoraPolonesa.control;

import java.util.Stack;

import calculadoraPolonesa.model.*;

public class Calculadora {
	
	public Double avaliaExpressao(String expressao){
		Stack<Double> stack = new Stack<Double>();
		OperacaoInterpreter operacao;
		
        for(String token: expressao.split(" ")) {            
            
            if(token.equals("+")) {
                operacao = new AdicaoInterpreter( stack );
                Double result = operacao.operacao();
                if (result != null) { 
                    stack.push( result );                
                }
            }
            else if(token.equals("-")) {
            	operacao = new SubtracaoInterpreter( stack );
                Double result = operacao.operacao();
                if (result != null) { 
                    stack.push( result );                
                }
            }
            else if(token.equals("/")) {
            	operacao = new DivisaoInterpreter( stack );
                Double result = operacao.operacao();
                if (result != null) { 
                    stack.push( result );                
                }
            }
            else if(token.equals("*")) {
            	operacao = new MultiplicacaoInterpreter( stack );
                Double result = operacao.operacao();
                 if (result != null) { 
                    stack.push( result );                
                }
           }
            else {
                try {
                    Double numero = new Double(token);
                    stack.push(numero);
                }
                catch(Exception e) {
                    System.out.println("Operador invalido:: " + token);
                }
            }
        }
        return stack.pop();
	}

}
