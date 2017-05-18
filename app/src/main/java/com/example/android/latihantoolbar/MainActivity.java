package com.example.android.latihantoolbar;

import android.app.SearchManager;
import android.content.Context;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lvContact;
//    private SearchView searchView;
//    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        getSupportActionBar().setTitle("Findco");
        myToolbar.setSubtitle("Tugas 3");
        myToolbar.setLogo(R.mipmap.ic_launcher_round);

//        textView = (TextView) findViewById(R.id.textView);

        lvContact = (ListView) findViewById(R.id.list_view);
        List<Contact> listContacts = new ArrayList<Contact>();
        Contact c1 = new Contact();
        c1.setNama("Dela Youlina P");
        c1.setNoHP("1202144005");
        c1.setImageURL("https://maxcdn.icons8.com/Share/icon/Operating_Systems//android_os1600.png");

        Contact c2 = new Contact();
        c2.setNama("Mahardika Nila K");
        c2.setNoHP("1202144095");
        c2.setImageURL("https://maxcdn.icons8.com/Share/icon/Operating_Systems//android_os1600.png");

        Contact c3 = new Contact();
        c3.setNama("Satrio Wibowo");
        c3.setNoHP("1202144179");
        c3.setImageURL("https://maxcdn.icons8.com/Share/icon/Operating_Systems//android_os1600.png");

        listContacts.add(c1);
        listContacts.add(c2);
        listContacts.add(c3);

        ListViewAdapter adapter = new ListViewAdapter(this, listContacts);
        lvContact.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.list_view_menu, menu);

//        MenuItem searchItem = menu.findItem(R.id.search);
//        final SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchItem);
//        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener(){
//            @Override
//            public boolean onQueryTextSubmit(String query) {
//                textView.setText("Hasil pencarian Query :" + query);
//
//                searchView.clearFocus();
//                return true;
//            }
//
//            @Override
//            public boolean onQueryTextChange(String newText) {
//                return false;
//            }
//        });
//
//        return super.onCreateOptionsMenu(menu);

//        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
//        searchView = (SearchView) menu.findItem(R.id.search).getActionView();
//        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
//        searchView.setSubmitButtonEnabled(true);
//        searchView.setOnQueryTextListener(this);

        return true;
    }
}
