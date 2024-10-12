package com.mcj.resturant_management_system.Modals;

import java.util.ArrayList;
import java.util.List;


public class Data_Lists {

    static public List<User> users = new ArrayList<>();
    
    static public void AddUser(User user){
        users.add(user);
    }
    
    static public List GetUsers(){
        return users;
    }
}
