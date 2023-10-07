package demoservlet_2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ParamServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String thao = req.getParameter("phong");
		resp.getWriter().append("<h1>")
							.append("hello, ").append(thao)
						.append("</h1>");
	}

}
