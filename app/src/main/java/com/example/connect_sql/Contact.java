package com.example.connect_sql;

public class Contact {
    String _name;


    public Contact() {
    }

    public Contact(String name){
        this._name = name;
    }


    public String getName(){
        return this._name;
    }

    public void setName(String name){
        this._name = name;
    }

}