package com.project.SnakeProject;

import lombok.extern.log4j.Log4j;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static org.junit.Assert.fail;
@Log4j
public class TestJAva {
    public static Connection oracleConn;
    public static String userid = "c##haksa";
    public static String password = "123456";
    public static String oracleUrl = "jdbc:oracle:thin:@localhost:1521:XE";

    static {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testConnection(){
        try {
            oracleConn = DriverManager.getConnection(oracleUrl, userid, password);
            System.out.println("성공" + oracleConn);
//            log.info(oracleConn);
        } catch (SQLException e) {
            fail("실패" + e.getMessage());
        }
    }

}
