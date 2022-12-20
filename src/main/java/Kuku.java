

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Kuku
 */
@WebServlet("/Kuku")
public class Kuku extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int ans = 0;
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\"/>");
		out.println("<title>九九の表</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h3>九九の表</h3>");
		out.println("<table border=3>");
		for(int i = 0; i < 10; i++) {
			out.println("<tr>");
			for(int k = 0; k < 10; k++) {
				if(i == 0 && k ==0) {
					out.println("<th></th>");
					continue;
				}
				if(i == 0 && k != 0) {
					out.println("<th>" + k + "</th>");
					continue;
				}
				if(i != 0 && k == 0) {
					out.println("<th>" + i + "</th>");
					continue;
				}
				ans = i * k;
				out.println("<th>" + ans + "</th>");
				
			}
			out.println("</tr>");
		}
		out.println("");
		
		out.println("</table>");
		out.println("<p>以上</p>");
		out.println("</body>");
		out.println("");
		out.println("</html>");
	}

}
