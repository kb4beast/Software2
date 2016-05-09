package requestInfo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/RequestInfoServlet")
public class RequestInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public RequestInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		String name = request.getParameter("name");
		String phoneNumber = request.getParameter("phoneNumber");
		String email  = request.getParameter("email");
		
		String region  = request.getParameter("region");
		String typeOfRequest  = request.getParameter("typeOfRequest");
		
		
		out.println("DO STUFF WITH name, phone, email, region, and type in REQUEST INFO"+ " <br>");

		out.println("name: "+name + "<br>");
		out.println("phone: "+phoneNumber+ "<br>");
		out.println("email: "+email+ "<br>");
		
		out.println("region: "+region+ "<br>");
		out.println("typeOfRequest: "+typeOfRequest+ "<br>");
	}

}
