package com.ceica.Modelos;

import com.ceica.BBDD.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.PrimitiveIterator;

public class User extends ModeloBase {
    private String userName;
    private String password;
    private String rol;

    public User() {
    }

    public User(String userName, String password, String rol) {
        this.userName = userName;
        this.password = password;
        this.rol = rol;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public static boolean eliminarUser(String idUser) {
        Connection conn = Conexion.conectar();
        String sql = "delete from user where idUser=?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, idUser);
            if (pst.executeUpdate() > 0) {
                conn.close();
                return true;
            } else {
                conn.close();
                return false;
            }
        } catch (SQLException e) {
            //throw new RuntimeException(e);
            return false;
        }

    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", rol='" + rol + '\'' +
                '}';
    }

    @Override
    protected String getNombreTabla() {
        return null;
    }
}
