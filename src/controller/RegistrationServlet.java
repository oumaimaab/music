package controller;

import model.User;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Elattar Saad
 */
@WebServlet(name = "RegisterServlet", urlPatterns = "/registration")
public class RegistrationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (!request.getParameter("password").equals(request.getParameter("passwordConfirmation"))){
            request.setAttribute("isPasswordNotMatching", true);
            request.getRequestDispatcher("view/registration.jsp").forward(request,response);
        }else{
            User user = new User(request.getParameter("fullName"),request.getParameter("email"),request.getParameter("username"),request.getParameter("password"));
            try {
                UserService.register(user);
                request.setAttribute("isRegistrationSucceeded", true);
                request.getRequestDispatcher("view/authentication.jsp").forward(request,response);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("isPasswordNotMatching", false);
        request.getRequestDispatcher("view/registration.jsp").forward(request,response);
    }
}
