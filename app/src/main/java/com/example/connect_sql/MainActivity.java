package com.example.connect_sql;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;



import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView view = findViewById(R.id.name_text);
        Databasehandler db = new Databasehandler(this);

        // Inserting Contacts

//        Log.d("Insert: ", "Inserting ..");
//        db.addContact(new Contact("Hoàng Hoa Thuấn"));
//        db.addContact(new Contact("Trương Hồng Ngọc Trang "));
//        db.addContact(new Contact("Võ Đức Toàn "));
//        db.addContact(new Contact("Nguyễn Hoàn Hữu"));

        // Reading all contacts
        Log.d("Reading: ", "Reading all contacts..");
        List<Contact> contacts = db.getAllContacts();

        for (Contact cn : contacts) {
            String log =  "Name: " + cn.getName();
            // Writing Contacts to log
            Log.d("Name: ", log);
        }

        List<Contact> name = db.getAllContacts();
        Contact_Adapter contact_adapter = new Contact_Adapter(this,R.layout.name_text,name);
        view.setAdapter(contact_adapter);



    }
}