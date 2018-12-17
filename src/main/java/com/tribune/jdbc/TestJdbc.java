package com.tribune.jdbc;


import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestJdbc {
    @Test
    public void testConnectionJdbc()throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/ssm?serverTimezone=UCT","root","123456");
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery("select * from user");
        while(resultSet.next()){
            System.out.println(resultSet.getInt(1)+"/t"+
                    resultSet.getString(2)+"/t"+
                    resultSet.getString(3)+"/t"+
                    resultSet.getString(4)+"\t"+
                    resultSet.getInt(5)+"\t"+
                    resultSet.getInt(6));
        }
    }
}
