package ly.itcast.response;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResponseDemo4 extends HttpServlet {

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
		
		
		//response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		response.getWriter().write("<html><head><title>this is tilte</title></head><body>中国</body></html>");
		//response.getWriter().write("<html><head><title>this si title</title></head><body>计算机网络</body></html>");
		//response.getOutputStream().write("<html><head><title>this is tilte</title></head><body>中国</body></html>".getBytes());
		
		
		/**
		 * 下载图片：Content-Disposition", "attachment; filename="+文件名
		 */
/*		File file = new File("f:/图片/1357467036155.jpg");
		response.setHeader("Content-Disposition", "attachment; filename="+file.getName());
		response.setContentType("image/jpg");
		FileInputStream in = new FileInputStream(file);
		byte[] data = new byte[1024];
		int len;
		while((len = in.read(data))!=-1){
			response.getOutputStream().write(data, 0, len);
		}*/
		
	}

}
