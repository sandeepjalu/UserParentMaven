package com.assignment.user.servlets;

import com.assignment.user.bo.UserBo;
import com.assignment.user.dto.User;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class DisplayUserServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {

        WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(this.getServletContext());
        UserBo bo = (UserBo) context.getBean("userbo");
        int id = Integer.parseInt(request.getParameter("id"));

        User user = bo.read(id);

        PrintWriter out = response.getWriter();
        out.print("User Details\n");
        out.print("user id: "+user.getId()+"\n" +
                "user name: "+user.getName()+"\n" +
                "user email: "+user.getEmail());
        out.close();

    }

}