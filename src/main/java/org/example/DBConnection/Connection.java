package org.example.DBConnection;

import org.example.model.Item;

import java.util.ArrayList;

public class Connection {
    private static Connection con;
    private final ArrayList<Item> itemList;
    private Connection(){
        itemList=new ArrayList<>();
    }

    public static Connection getInstance(){
        if(con==null){
            return con=new Connection();
        }
        return con;
    }

    public ArrayList<Item> getItemList(){
        return itemList;
    }
}