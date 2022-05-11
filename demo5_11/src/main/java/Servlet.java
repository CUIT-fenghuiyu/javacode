import java.io.*;
import java.util.Date;
import javax.servlet.http.*;
import javax.servlet.annotation.*;



public class Servlet extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset = utf-8");
        response.setIntHeader("Refresh",1);
        Date date = new Date();
        PrintWriter out = response.getWriter();
        out.println("当前时间：" + date);
    }
}