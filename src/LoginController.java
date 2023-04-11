
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginController extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);

        User user=new User();
        user.setUsername(req.getParameter("username"));
        user.setPw(req.getParameter("password"));
        System.out.println("user = " + user);


        Gson gson = new Gson();
        String json = gson.toJson(new ResponseMsg(1, "loginSuccess"));

//        ResponseMsg msg=
//        JsonParseApp jsonParseApp = new JsonParseApp();
//        String json=jsonParseApp.msgParse(msg);

        resp.setContentType("application/json; charset=utf-8");
//        String json=JsonParseApp.msgParse(new ResponseMsg(1, "loginSuccess"));

        //Gson을 이용해 직렬화해 BW
        //역직렬화해 BR

        System.out.println("json = " + json);

        PrintWriter pw= resp.getWriter();
        pw.println(json);
    }
}
