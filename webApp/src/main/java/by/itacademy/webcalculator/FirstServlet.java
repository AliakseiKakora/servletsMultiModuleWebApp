package by.itacademy.webcalculator;

import by.itacademy.calculator.SimpleCalculator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double firstNum = Integer.parseInt(request.getParameter("firstNum"));
        double secondNum = Integer.parseInt(request.getParameter("secondNum"));
        String operation = request.getParameter("operation");
        double result = SimpleCalculator.valueOf(operation.toUpperCase()).process(firstNum, secondNum);

        response.getWriter().println("Result = " + result);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/secondServlet").forward(request, response);
    }
}
