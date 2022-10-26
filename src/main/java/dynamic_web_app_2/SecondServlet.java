package dynamic_web_app_2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
@WebServlet("/secondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SecondServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Object val = request.getAttribute("name");
		System.out.println(val);
		
		HttpSession session = request.getSession();
		Object x = session.getAttribute("sessionName");
		System.out.println(x);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Object val = request.getAttribute("name");
		System.out.println(val);
		
		HttpSession session = request.getSession();
		Object x = session.getAttribute("sessionName");
		System.out.println(x);
	}

}
