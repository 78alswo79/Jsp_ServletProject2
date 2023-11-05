package example;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/* 서블릿 클래스를 구현하기 위해서 HttpServlet 클래스를 상속받아야 한다. */
public class NowServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* 서블릿 클래스를 상속받았다면, 처리하고자하는 HTTP 방식에 따라 알맞은 메소드를 정의한다.
		 * doGet(), doPost()...
		 * doGet() 메소드는 HttpServletRequest, HttpServletResponse의 두 파라미터를 갖는데,
		 * 이 두 파라미터는 JSP의 Request의 기본객체와 Response 기본객체에 해당한다. */
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>현재시간</title></head>");
		out.println("<body>");
		out.println("현재 시간은");
		out.println(new Date());
		out.println("입니다.");
		out.println("</body></html>");
	
	}
	
}
