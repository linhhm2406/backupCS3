package controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MainAdminNavigateServlet",urlPatterns = "/mainAdminNavigateServlet")
public class MainAdminNavigateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String target= req.getParameter("target");
        RequestDispatcher requestDispatcher;
        if (target==null){
            target = "";
        }
        switch (target){
            case "productManagement":
                requestDispatcher = req.getRequestDispatcher("/admin/productManagement.jsp");
                requestDispatcher.forward(req,resp);
                break;
            case "categoryManagement":
                requestDispatcher = req.getRequestDispatcher("/categoryServlet");
                requestDispatcher.forward(req,resp);
                break;
            case "accountManagement":
                requestDispatcher = req.getRequestDispatcher("/accountServlet");
                requestDispatcher.forward(req,resp);
                break;
            case "reportManagement":
                requestDispatcher = req.getRequestDispatcher("/reportServlet");
                requestDispatcher.forward(req,resp);
                break;
            case "orderManagement":
                resp.sendRedirect("/accountServlet");
                break;

        }
    }
}
