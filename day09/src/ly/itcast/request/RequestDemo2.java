package ly.itcast.request;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestDemo2 extends HttpServlet {

	/**
	 * tomcat���������ȵ���servlet��service��������service�жϵ���doGet����doPost����
	 */
/*	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println(req.getMethod());
		System.out.println("service�����Ѿ����ã���");
	}*/
	
	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


	}

}
