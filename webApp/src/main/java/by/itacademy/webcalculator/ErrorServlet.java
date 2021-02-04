package by.itacademy.webcalculator;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@WebServlet(name = "ErrorServlet", urlPatterns = "/errorServlet")
public class ErrorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        throwErrorWithCurrentTime();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        throwErrorWithCurrentTime();
    }

    private static void throwErrorWithCurrentTime() {
        String timePattern = "dd.MM.yyyy HH:mm:ss";
        LocalDateTime timestamp = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(timePattern);
        throw new RuntimeException(timestamp.format(formatter));
    }

}