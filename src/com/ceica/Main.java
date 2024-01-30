package com.ceica;

import com.ceica.Controladores.LoginController;
import com.ceica.Controladores.TareasController;
import com.ceica.Modelos.User;

import java.util.Scanner;

public class Main {
   /* public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        User user=new User();
        String idUser;
        System.out.println("Introduce el id del user: ");
        idUser=leer.nextLine();
        User.eliminarUser(idUser);


    }

    */


    public static void main(String[] args) {
        String usr, pass;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("Login usuario");
            System.out.print("Introduce Usuario: ");
            usr = leer.nextLine();
            System.out.print("Introduce password");
            pass = leer.nextLine();
            if (LoginController.login(usr, pass)) {
                System.out.println("Estoy en Tareas");

            } else {
                System.out.println("Usuario o Contraseña incorrecta");
            }
        } while (true);
    }



}