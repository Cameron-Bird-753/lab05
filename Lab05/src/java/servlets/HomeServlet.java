/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author tweet
 */
public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
            String logoutUser = request.getParameter("logout");
            if (logoutUser != null){ //User is logged in and selected logout
                request.getSession().invalidate();
                response.sendRedirect("login");
                return;
            }
            
            if(request.getSession().getAttribute("user") == null){ //No user object, redirect to login
                response.sendRedirect("login");
                return;
            }
            //can only reach this step, if user object exists 
            getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
    }

}
