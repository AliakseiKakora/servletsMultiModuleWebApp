package by.itacademy.webcalculator;

import by.itacademy.calculator.SimpleCalculator;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SecondServlet", urlPatterns = "/secondServlet", loadOnStartup = 0)
public class SecondServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/firstServlet").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double firstNum = Integer.parseInt(request.getParameter("firstNum"));
        double secondNum = Integer.parseInt(request.getParameter("secondNum"));
        String operation = request.getParameter("operation");
        double result = SimpleCalculator.valueOf(operation.toUpperCase()).process(firstNum, secondNum);

        response.getWriter().println("Result = " + result);
    }

    @Override
    public void init() throws ServletException {
        System.out.println("secondServlet init");
        super.init();
    }
}
