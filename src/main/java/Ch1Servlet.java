import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class Ch1Servlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    PrintWriter out = resp.getWriter();
    Date today = new Date();
    out.println("<html>" + "<body>" + "<h1 align=center>HF' s Chapter1 Servlet</h1>" + "<br>" + today + "</body>" + "</html>");
  }
}
