package cONTACTUS;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ContactUsServlet")
public class ContactUsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ContactUsServlet() {
		super();
		// TODO Auto-generated constructor stub
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		String un1 = request.getParameter("name");
		String un2 = request.getParameter("email");
		String un3 = request.getParameter("questionText");


		out.println("DO STUFF WITH NAME, EMAIL, QUESTION,   IN CONTACT US"+ " <br>");

		out.println("name: "+un1 + "<br>");
		out.println("email: "+un2+ "<br>");
		out.println("question: "+un3+ "<br>");
	}

}
