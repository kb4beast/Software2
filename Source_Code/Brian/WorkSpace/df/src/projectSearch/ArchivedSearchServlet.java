package projectSearch;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ArchivedSearchServlet")
public class ArchivedSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ArchivedSearchServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		String searchStringQuery = request.getParameter("searchStringQuery");
 

		String region  = request.getParameter("region");
		String ProjetType  = request.getParameter("ProjetType");


		out.println("DO STUFF WITH search string,region, and type in ARCHIVED PROJECTINFO"+ " <br>");

		out.println("searchStringQuery: "+searchStringQuery + "<br>");
		out.println("region: "+region+ "<br>");
		out.println("ProjetType: "+ProjetType+ "<br>");
 


	}




}
