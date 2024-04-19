package test1;

import java.sql.*;

public class BoardMember {

    public static void main(String[] args) {

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scott", "root", "adminuser");

            String sql = "SELECT b.boardnum, b.subject, b.content, b.writer, m.name, m.email " +
                    "FROM test_table_board b " +
                    "INNER JOIN test_table m ON b.writer = m.userid";

            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);


            while (rs.next()) {
                int boardnum = rs.getInt("boardnum");
                String subject = rs.getString("subject");
                String content = rs.getString("content");
                String writer = rs.getString("writer");
                String name = rs.getString("name");
                String email = rs.getString("email");

                System.out.println("BoardNum: " + boardnum);
                System.out.println("Subject: " + subject);
                System.out.println("Content: " + content);
                System.out.println("Writer: " + writer);
                System.out.println("Name: " + name);
                System.out.println("Email: " + email);
                System.out.println("--------------------------");
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {

            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}