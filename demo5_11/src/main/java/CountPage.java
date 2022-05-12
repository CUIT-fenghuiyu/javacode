import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CountPage", value = "/CountPage")
public class CountPage extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        ServletContext application = this.getServletContext();

        Integer count = (Integer) application.getAttribute("Count");
        if(count == null){
            count = 1;
        }else {
            count++;
        }
        application.setAttribute("Count",count);

        out.println("该Servlet已被访问了"+count+"次");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
