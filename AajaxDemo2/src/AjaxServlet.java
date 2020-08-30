import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;

@WebServlet("/log")
public class AjaxServlet extends HttpServlet  {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String s=req.getParameter("a");
		//Student s=new Student();
		//s.setname,rollno;
	//	String json=new GSon().tojson(s);
		//resp.setContentType("application/json");
		//resp.getWriter.write(json);
				resp.setContentType("plain/text");
		resp.setCharacterEncoding("UTF-8");
		resp.getWriter().write(s);
	}

}