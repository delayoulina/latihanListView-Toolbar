package com.example.android.latihantoolbar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by DYP on 24/03/2017.
 */

public class ListViewAdapter extends BaseAdapter {
    private Context mContext;
    private List<Contact> mContacts;

    public ListViewAdapter(Context mContext, List<Contact> mContacts) {
        this.mContext = mContext;
        this.mContacts = mContacts;
    }

    @Override
    public int getCount() {
        return mContacts.size();
    }

    @Override
    public Object getItem(int i) {
        return mContacts.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Contact contact = mContacts.get(i);

        if (view == null){
            LayoutInflater inflater = LayoutInflater.from(mContext);
            view = inflater.inflate(R.layout.item_list_view, null);
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.image_view);
        TextView txtNama = (TextView) view.findViewById(R.id.tv_nama);
        txtNama.setText(contact.getNama());
        TextView txtNoHp = (TextView) view.findViewById(R.id.tv_noHP);
        txtNoHp.setText(contact.getNoHP());

        return view;
    }
}
