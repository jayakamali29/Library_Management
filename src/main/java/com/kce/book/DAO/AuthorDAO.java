package com.kce.book.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.kce.book.bean.AuthorBean;
import com.kce.book.util.DBUtil;

public class AuthorDAO {

    
    public AuthorBean getAuthor(int authorCode) {

        AuthorBean author = null;
        Connection con = DBUtil.getDBConnection();
        String query = "SELECT * FROM AUTHOR_TBL WHERE AUTHOR_CODE = ?";

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, authorCode);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                author = new AuthorBean();
                author.setAuthorCode(rs.getInt("AUTHOR_CODE"));
                author.setAuthorName(rs.getString("AUTHOR_NAME"));
                author.setContactNo(rs.getLong("CONTACT_NO"));
            }

        } catch (SQLException e) {
            System.out.println(e);
        }

        return author;   
    }


    public AuthorBean getAuthor(String authorName) {

        AuthorBean author = null;
        Connection con = DBUtil.getDBConnection();
        String query = "SELECT * FROM AUTHOR_TBL WHERE AUTHOR_NAME = ?";

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, authorName);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                author = new AuthorBean();
                author.setAuthorCode(rs.getInt("AUTHOR_CODE"));
                author.setAuthorName(rs.getString("AUTHOR_NAME"));
                author.setContactNo(rs.getLong("CONTACT_NO"));
            }

        } catch (SQLException e) {
            System.out.println(e);
        }

        return author;   
    }
    
}
