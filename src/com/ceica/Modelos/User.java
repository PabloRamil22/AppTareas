package com.ceica.Modelos;

import com.ceica.BBDD.Conexion;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
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
    public static boolean editarUserName(String idUser, String UserName){
        Connection conn = Conexion.conectar();
        String sql="update user set UserName = ? where idUser = ?";
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

    public static boolean editarPassWord(String idUser, String PassWord){
        Connection conn = Conexion.conectar();
        String sql="update user set PassWord = ? where idUser = ?";
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

    public static boolean editarRol(String idUser, String Rol){
        Connection conn = Conexion.conectar();
        String sql= "update user set Rol = ? where idUser = ?";
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
    public static List<User> getUser() {
        List<User> userList = new ArrayList<>();
        Connection conn = Conexion.conectar();
        String sql = "select * from user";
        try {
            Statement stm = conn.createStatement();
            ResultSet respuesta = stm.executeQuery(sql);
            while (respuesta.next()) {
                User user = new User();
                user.setUserName(respuesta.getString("UserName"));
                user.setPassword(respuesta.getString("PassWord"));
                user.setRol(respuesta.getString("Rol"));
                userList.add(user);

            }

        } catch (SQLException e) {
            //throw new RuntimeException(e);

            return userList;
        }
        try {
            conn.close();
        } catch (SQLException e) {
            //throw new RuntimeException(e);
        }
        return userList;
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
