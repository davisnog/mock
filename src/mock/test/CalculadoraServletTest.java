package mock.test;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mock.CalculadoraServlet;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class CalculadoraServletTest {
	@Mock
	private HttpServletRequest req;
	@Mock
	private HttpServletResponse res;
	@Mock
	private PrintWriter out;
	
	@Before
	public void setUp(){
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void deveRetornarOResutladoDaSoma() throws Exception{
		when(req.getParameter("a")).thenReturn("3");
		when(req.getParameter("b")).thenReturn("2");
		when(res.getWriter()).thenReturn(out);
		
		CalculadoraServlet calculadora = new CalculadoraServlet();
		calculadora.service(req, res);
		
		verify(out).println("O resultado é 5");
	}
}
