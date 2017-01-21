package myapp;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;


public class ListServlet extends HttpServlet {
  InputOutPut io=new InputOutPut();

  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws IOException {
    resp.setContentType("text/plain");
    List<String> list=new ArrayList<>();
    list.add("String in list");
    
    io.write(list);
    resp.getWriter().println(io.read().get(0));
   // resp.getWriter().println(list.get(0));
    
    
  }
}
