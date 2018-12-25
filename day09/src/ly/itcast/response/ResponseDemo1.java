package ly.itcast.response;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResponseDemo1 extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//��Ӧ��
		//response.setStatus(404);
		//response.sendError(404);//����404 + ����ҳ��
		
		/**
		 * ��Ӧ��
		 */
		response.setHeader("server", "JBoss");
		
		/**
		 * ʵ������
		 */
		//response.getWriter().write("1.hello world");
		response.getOutputStream().write("02.hello world".getBytes());
		
	}

}
