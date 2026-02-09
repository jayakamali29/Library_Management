package com.kce.book.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.kce.book.bean.BookBean;
import com.kce.book.util.DBUtil;

public class BookDAO {
    public int createBook(BookBean bookBean) {
        Connection con = DBUtil.getDBConnection();
        String query = "INSERT INTO BOOK_TBL VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, bookBean.getIsbn());
            ps.setString(2, bookBean.getBookName());
            ps.setString(3, String.valueOf(bookBean.getBookType()));
            ps.setInt(4, bookBean.getAuthor().getAuthorCode());
            ps.setDouble(5, bookBean.getCost());

            int rows = ps.executeUpdate();
            System.out.println("Rows inserted = " + rows);

            return rows;

        } catch (SQLException e) {
            System.out.println(e);
        }

        return 0;
    }

    public BookBean fetchBookByISBN(String isbn) {
        Connection con = DBUtil.getDBConnection();
        String query = "SELECT * FROM BOOK_TBL WHERE isbn = ?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, isbn);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                BookBean bookBean = new BookBean();
                bookBean.setIsbn(rs.getString(1));
                bookBean.setBookName(rs.getString(2));
                bookBean.setBookType(rs.getString(3).charAt(0));
                bookBean.setCost(rs.getFloat(5));
                bookBean.setAuthor(new AuthorDAO().getAuthor(rs.getInt(4)));
                return bookBean;
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
}
