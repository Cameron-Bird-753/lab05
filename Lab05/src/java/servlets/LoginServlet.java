/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.User;
import services.AccountService;

/**
 *
 * @author tweet
 */
public class LoginServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
              AccountService as = new AccountService();
              String username = request.getParameter("username");
              String password = request.getParameter("password");
              User checkUser = as.loginChecker(username, password);
              System.out.println("AS is: " + as);
              
              if(checkUser == null){
                  request.setAttribute("message", "Invalid Login, Please try again");
                  getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
              }
              request.getSession().setAttribute("user", username);
              response.sendRedirect("home");
    }
}
