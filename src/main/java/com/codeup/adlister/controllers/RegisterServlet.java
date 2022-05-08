package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.dao.Users;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO: show the registration form
        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Users usersDao = DaoFactory.getUsersDao();

        // TODO: ensure the submitted information is valid
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        boolean usernameDoesntExist = false;
        boolean fieldsNotNull = false;
        boolean fieldsNotEmpty = false;


        // TODO: ensure that only new usernames are registered
        // call dao factory users dao
        // searchByUserName
        User existingUser = usersDao.findByUsername(username);
        if (existingUser == null) {
            usernameDoesntExist = true;
        }
        // pass the user name to the dao method and if not exists then set emailDoesntExist


        // no null fields
        if (username != null && email != null && password != null) {
            fieldsNotNull = true;
        }

        // no empty fields
        if (!username.isEmpty() && !email.isEmpty() && !password.isEmpty()) {
            fieldsNotEmpty = true;
        }


        // TODO: create a new user based off of the submitted information

        if (fieldsNotNull && fieldsNotEmpty && usernameDoesntExist) {
            // create user record with users dao
            User userToCreate = new User(username, email, password);
            // insert using the users dao
            // get users dao
            usersDao.insert(userToCreate);
            response.sendRedirect("/login?success");
        } else {
            response.sendRedirect("/register?errors");
        }
    }
}
