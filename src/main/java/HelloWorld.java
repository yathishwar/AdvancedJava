
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
//			protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//				PrintWriter out = response.getWriter();
//				out.println("Hello World");
//				doPost(request,response);
//			}
//		
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		out.println("This data is from HTML Page");
		out.println("name: "+req.getParameter("username"));
		out.println("password: "+req.getParameter("password"));
	}
	
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException{
		PrintWriter out = res.getWriter();
		out.println("This is from get request method");
	}

}
