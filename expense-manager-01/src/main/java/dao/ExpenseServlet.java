package dao;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.*;
import java.sql.*;
import java.util.*;
import java.util.Date;

public class ExpenseServlet<Expense> extends HttpServlet {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/your_database";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "navid";

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Expense> expenses = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM expenses");
            while (rs.next()) {
                int id = rs.getInt("id");
                Date date = rs.getDate("date");
                String description = rs.getString("description");
                double amount = rs.getDouble("amount");
                expenses.add(new Expense(id, date, description, amount));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.setAttribute("expenses", expenses);
        request.getRequestDispatcher("Expense.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("description");
        String amountStr = request.getParameter("amount");
        double amount = Double.parseDouble(amountStr);

        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO expenses (date, description, amount) VALUES (CURDATE(), ?, ?)");
            stmt.setString(1, description);
            stmt.setDouble(2, amount);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        response.sendRedirect(request.getContextPath() + "/expenses");
    }
}
