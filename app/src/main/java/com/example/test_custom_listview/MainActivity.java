package com.example.test_custom_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ListView;

import com.example.test_custom_listview.adapter.CustomAdapter;
import com.example.test_custom_listview.model.Contact;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lvContact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvContact = findViewById(R.id.lv);

        ArrayList<Contact> arrayList = new ArrayList<>();
        Contact item1 = new Contact(Color.RED, "Heo My", "098765442");
        Contact item2 = new Contact(Color.YELLOW, "Huyền My", "0129134135");
        Contact item3 = new Contact(Color.GREEN, "My ú", "1110102012");
        Contact item4 = new Contact(Color.CYAN, "My nọng", "1247325412");
        Contact item5 = new Contact(Color.MAGENTA, "My bụng mỡ", "0555555555");
        Contact item6 = new Contact(Color.GRAY, "My mập", "0129312466");
        Contact item7 = new Contact(Color.BLACK, "My heo", "09999999999");
        Contact item8 = new Contact(Color.BLUE, "Lê Huyền My", "0129397184");
        arrayList.add(item1);
        arrayList.add(item2);
        arrayList.add(item3);
        arrayList.add(item4);
        arrayList.add(item5);
        arrayList.add(item6);
        arrayList.add(item7);
        arrayList.add(item8);

        CustomAdapter customAdapter = new CustomAdapter(this, R.layout.row_item_contact, arrayList);
        lvContact.setAdapter(customAdapter);
    }
}
