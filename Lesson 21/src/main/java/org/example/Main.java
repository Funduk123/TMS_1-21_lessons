package org.example;

import java.sql.*;

public class Main {
    private final static String url = "jdbc:postgresql://localhost:5432/postgres";
    private final static String user = "postgres";
    private final static String password = "12345";

    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection(url, user, password);
        PreparedStatement preparedStatement = connection.prepareStatement("select * from persons_hobby");

        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            String id_person = resultSet.getString("id_person");
            String id_hobby = resultSet.getString("id_hobby");
            System.out.println(id_person + " " + id_hobby);
        }

        resultSet.close();
        preparedStatement.close();
        connection.close();
    }
}