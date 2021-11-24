package com.example.smilemaker;


import java.util.ArrayList;
public class usermodal {
    public ArrayList<user> allUsers;


    static private usermodal theInstance = null;


    static public usermodal getSingleton() {
        if(theInstance == null) {
            theInstance = new usermodal();
        }
        return theInstance;
    }


    private usermodal() {

        allUsers = new ArrayList<>();

    }


    public static class user {

        public String login;
        public String password;
        public String email;
        public  String gender;


        //Constructor for Player class
        public user(String login,String  password,String email, String gender) {
            this.login = login;
            this.password = password;
            this.email = email;
            this.gender = gender;
        }


    }
}

