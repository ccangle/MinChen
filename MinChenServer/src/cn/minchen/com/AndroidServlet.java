package cn.minchen.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AndroidServlet
 */
public class AndroidServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AndroidServlet() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// 将Servlet中的字符串按照utf-8字符编码集进行编码
		response.setCharacterEncoding("utf-8");
		
		// 告诉浏览器以utf-8编码集对字符串进行解码
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter pw = response.getWriter();

		response.getWriter().append("Android Servlet访问成功");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
