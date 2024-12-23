package com.codegym.simple_dictionary;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

//@WebServlet(name = "TranslateServlet", urlPatterns = "/display-discount")
@WebServlet(name = "TranslateServlet", urlPatterns = "/calculate")
public class TranslationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        /*String description = request.getParameter("txtDescription");
        String price = request.getParameter("txtPrice");
        String discountPercent = request.getParameter("txtDiscountPercent");

        // Discount Amount = List Price * Discount Percent * 0.01
        Double discountAmount = Double.parseDouble(price) * Double.parseDouble(discountPercent) * 0.01;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        String result =discountAmount.toString();
        if(result != null){
            writer.println("Discount Amount: " + result);
        } else {
            writer.println("Not found");
        }
        writer.println("</html>");*/

        Integer num1 = Integer.parseInt(request.getParameter("txtNum1"));
        Integer num2 = Integer.parseInt(request.getParameter("txtNum2"));
        String operator = request.getParameter("txtOperator");

        Integer result = 0;
        try {
            result = calculate(num1, num2, operator);
        } catch (Exception e) {
            throw new ServletException("/ cho 0");
        }

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        String kq = result.toString();
        if (result != null) {
            writer.println("KQ: " + result);
        } else {
            writer.println("Not found");
        }
        writer.println("</html>");

    }

    public static int calculate(int num1, int num2, String operator) {
        int result = 0;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":

                result = num1 / num2;

                break;
        }
        return result;
    }
}
