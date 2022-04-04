package com.example.connect_sql;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class Contact_Adapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Contact> contacts;
    private int positionSelected= -1;
    public Contact_Adapter(Context context, int layout, List<Contact> products) {
        this.context = context;
        this.layout = layout;
        this.contacts = products;
    }


    @Override
    public int getCount() {
        return  contacts.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = layoutInflater.inflate(layout,null);
        TextView textView = view.findViewById(R.id.txtName);

        Contact contact = contacts.get(i);
        textView.setText(contact.getName());

        return view;
    }
}
