package controller;

import model.User;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author Elattar Saad
 */
@WebServlet(name = "AuthServlet", urlPatterns = "/authentication")
public class AuthenticationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = UserService.login(username,password);
        if (user == null){
            request.setAttribute("isActivated",true);
            request.getRequestDispatcher("view/authentication.jsp").forward(request,response);
        }else{
            HttpSession session = request.getSession();
            session.setAttribute("connectedUser",user);
            response.sendRedirect("/artists");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("isActivated",false);
        request.getRequestDispatcher("view/authentication.jsp").forward(request,response);
    }
}
