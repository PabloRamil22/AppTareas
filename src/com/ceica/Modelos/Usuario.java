package com.ceica.Modelos;

import com.ceica.BBDD.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Usuario {
    public static boolean getUsuario(String usr,String pass){
        Connection conn=Conexion.conectar();
        String sql="select * from user where UserName=? and PassWord=?";
        try {
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setString(1,usr);
            pst.setString(2,pass);
            ResultSet resultSet=pst.executeQuery();
            if(resultSet.next()){
                return true;
            }else{
                return false;
            }
        } catch (SQLException e) {
            return false;
        }finally {
            try {
                conn.close();
            } catch (SQLException e) {

            }
        }

    }
}
