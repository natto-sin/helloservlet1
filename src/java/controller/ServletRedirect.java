/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author MSI2022
 */
@WebServlet(urlPatterns = {"/cht"})
public class ServletRedirect extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //resp.sendRedirect("https://trungtamjava.com");
        resp.setStatus(resp.SC_MOVED_PERMANENTLY);
        resp.setHeader("Location", "https://trungtamjava.com");
    }
    
    
    
}
