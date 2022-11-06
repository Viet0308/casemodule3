package controller;

import dao.SignupDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Account;

import java.io.IOException;
@WebServlet(urlPatterns = "/signup")
public class SignupServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        Account account = new Account();
        account.setUsername(username);
        account.setPassword(password);
        account.setId_role(1);

        SignupDAO.save(account);
        resp.sendRedirect("/login");
    }
}
