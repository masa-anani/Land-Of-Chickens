/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class Test {

    public static void main(String[] args) {
       String url = "jdbc:oracle:thin:@localhost:1521:XE";
            String username="C##SAW_73";
            String password="123456";
            
            
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("good");
            Connection conn = DriverManager.getConnection(url,username,password);
             System.out.println("ggod"+conn);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }}
