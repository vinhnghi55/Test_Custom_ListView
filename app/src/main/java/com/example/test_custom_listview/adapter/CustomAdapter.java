package com.example.test_custom_listview.adapter;

import android.content.Context;
import android.nfc.Tag;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.test_custom_listview.R;
import com.example.test_custom_listview.model.Contact;

import java.security.spec.RSAPrivateCrtKeySpec;
import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter<Contact> {
    private Context context;
    private int resource;
    private ArrayList<Contact> arrContact;
    private final String Tag = getClass().getSimpleName();

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.arrContact = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder;

        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.row_item_contact, parent, false);

            viewHolder = new ViewHolder();
            viewHolder.tvColor = convertView.findViewById(R.id.tv_color);
            viewHolder.tvName = convertView.findViewById(R.id.tv_name);
            viewHolder.tvNumber = convertView.findViewById(R.id.tv_number);

            convertView.setTag(viewHolder);
            Log.d(Tag, "GetView "+(position+1));
        }
        else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Contact contact = arrContact.get(position);

        viewHolder.tvColor.setBackgroundColor(contact.getmColor());
        viewHolder.tvColor.setText(position + 1 + "");
        viewHolder.tvName.setText(contact.getmName());
        viewHolder.tvNumber.setText(contact.getmNumber());

        return convertView;
    }

    public class ViewHolder{
        TextView tvColor;
        TextView tvName;
        TextView tvNumber;
    }
}
