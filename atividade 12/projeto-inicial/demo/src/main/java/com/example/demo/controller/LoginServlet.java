package com.example.demo.controller;

import com.example.demo.dao.EmployeeDAO;
import com.example.demo.model.Employee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.rmi.server.ExportException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    EmployeeDAO employeeDAO = new EmployeeDAO();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/view/login.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try {
            Employee employee = employeeDAO.login(username, password);
            request.setAttribute("employee", employee);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/view/dadosEmpregado.jsp");
            requestDispatcher.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
