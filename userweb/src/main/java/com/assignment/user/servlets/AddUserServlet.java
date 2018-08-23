package com.assignment.user.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.assignment.user.bo.UserBo;
import com.assignment.user.dto.User;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;



/**
 * Servlet implementation class CreateProductServlet
 */
public class AddUserServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {

        Integer id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");

        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setEmail(email);

        WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(this.getServletContext());
        UserBo bo = (UserBo) context.getBean("userbo");
        bo.create(user);

        PrintWriter out = response.getWriter();
        out.print("User Created!!!");
        out.close();

    }

}