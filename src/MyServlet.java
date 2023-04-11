import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

@WebServlet("*.do")
public class MyServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8");
        PrintWriter out = resp.getWriter();
        String html1 = "<html>\n" +
                "<head>\n" +
                "    <title>Index</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h1>Index Page</h1>\n" +
                "<hr/>\n";
        out.println(html1);

        // 자바 영역 파싱
        Random r = new Random();
        int num = r.nextInt(5) + 1;

        String html2 = "<h2>당신의 번호는 : ";
        out.println(html2);

        // 자바 영역 파싱
        out.println(num);

        String html3 = "</h2>\n" +
                "</body>\n" +
                "</html>";
        out.println(html3);
    }
}
