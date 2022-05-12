import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "calculator.do", value = "/calculator.do")
public class calculatordo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        Integer op1 = Integer.parseInt(request.getParameter("op1")) ;
        Integer op2 = Integer.parseInt(request.getParameter("op2"));
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();

        Integer end1 = op1 + op2;
        Integer end2 = op1 - op2;

        if(request.getParameter("operator").equals("+")){
            out.println(op1+"+"+op2+"="+end1);
        }else {
            out.println(op1+"-"+op2+"="+end2);
        }
    }
}
