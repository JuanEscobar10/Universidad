package Colegio;

import java.util.Scanner;

public class User {
    static Scanner sc = new Scanner(System.in);


    protected int id;
     String name;
     String mail;

     //Getters and Setters

    public  int getId(){
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Metodos
    public  void createUser(){
        id =1;
    }
    public void listUser(){

    }


    public static void cretae (){

    }
}
