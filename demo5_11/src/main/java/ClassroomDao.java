import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.*;

@WebServlet(name = "ClassroomDao", value = "/ClassroomDao")
public class ClassroomDao {
    /**
     * 要求实现从classroom表中根据教室编号code查询出一条教室数据，并封装为Classroom对象返回
     *
     * @return 查询到的Classroom对象
     */

    public Classroom findBy(String code) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.1.1:8080/jspexam", "root", "root123");
        String sql = "select  * from classroom where code = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, code);
        ResultSet rs = ps.executeQuery(sql);

        if (rs == null) {
            return null;
        } else {
            Classroom classroom = new Classroom();
            classroom.setId(rs.getInt(1));
            classroom.setName(rs.getString(2));
            classroom.setCode(rs.getString(3));
            classroom.setCapacity(rs.getInt(4));
            return classroom;
        }
    }



    public int update (Classroom classroom) {
        return 0;
    }

}
