package mock;

import javax.servlet.http.HttpServletRequest;

public class Calculadora {

	public int soma(HttpServletRequest req){
		String numero1 = req.getParameter("a");
		String numero2 = req.getParameter("b");
		
		Integer a = Integer.parseInt(numero1);
		Integer b = Integer.parseInt(numero2);
		return a + b;
	}
}
