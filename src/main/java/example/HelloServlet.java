package example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/* web.xml에 등록할 필요없이
 * @WebServlet 어노테이션으로 servlet을 등록할 수 있다. 
 * urlPatterns으로 URL 매핑을 여러개로 지정하고 싶은 경우, 배열 값으로 지정해서 등록할 수 있다.*/
@WebServlet(urlPatterns = {"/hello", "/test"})
public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request,
		HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>인사</title></head>");
		out.println("<body>");
		out.println("안녕하세요, ");
		out.println(request.getParameter("name"));
		out.println("님");
		out.println("</body></html>");
	}

}