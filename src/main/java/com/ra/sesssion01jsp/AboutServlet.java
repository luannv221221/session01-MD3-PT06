package com.ra.sesssion01jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "aboutServlet",value = "/about")
public class AboutServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("Khởi chạy đầu tiên");
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        // Điều hướng trang
        req.getRequestDispatcher("about.jsp").forward(req,response);
    }
    @Override
    public void destroy() {
        System.out.println("Huy servlet");
    }
}
