
package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author MSI2022
 */
public class HelloServlet extends HttpServlet{

    @Override
    public void init() throws ServletException {
        System.out.println("Bat dau servlet");
    }

    

    @Override
    public void destroy() {
        System.out.println("Ket thuc servlet");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       super.service(req, resp);
        System.out.println("Phuong thuc cua request " + req.getMethod());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        
        PrintWriter out = resp.getWriter();
        out.println("<h1>Xin chao servlet </h1> ");
        out.close();
        
    }
        
    
    
    
}
