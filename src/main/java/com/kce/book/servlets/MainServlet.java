package com.kce.book.servlets;

import java.io.IOException;

import com.kce.book.DAO.AuthorDAO;
import com.kce.book.bean.BookBean;
import com.kce.book.service.Administrator;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String operation = request.getParameter("operation");
        if ("addBook".equalsIgnoreCase(operation)) {
            String result = addBook(request);
            if ("SUCCESS".equals(result)) {
                response.sendRedirect("Menu.html");
            }
            else if ("INVALID".equals(result)) {
                response.sendRedirect("Invalid.html");
            }
            else if ("FAILURE".equals(result)) {
                response.sendRedirect("Failure.html");
            }
        }
        else if ("search".equalsIgnoreCase(operation)) {
            String isbn = request.getParameter("isbn");
            BookBean bookBean = viewBook(isbn);

            if (bookBean == null) {
                response.sendRedirect("Invalid.html");
            } else {
                HttpSession session = request.getSession();
                session.setAttribute("book", bookBean);
                RequestDispatcher rd = request.getRequestDispatcher("ViewServlet");
                rd.forward(request, response);
            }
        }
    }

    public String addBook(HttpServletRequest request) {

        String isbn = request.getParameter("isbnNumber");
        String bookName = request.getParameter("bookName");
        String bookType = request.getParameter("bookType");
        String authorName = request.getParameter("authorName");
        String cost = request.getParameter("cost");

        BookBean bookBean = new BookBean();
        bookBean.setIsbn(isbn);
        bookBean.setBookName(bookName);
        bookBean.setBookType(bookType.charAt(0));
        bookBean.setCost(Float.parseFloat(cost));
        bookBean.setAuthor(new AuthorDAO().getAuthor(authorName));

        return new Administrator().addBook(bookBean);
    }

    public BookBean viewBook(String isbn) {
        return new Administrator().viewBook(isbn);
    }
}
