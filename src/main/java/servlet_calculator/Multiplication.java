package servlet_calculator;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/product")
public class Multiplication extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int number1=Integer.parseInt(req.getParameter("num1"));
		int number2=Integer.parseInt(req.getParameter("num2"));
		res.getWriter().print("<h1> The Multiplication of"+" "+number1+" " +"and"+" "+number2+" "+"is"+" "+(number1*number2)+"</h2>");
		
	}

}
