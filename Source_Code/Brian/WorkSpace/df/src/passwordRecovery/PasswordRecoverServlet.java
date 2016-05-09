package passwordRecovery;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet("/PasswordRecoverServlet")
public class PasswordRecoverServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public PasswordRecoverServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		String un = request.getParameter("userName");
		String email = request.getParameter("email");
		
		out.println("DO STUFF WITH USERNAME AND EMAIL IN PASSWORD RECOVERY"+ " <br>");

		out.println("name: "+un + "<br>");
		out.println("email: "+email+ "<br>");
		
	}

}
