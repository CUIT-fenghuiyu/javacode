import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "getSESSIONID", value = "/getSESSIONID")
public class getSESSIONID extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();

        Cookie[] cookies = request.getCookies();
        if(cookies == null){
            out.println("未使用Session");
            return;
        }

        for(Cookie cookie : cookies){
            if(cookie.getName().equals("JSESSIONID")){
                out.println("JSESSIONID=" + cookie.getValue());
                return;
            }
        }
        out.println("未使用Session");
    }
}
