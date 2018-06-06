package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
//		response.setContentType("text/html");
//		PrintWriter writer = response.getWriter();	
//		Date date = new Date();
//		writer.println("<h2> Hi There! </h2> <br> <h3> Date = " + date +"</h3>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		//Recupero parametro da index.jsp
		String nome = request.getParameter("nome");
		
		if(nome.equals("Saverio")) {
			//Setto parametro nella request
			request.setAttribute("nome", nome);

			//Invio la request/response alla jsp 1.jsp
			RequestDispatcher reqd = request.getRequestDispatcher("1.jsp");
			reqd.forward(request, response);

		} else {
			//Invio la request/response alla jsp 1.jsp
			RequestDispatcher reqd = request.getRequestDispatcher("index.jsp");
			reqd.forward(request, response);			
		}
	}
	
//	@Override
//	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		
//	}
}
