package mypack;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(" CalculatorServlet")
public class CalculatorServlet extends GenericServlet {

    @Override
    public void service(ServletRequest request, ServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            double num1 = Double.parseDouble(request.getParameter("num1"));
            double num2 = Double.parseDouble(request.getParameter("num2"));
            String operation = request.getParameter("operation");

            double result = 0;

            // Perform operation
            switch (operation) {
                case "add":
                    result = num1 + num2;
                    break;
                case "sub":
                    result = num1 - num2;
                    break;
                case "mul":
                    result = num1 * num2;
                    break;
                case "div":
                    if (num2 != 0)
                        result = num1 / num2;
                    else
                        out.println("<h3>Division by zero is not allowed!</h3>");
                    break;
                default:
                    out.println("<h3>Invalid Operation!</h3>");
            }

            out.println("<h2>Result: " + result + "</h2>");

        } catch (NumberFormatException e) {
            out.println("<h3>Please enter valid numbers!</h3>");
        }

        out.println("<br><a href='calculator.html'>Back to Calculator</a>");
        out.close();
    }
}