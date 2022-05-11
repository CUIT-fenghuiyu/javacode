import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "login.do", value = "/login.do")
public class logindo extends HttpServlet {
    private String userName;
    private String pwd;
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.userName = config.getInitParameter("userName");
        this.pwd = config.getInitParameter("pwd");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String name = request.getParameter("userName");
        String password = request.getParameter("password");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();

        if(name.equals(userName) && password.equals(pwd)){
            out.println("登录成功");
            response.setHeader("refresh","5;url=/home.html");
        }else{
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }
    }
}
