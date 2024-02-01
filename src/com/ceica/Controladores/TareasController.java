package com.ceica.Controladores;

import com.ceica.Modelos.User;

public class TareasController {
    private User userLogged;
    public boolean createUser(String username, String pass, int rol){
        User user=new User();
        return user.insertar("(UserName, PassWord, idRol) values(?,?,?)",username,pass,rol);
    }
}
