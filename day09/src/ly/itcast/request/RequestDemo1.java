package ly.itcast.request;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestDemo1 extends HttpServlet {

	/**
	 *tomcat服务器接受到浏览器发送的请求数据，然后封装到HttpServletRequest对象
	 *tomcat服务器调用doGet方法，把request对象传入到servlet对象中
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//t1(request);
		
		/**
		 * 请求头
		 */
		//t2(request);
	}
	/**
	 * 请求内容
	 */
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		ServletInputStream inputStream = req.getInputStream();
		byte[] data = new byte[1024];
		int len;
		while((len = inputStream.read(data)) != -1){
			String str = new String(data,0,len);
			System.out.println(str);
		}
	}


	private void t2(HttpServletRequest request) {
		String host = request.getHeader("host");
		System.out.println(host);
		
		Enumeration<String> enums = request.getHeaderNames();
		while(enums.hasMoreElements()){
			String headerName = enums.nextElement();
			String headerValue = request.getHeader(headerName);
			System.out.println(headerName +":" + headerValue);
		}
	}

	private void t1(HttpServletRequest request) {
		System.out.println("请求方式"+request.getMethod());
		System.out.println("URI"+request.getRequestURI());
		System.out.println("URL"+request.getRequestURL());
		System.out.println("http协议版本"+request.getProtocol());
	}

}
