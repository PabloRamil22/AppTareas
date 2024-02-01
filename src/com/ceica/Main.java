package com.ceica;

import com.ceica.Controladores.TareasController;
import com.ceica.Modelos.User;

public class Main {

    public static void main(String[]args){
        TareasController tareasController=new TareasController();
        System.out.println(tareasController.createUser("Pablo", "123", 4));
    }
}