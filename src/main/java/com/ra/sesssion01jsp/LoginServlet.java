package com.ra.sesssion01jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "loginServlet",value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("login.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Đã nhập phương thức POST");
        System.out.println(req.getParameter("email"));
        System.out.println(req.getParameter("passowrd"));
        String email = req.getParameter("email");
        // set thuoc tinh email vào doi tuong req
        req.setAttribute("email",email);
        req.getRequestDispatcher("hello.jsp").forward(req,resp);
    }
}
