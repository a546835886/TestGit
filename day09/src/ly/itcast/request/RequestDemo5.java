package ly.itcast.request;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestDemo5 extends HttpServlet {

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
		//该方法只能对实体内容的编码方式有效
		request.setCharacterEncoding("utf-8");
		
/*		System.out.println("get方式提交");
		System.out.println(request.getQueryString());*/
		String name = request.getParameter("name");
		if("GET".equals(request.getMethod())){
			name = new String(name.getBytes("iso-8859-1"),"utf-8");
		}
		
		String password = request.getParameter("password");
		if("GET".equals(request.getMethod())){
			password = new String(password.getBytes("iso-8859-1"),"utf-8");
		}
		System.out.println(name+"="+password);
		System.out.println("======================");
		Enumeration<String> parameterNames = request.getParameterNames();
		while(parameterNames.hasMoreElements()){
			String name1 = parameterNames.nextElement();
			
			
			/**
			 * 多个值的遍历
			 */
		if("hobit".equals(name1)){
			String[] hobits = request.getParameterValues("hobit");
			System.out.print(name1+"=");
			for (String str : hobits) {
				if("GET".equals(request.getMethod())){
					str = new String(str.getBytes("iso-8859-1"),"utf-8");
				}
				System.out.print(str+",");
			}System.out.println();
		}else{
			String value = request.getParameter(name1);
			if("GET".equals(request.getMethod())){
				value = new String(value.getBytes("iso-8859-1"),"utf-8");
			}
			System.out.println(name1 +"="+value);
		}
			
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
/*		InputStream in = request.getInputStream();
		byte[] data = new byte[1024];
		int len;
		System.out.println("POST方式提交");
		while((len = in.read(data))!=-1){
			System.out.println(new String(data,0,len));
		}*/
		this.doGet(request, response);
	}

}
