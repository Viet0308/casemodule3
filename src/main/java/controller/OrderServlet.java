package controller;

import com.mysql.cj.Session;
import dao.CRUD_Product;
import dao.OrderDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Product;
import service.ProductService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/orders")
public class OrderServlet extends HttpServlet {
    List<Product> productList;

    public void init() throws  ServletException{
        productList = new ArrayList<>();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        int id = Integer.parseInt(req.getParameter("id"));
        Product product = OrderDAO.getProductById(id);

        if ("delete".equals(action)){
            delete(id);
        } else {
            if (product != null){
                productList.add(product);
            }
        }


        req.setAttribute("cart",productList);
        req.setAttribute("total",getTotal());
        RequestDispatcher dispatcher = req.getRequestDispatcher("user/cart.jsp");
        dispatcher.forward(req,resp);
    }

    public double getTotal(){
        double sum = 0;
        for (Product p: productList) {
            sum += p.getPrice();
        }
        return sum;
    }

    public void delete(int id){
        for (int i=0; i<productList.size(); i++){
            if (productList.get(i).getId()==id){
                productList.remove(i);
            }
        }
    }
}
