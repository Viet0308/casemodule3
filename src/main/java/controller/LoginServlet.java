package controller;

import dao.LoginDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Account;
import service.ProductService;

import java.io.IOException;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
        dispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        Account account = LoginDAO.login(username,password);
            if (account!=null){
                if (account.getId_role() == 1){
                    req.setAttribute("sanphams", ProductService.products);
                    RequestDispatcher dispatcher = req.getRequestDispatcher("/user/user.jsp");
                    dispatcher.forward(req,resp);
                }else{
                    req.setAttribute("sanphams", ProductService.products);
                    RequestDispatcher dispatcher = req.getRequestDispatcher("/admin/showProduct.jsp");
                    dispatcher.forward(req,resp);
                }
            }else{
                resp.sendRedirect("/login.jsp");
            }

    }
}
